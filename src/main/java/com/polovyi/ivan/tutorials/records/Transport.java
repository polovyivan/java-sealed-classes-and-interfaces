package com.polovyi.ivan.tutorials.records;

public sealed interface Transport permits Starship {
    boolean canTravelToTheMoon();
}
