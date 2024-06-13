package com.polovyi.ivan.tutorials.enums;

public sealed   interface Transport permits TransportType {
    boolean hasWheels();
}
