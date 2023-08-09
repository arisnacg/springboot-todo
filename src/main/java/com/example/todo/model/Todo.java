package com.example.todo.model;

public class Todo {
  private int id;
  private String name;
  private boolean isDone;

  public Todo() {
  }

  public Todo(int id, String name, boolean isDone) {
    this.id = id;
    this.name = name;
    this.isDone = isDone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean isDone) {
    this.isDone = isDone;
  }
}
