package com.polovyi.ivan.tutorials.classes;

public sealed class Bus extends Transport permits Minivan {
    public Bus(int capacity) {
        super(capacity);
    }
}
