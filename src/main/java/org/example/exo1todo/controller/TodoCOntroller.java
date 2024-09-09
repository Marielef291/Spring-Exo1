package org.example.exo1todo.controller;

import org.example.exo1todo.model.Todo;
import org.example.exo1todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoCOntroller {

    private TodoService todoService;
    private List<Todo> todos = List.of(new Todo("Coder Java", "faire un code java potable"),new Todo("Coder Python", "finir le code Pyhton"));


    @Autowired
    public TodoCOntroller(TodoService todoService){
        this.todoService=todoService;
    }

    @RequestMapping("/todo")
    public String getOneTodo(Model model){
        model.addAttribute("todo", todos.get(1));
        return "todo";
    }

    @RequestMapping("/allTodo")
    public String getAllTodo(Model model){
        model.addAttribute("todos", todos);
        return "allTodo";
    }


    @RequestMapping("/")
    public String home() {
        return "hello";
    }
}
