package com.javafsd.azurespringjavafsddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class DemoController {

	@GetMapping("/")
	public String getMessage(){
		return "Congratulations!! We have deployed application in azure environment.";
	}
}
