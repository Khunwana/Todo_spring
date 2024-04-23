package com.devkhunwana.springboot.toDoApp.appImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String addTodos()
	{
//		List<Todo> todos = todoService.findByUsername("Monias");
//		model.addAttribute("todos", todos);
		return "addTodo";
	}
	
	@RequestMapping(value="add-todo",method = RequestMethod.POST)
	public String submitTodos(@RequestParam String username,@RequestParam String description)
	{
//		List<Todo> todos = todoService.findByUsername("Monias");
//		model.addAttribute("todos", todos);\
		todoService.addnewTodo(username, description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
	
}
