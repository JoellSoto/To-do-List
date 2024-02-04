package com.ToDoList.ToDoList.controller;

import java.util.List;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ToDoList.ToDoList.entities.Roles;
import com.ToDoList.ToDoList.entities.User;
import com.ToDoList.ToDoList.services.RoleService;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

@RequestMapping("/api/v1/roles")
@RestController
@CrossOrigin(origins="*")
@AllArgsConstructor
public class RolesController {

	private final RoleService roleService;


	@GetMapping("/all")
	public ResponseEntity<List<Roles>> getAllRoles(){
		return  ResponseEntity.ok(roleService.getAllRoles());
	}
	@PostMapping("/remove-all-users-from-role/{id}")
	public Roles removeAllUsersFromRole(@PathVariable("id") int roleId) {
		return roleService.removeAllUserFromRole(roleId);
	}
	
	@PostMapping("/remove-user-from-role")
	public ResponseEntity<User>removeUserToRole(@PathParam("userId") int userId, @PathParam("roleId") int roleId){
		return ResponseEntity.ok(roleService.removeUserFromRole(userId, roleId));
	}
	
	@PostMapping("/assign-user-to-role")
	public ResponseEntity<User>assignUserToRole(@PathParam("userId") int userId, @PathParam("roleId") int roleId){
		return ResponseEntity.ok(roleService.assignUserToRole(userId, roleId));
	}
}
