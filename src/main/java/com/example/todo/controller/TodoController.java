package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.model.Todo;
import com.example.todo.model.dto.CreateTodoDto;
import com.example.todo.model.dto.UpdateTodoDto;
import com.example.todo.service.TodoService;

import jakarta.validation.Valid;

@RestController
public class TodoController {

  @Autowired
  private TodoService todoService;

  @GetMapping("/healthcheck")
  String healthcheck() {
    return "OK";
  }

  @GetMapping("/todos")
  List<Todo> getAll() {
    return todoService.getAll();
  }

  @GetMapping("/todos/{id}")
  Todo getOne(@PathVariable int id) {
    return todoService.getOne(id);
  }

  @PostMapping("/todos")
  Todo create(@Valid @RequestBody CreateTodoDto body) {
    return todoService.create(body.getName(), body.getIsDone());
  }

  @PutMapping("/todos/{id}")
  Todo create(@PathVariable int id, @Valid @RequestBody UpdateTodoDto body) {
    return todoService.update(id, body.getName(), body.getIsDone());
  }

  @DeleteMapping("/todos/{id}")
  Todo create(@PathVariable int id) {
    return todoService.delete(id);
  }
}
