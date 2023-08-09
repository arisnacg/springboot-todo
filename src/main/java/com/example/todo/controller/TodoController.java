package com.example.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
  @GetMapping("/healthcheck")
  String healthcheck() {
    return "OK";
  }
}
