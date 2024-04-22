package com.devkhunwana.springboot.toDoApp.appImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static ArrayList<Todo> todos;
	
	static {
		todos= new ArrayList<Todo>();
		todos.add(new Todo(1,"Monias", "master Springboot",LocalDate.now().plusMonths(1),false));
		todos.add(new Todo(2,"Monias", "master SpringSecurity",LocalDate.now().plusMonths(1),false));
		todos.add(new Todo(3,"Monias", "master FullStack dev",LocalDate.now().plusMonths(1),false));
	}
	
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
}
