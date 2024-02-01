package com.in28minutes.springboot.myfirstwebapp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class SayHelloNameController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	// src/main/resources/META-INF/resources/WEB-INF/jsp/sayHelloName.jsp
	@RequestMapping("sayHelloName")
	public String sayHelloNamePage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		
		logger.debug("Request param is {}", name);
		logger.info("I want this printed at info level");
		logger.warn("I want this printed at warn level");
		
		return "sayHelloName";
	}
}
