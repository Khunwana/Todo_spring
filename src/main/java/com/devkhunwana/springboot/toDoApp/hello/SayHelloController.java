package com.devkhunwana.springboot.toDoApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"say-hello" -> "Hello! What are you learning today"
	
	//say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello()
	{
		return "hello! What are you learning today?";
	}
	
	//say-hello-html
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First Html Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>My First Html page with body</H1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
}
