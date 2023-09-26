package br.com.henriquebenjamim.todolistjava.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.henriquebenjamim.todolistjava.entities.Todo;
import br.com.henriquebenjamim.todolistjava.services.TodoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {
  
  public TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @PostMapping
  List<Todo> create(@RequestBody @Valid Todo todo) {
    return todoService.create(todo);
  }

  @GetMapping
  List<Todo> list() {
    return todoService.list();
  }

  @PutMapping("{id}")
  List<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
    return todoService.update(todo);
  }

  @DeleteMapping("{id}")
  List<Todo> delete(@PathVariable("id") Long todoId) {
    return todoService.delete(todoId);
  }
}
