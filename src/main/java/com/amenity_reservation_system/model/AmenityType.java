package com.amenity_reservation_system.model;

public enum AmenityType {
    GAME_ROOM("Game Room"), ROOF_TOP("Roof Top Area"), THEATER("Theater Room");

    private final String name;

    private AmenityType(String value) {
        name = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
