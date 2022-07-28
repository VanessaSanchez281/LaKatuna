package org.example.model;

import lombok.Data;

@Data
public class ToDoList {

    private String title;
    private String description;
    private String estado;

    public ToDoList(String title, String description,String estado) {
        this.title = title;
        this.description = description;
        this.estado=estado;
    }
}
