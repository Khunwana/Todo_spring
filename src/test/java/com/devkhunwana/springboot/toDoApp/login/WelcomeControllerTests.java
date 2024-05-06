package com.devkhunwana.springboot.toDoApp.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WelcomeControllerTests {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
		
	@Test
	public void checkLogin() throws Exception
	{
		ResponseEntity<String> response = restTemplate
				.withBasicAuth("monias", "1234")
				.getForEntity("/login", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}
