package com.exercisenow.enterprise.dto;

import lombok.Data;

public @Data
class Exercise {
    private int exerciseID;
    private String name;
    private String type; // e.g., cardio, strength
    private double duration; // in minutes
    private double goalCaloriesBurned;

    public void addToRegimen(WorkoutRegimen regimen) {
        // Implementation to add exercise to regimen
    }

    public void removeFromRegimen(WorkoutRegimen regimen) {
        // Implementation to remove exercise from regimen
    }
}
