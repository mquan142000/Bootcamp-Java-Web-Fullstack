package com.codegym;

public class Taxi {
    private String name;

    public Taxi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi: " + name;
    }
}
