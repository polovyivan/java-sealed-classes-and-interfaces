package com.polovyi.ivan.tutorials.records;

public record Starship() implements Transport {
    @Override
    public boolean canTravelToTheMoon() {
        return true;
    }
}
