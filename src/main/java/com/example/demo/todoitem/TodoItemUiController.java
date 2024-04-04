package com.example.demo.todoitem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todoItem")
public class TodoItemUiController {
    @GetMapping
    public String showTodoItem(Model model) {
        TodoItem todoItem = new TodoItem();
        todoItem.itemId = 12;
        todoItem.description = "First Item";
        todoItem.isCompleted = false;
        model.addAttribute("todoItem", todoItem);
        return "todoItem";
    }


}
