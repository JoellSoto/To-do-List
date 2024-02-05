package com.ToDoList.ToDoList.repositories;

import com.ToDoList.ToDoList.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Integer> {
    List<ToDo> findByIsCompleted(Boolean isCompleted);
}
