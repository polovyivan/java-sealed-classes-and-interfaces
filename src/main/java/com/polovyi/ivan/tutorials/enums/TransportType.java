package com.polovyi.ivan.tutorials.enums;

public enum TransportType implements Transport {

    CAR,
    BUS;

    @Override
    public boolean hasWheels() {
        return true;
    }
}
