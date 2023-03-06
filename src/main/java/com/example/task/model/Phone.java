package com.example.task.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Phone {
    private int id;
    private String name;
    private boolean isAvailable = true;
    private Date bookedAt;
    private String user;

    public Phone(int id, String name) {
        this.id = id;
        this.name = name;
    }
}