package com.example.demo.todoitem;

public class TodoItem {
    private int itemId;
    private String description;
    private boolean isCompleted;
    private String listId;

    public int getItemId() {
        return itemId;
    }


    public boolean getIsCompleted() {
        return isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public String getListId() {
        return listId;
    }

    public void setIsCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }
}
