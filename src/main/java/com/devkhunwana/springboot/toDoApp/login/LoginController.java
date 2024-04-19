package com.devkhunwana.springboot.toDoApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	//login
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model)
	{
//		System.out.println("Request param is "+name);
		logger.debug("Request param {}",name);
		logger.info("Request param {} at info level",name);
		logger.warn("Request param {} at warn level",name);
		model.put("name", name);
		return "login";
	}
}
