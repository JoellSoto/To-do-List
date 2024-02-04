package com.ToDoList.ToDoList.controller;


import com.ToDoList.ToDoList.entities.ToDo;
import com.ToDoList.ToDoList.services.ToDoService;
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
    public ToDo createTodo(@RequestBody ToDo toDo){
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

    @DeleteMapping("/delete/{todoId}")
    public void  deleteToDo(@PathVariable("todoId") int todoId){
        toDoService.deleteToDO(todoId);
    }

    @PutMapping("/update/{toDoId}")
    public ToDo updateToDo(@PathVariable("toDoId") int toDoId, @RequestBody ToDo toDo){
        return toDoService.UpdateToDo(toDo,toDoId);
    }
}
