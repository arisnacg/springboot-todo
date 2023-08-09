package com.example.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todo.model.Todo;

@Service
public class TodoService {
  private List<Todo> todos = new ArrayList<>();

  public TodoService() {
    this.todos.add(new Todo(1, "Eat", false));
    this.todos.add(new Todo(2, "Drink", true));
  }

  public List<Todo> getAll() {
    return this.todos;
  }

  public Todo getOne(int id) {
    for (Todo todo : this.todos) {
      if (todo.getId() == id) {
        return todo;
      }
    }
    return null;
  }

  public Todo create(String name, boolean isDone) {
    int id = this.todos.size() + 1;
    Todo newTodo = new Todo(id, name, isDone);
    this.todos.add(newTodo);
    return newTodo;
  }

  public Todo update(int id, String name, boolean isDone) {
    for (int i = 0; i < this.todos.size(); i++) {
      Todo todo = this.todos.get(i);
      if (todo.getId() == id) {
        todo.setName(name);
        todo.setIsDone(isDone);
        this.todos.set(i, todo);
        return todo;
      }
    }
    return null;
  }

  public Todo delete(int id) {
    for (int i = 0; i < this.todos.size(); i++) {
      Todo todo = this.todos.get(i);
      if (todo.getId() == id) {
        this.todos.remove(i);
        return todo;
      }
    }
    return null;
  }

}
