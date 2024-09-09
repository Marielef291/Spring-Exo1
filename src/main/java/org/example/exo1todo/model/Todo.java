package org.example.exo1todo.model;

public class Todo {
    private String name;
    private String description;
    private boolean idDone;


    public Todo(String name, String description) {
        this.name = name;
        this.description = description;
        this.idDone = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIdDone() {
        return idDone;
    }

    public void setIdDone(boolean idDone) {
        this.idDone = idDone;
    }
}
