package com.devkhunwana.springboot.toDoApp.appImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ToDoControllerTests {
	
	@Mock
	TodoRepository todoRepository;
	
	@InjectMocks
	TodoService todoService;
//	TodoControllerJpa controllerJpa;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	
	@Test
	public void loadListTo_do() throws Exception
	{
		ResponseEntity<String> response = restTemplate
				.withBasicAuth("monias", "1234")
				.getForEntity("/list-todos", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void loadAddTo_do() throws Exception
	{
		ResponseEntity<String> response = restTemplate
				.withBasicAuth("monias", "1234")
				.getForEntity("/add-todo", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void delete_A_ToDo() throws Exception
	{
		ResponseEntity<String> response = restTemplate
				.withBasicAuth("monias", "1234")
				.getForEntity("/delete-todo", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void update_A_ToDo() throws Exception
	{
		ResponseEntity<String> response = restTemplate
				.withBasicAuth("monias", "1234")
				.getForEntity("/update-todo", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}
