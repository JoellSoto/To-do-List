package com.ToDoList.ToDoList.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ToDoList.ToDoList.entities.Role;
import com.ToDoList.ToDoList.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	Optional<User> findByEmail(String email);
	
}
