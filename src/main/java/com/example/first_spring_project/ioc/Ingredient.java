package com.example.first_spring_project.ioc;

public abstract class Ingredient {
    private String name;

    public String getName() {
        return name;
    }

    public Ingredient(String name) {
        this.name = name;
    }
}
