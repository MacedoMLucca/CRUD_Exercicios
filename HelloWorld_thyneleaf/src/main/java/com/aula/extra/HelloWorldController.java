package com.aula.extra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController{
	
	@GetMapping("/registro")
	public String hello(Model model){
		model.addAttribute("message","Hello World");
		return "helloworld";
		
	}
	
	@GetMapping("/estilo")
	public String estilo(){
		return "add-demo";
	}
}
