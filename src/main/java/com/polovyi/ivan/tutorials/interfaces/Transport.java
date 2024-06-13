package com.polovyi.ivan.tutorials.interfaces;

public sealed interface Transport permits Car, Bus, Ship {
    double generateTicketPrice();
}
