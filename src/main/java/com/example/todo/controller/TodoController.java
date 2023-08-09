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
import com.example.todo.service.TodoService;

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
  Todo create(@RequestBody Todo todo) {
    return todoService.create(todo.getName(), todo.getIsDone());
  }

  @PutMapping("/todos/{id}")
  Todo create(@PathVariable int id, @RequestBody Todo todo) {
    boolean isDone = todo.getIsDone();
    return todoService.update(id, todo.getName(), isDone);
  }

  @DeleteMapping("/todos/{id}")
  Todo create(@PathVariable int id) {
    return todoService.delete(id);
  }
}
