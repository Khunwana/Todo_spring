package com.devkhunwana.springboot.toDoApp.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	//login
	@RequestMapping("login")
	public String gotoLoginPage()
	{

		return "login";
	}
}
