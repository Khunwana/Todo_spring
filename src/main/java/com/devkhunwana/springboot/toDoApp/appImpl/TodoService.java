package com.devkhunwana.springboot.toDoApp.appImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static ArrayList<Todo> todos= new ArrayList<Todo>();;
	private static int todoCount = 0;

	static {
		
		todos.add(new Todo(++todoCount,"Monias", "master Springboot",LocalDate.now().plusMonths(1),false));
		todos.add(new Todo(++todoCount,"Monias", "master SpringSecurity",LocalDate.now().plusMonths(1),false));
		todos.add(new Todo(++todoCount,"Monias", "master FullStack dev",LocalDate.now().plusMonths(1),false));
	}
	
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
	
	public void addnewTodo(String username, String description, LocalDate targetDate, boolean done)
	{
		todos.add(new Todo(++todoCount,username,description,targetDate,done));
	}
}
