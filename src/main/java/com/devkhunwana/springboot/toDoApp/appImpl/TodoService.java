package com.devkhunwana.springboot.toDoApp.appImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.base.Predicate;

import jakarta.validation.Valid;

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
	
	public void deleteById(int id)
	{
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
		
	}
	

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);		
	}
	
	
}
