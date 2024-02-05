package com.ToDoList.ToDoList.services;

import com.ToDoList.ToDoList.entities.ToDo;
import com.ToDoList.ToDoList.records.ToDoRecord;

import java.util.List;

public interface ToDoService {

    public ToDo createToDo(ToDoRecord toDo);
    public ToDo UpdateToDo (ToDo toDo, int toDoid);
    public List<ToDo> getAllToDo();
    public ToDo getToDo(int toDoId);
    List<ToDo> getByStatus(boolean status);
    public void deleteToDO(int toDoId);
}
