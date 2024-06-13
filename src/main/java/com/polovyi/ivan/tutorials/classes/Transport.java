package com.polovyi.ivan.tutorials.classes;


public abstract sealed class Transport permits Car, Bus, Ship {

    private int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
}
