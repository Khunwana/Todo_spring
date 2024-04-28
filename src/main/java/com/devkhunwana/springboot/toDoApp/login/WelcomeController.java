package com.devkhunwana.springboot.toDoApp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	//Welcome
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(ModelMap model)
	{
		model.put("name", "Khunwana");
		return "welcome";
	}
}
