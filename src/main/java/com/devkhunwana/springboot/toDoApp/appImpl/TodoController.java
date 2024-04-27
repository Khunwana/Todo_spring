package com.devkhunwana.springboot.toDoApp.appImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoService todoService;
	

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model)
	{
		List<Todo> todos = todoService.findByUsername("Monias");
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	@RequestMapping(value="add-todo",method = RequestMethod.GET)
	public String addTodos(ModelMap model)
	{
		String username = (String)model.get("name");
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
//		List<Todo> todos = todoService.findByUsername("Monias");
//		model.addAttribute("todos", todos);\
		todoService.addnewTodo(todo.getUsername(), todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id )
	{
		todoService.deleteById(id);		
		return "redirect:list-todos";
	}

	
}
