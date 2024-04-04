package com.example.demo.todoitem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("todoItem")
public class TodoItemUiController {
    List<TodoItem> todos = new ArrayList<>();
    @GetMapping("{id}")
    public String showTodoItem(Model model, @PathVariable("id") int id) {
        boolean found = false;
        for (var item: todos) {
            if (item.getItemId() == id) {
                model.addAttribute("todoItem", item);
                found = true;
            }
        }
        if (!found) {
            model.addAttribute("todoItem", new TodoItem());
        }
        return "todoItem";
    }

    @GetMapping("add")
    public String add(Model model) {
        TodoItem todoItem = new TodoItem();
        model.addAttribute("newTodoItem", todoItem);
        return "newTodo";
    }

    private int currId = 1;
    @PostMapping("addTodo")
    public String addTodo(@ModelAttribute("newTodoItem") TodoItem newTodoItem) {
        System.out.println(newTodoItem);
        newTodoItem.setItemId(currId);
        newTodoItem.setIsCompleted(false);
        todos.add(newTodoItem);
        currId++;
        return "redirect:/todoItem/"+(currId-1);
    }


}
