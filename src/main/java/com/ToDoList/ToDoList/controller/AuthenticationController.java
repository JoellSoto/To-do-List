package com.ToDoList.ToDoList.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ToDoList.ToDoList.dto.JwtAuthenticationResponse;
import com.ToDoList.ToDoList.dto.RefreshTokenRequest;
import com.ToDoList.ToDoList.dto.SignInRequest;
import com.ToDoList.ToDoList.dto.SignUpRequest;
import com.ToDoList.ToDoList.entities.User;
import com.ToDoList.ToDoList.services.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins="*")
@AllArgsConstructor
public class AuthenticationController {

	private final AuthenticationService authenticationService ;


	
	@PostMapping("/signup")
	public ResponseEntity<User> signUp(@RequestBody SignUpRequest signUpRequest){
		return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
	}
	
	@PostMapping("/signin")
	public ResponseEntity<User> signIn(@RequestBody SignInRequest signInRequest){
		return ResponseEntity.ok(authenticationService.signIn(signInRequest));
	}
	
	@PostMapping("/refresh")
	public ResponseEntity<JwtAuthenticationResponse> refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest){
		return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
	}

	
}
