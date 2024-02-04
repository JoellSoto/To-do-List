package com.ToDoList.ToDoList.services.impl;

import com.ToDoList.ToDoList.entities.ToDo;
import com.ToDoList.ToDoList.exceptions.ResourceNotFoundException;
import com.ToDoList.ToDoList.repositories.ToDoRepository;
import com.ToDoList.ToDoList.services.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ToDoServiceImpl implements ToDoService {

    private final ToDoRepository toDoRepository;
    public ToDo createToDo(ToDo toDo) {return  toDoRepository.save(toDo);}

    public ToDo getToDo(int toDoId){
        ToDo toDo=toDoRepository.findById(toDoId).orElseThrow(()->new ResourceNotFoundException("ToDo get", HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.name() , "Error! No data found"));
      return  toDo;
    }

    public ToDo UpdateToDo(ToDo toDo, int toDoId){
        ToDo oldToDo=toDoRepository.findById(toDoId).orElseThrow(()->new ResourceNotFoundException("ToDo Update", HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.name() , "Error! failed to update"));
        oldToDo.setTask(toDo.getTask());
        oldToDo.setCompleted(toDo.getIsCompleted());
        toDoRepository.save(oldToDo);
        return  oldToDo;
    }
    public List<ToDo> getAllToDo(){
        return  toDoRepository.findAll(Sort.by("task").ascending());
    }

    public void deleteToDO(int toDoId){
       toDoRepository.deleteById(toDoId);
    }


}
