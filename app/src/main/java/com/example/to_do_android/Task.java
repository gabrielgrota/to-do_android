package com.example.to_do_android;

public class Task {

    private String text;
//    private String id;
    private boolean isCompleted;

    public Task() {}

    public Task(String text) {
        this.text = text;
        this.isCompleted = false;
    }

    public String getText() {
        return text;
    }

    public void setText(String description) {
        this.text = text;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public boolean isCompleted() { return isCompleted; }

    public void setCompleted(boolean completed) { isCompleted = completed; }
}