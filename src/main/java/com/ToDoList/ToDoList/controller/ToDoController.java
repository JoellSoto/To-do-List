package com.ToDoList.ToDoList.controller;


import com.ToDoList.ToDoList.entities.ToDo;
import com.ToDoList.ToDoList.records.ToDoRecord;
import com.ToDoList.ToDoList.services.ToDoService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins="*")
@RequestMapping("/api/v1/user/todo")
public class ToDoController {

    private final ToDoService toDoService;

    @PostMapping("/create")
    public ToDo createTodo(@RequestBody ToDoRecord toDo){
        return toDoService.createToDo(toDo);
    }

    @GetMapping("/get-all")
    public List<ToDo> getAllToDo(){
        return  toDoService.getAllToDo();
    }

    @GetMapping ("/get/{todoId}")
    public  ToDo getTodo(@PathVariable("todoId") int todoId){
        return toDoService.getToDo(todoId);
    }

    @GetMapping("/get")
    public List<ToDo> getByStatus(@PathParam("status") boolean status){
        return  toDoService.getByStatus(status);
    }

    @DeleteMapping("/delete/{todoId}")
    public void  deleteToDo(@PathVariable("todoId") int todoId){
        toDoService.deleteToDO(todoId);
    }

    @PutMapping("/update/{toDoId}")
    public ToDo updateToDo(@PathVariable("toDoId") int toDoId, @RequestBody ToDo toDo){
        return toDoService.UpdateToDo(toDo,toDoId);
    }
}
