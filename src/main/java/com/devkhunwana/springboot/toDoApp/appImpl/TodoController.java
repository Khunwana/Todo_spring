package com.devkhunwana.springboot.toDoApp.appImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

//@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello()
	{
		return "hello! What are you learning today?";
	}
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model)
	{
		String username = getLoggedinUserName(model);
		List<Todo> todos = todoService.findByUsername(username);
		model.addAttribute("todos", todos);
		return "listTodos";
	}


	@RequestMapping(value="add-todo",method = RequestMethod.GET)
	public String addTodos(ModelMap model)
	{
		String username = getLoggedinUserName(model);
		Todo todo = new Todo(0,username,"Default Desc",LocalDate.now().plusYears(1),false);
		model.put("todo",todo);
		return "addTodo";
	}
	
	@RequestMapping(value="add-todo",method = RequestMethod.POST)
	public String submitTodos(@Valid Todo todo, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "addTodo";
		}
		todoService.addnewTodo(todo.getUsername(), todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}

	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id )
	{
		todoService.deleteById(id);		
		return "redirect:list-todos";
	}
	@RequestMapping(value ="update-todo", method= RequestMethod.GET)
	public String showUpdateTodo(ModelMap model,@RequestParam int id )
	{
		Todo todo = todoService.findById(id);
		model.addAttribute("todo", todo);
		return "addTodo";
	}
	
	@RequestMapping(value="update-todo",method = RequestMethod.POST)
	public String updateTodos(ModelMap model,@Valid Todo todo, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "todo";
		}
		
		String username = getLoggedinUserName(model);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		
		return "redirect:list-todos";
	}

	private String getLoggedinUserName(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
}
