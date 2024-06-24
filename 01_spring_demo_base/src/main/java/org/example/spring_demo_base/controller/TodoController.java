package org.example.spring_demo_base.controller;

import org.example.spring_demo_base.model.Todo;
import org.example.spring_demo_base.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {
    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/todo")
    public String getOneTodo(Model model) {
        Todo todo = todoService.getOneTodo();
        model.addAttribute("todo", todo);
        return "todo/details";
    }

    @GetMapping("/todos")
    @ResponseBody
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

}
