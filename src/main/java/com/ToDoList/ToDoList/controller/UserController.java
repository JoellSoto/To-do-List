package com.ToDoList.ToDoList.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@CrossOrigin(origins="*")
public class UserController {

	
	@GetMapping("/hello")
	public ResponseEntity<String> getHello(){
		return ResponseEntity.ok("Hello user!");
	}
	
}
