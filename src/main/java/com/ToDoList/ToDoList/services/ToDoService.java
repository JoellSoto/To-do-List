package com.ToDoList.ToDoList.services;

import com.ToDoList.ToDoList.entities.ToDo;

import java.util.List;

public interface ToDoService {

    public ToDo createToDo(ToDo toDo);
    public ToDo UpdateToDo (ToDo toDo, int toDoid);
    public List<ToDo> getAllToDo();
    public ToDo getToDo(int toDoId);
    public void deleteToDO(int toDoId);
}
