package com.devkhunwana.springboot.toDoApp.appImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.validation.Valid;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
	public List<Todo> findByUsername(String username);

}
