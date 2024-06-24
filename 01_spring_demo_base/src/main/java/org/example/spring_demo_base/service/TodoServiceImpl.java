package org.example.spring_demo_base.service;

import org.example.spring_demo_base.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Override
    public Todo getOneTodo() {
        Todo todo = new Todo();
        todo.setName("Exemple 1");
        todo.setDescription("un exemple");
        todo.setDone(true);
        return todo;
    }

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        Todo todo1 = new Todo();
        todo1.setName("Exemple 1");
        todo1.setDescription("un exemple");
        todo1.setDone(true);

        Todo todo2 = new Todo();
        todo2.setName("Exemple 2");
        todo2.setDescription("un exemple");
        todo2.setDone(false);

        todos.add(todo1);
        todos.add(todo2);
        return todos;
    }
}
