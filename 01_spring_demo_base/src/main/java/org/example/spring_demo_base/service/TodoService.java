package org.example.spring_demo_base.service;

import org.example.spring_demo_base.model.Todo;

import java.util.List;

public interface TodoService {
    Todo getOneTodo();
    List<Todo> getAllTodos();
}
