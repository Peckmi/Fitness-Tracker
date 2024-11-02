package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.Date;

public @Data
class Workout {
    private int workoutID;
    private int userID;
    private String type;
    private double duration; // in minutes
    private String intensity;
    private double caloriesBurned;
    private Date date;

    public void logWorkout() {
        // Implementation for logging workout
    }

    public void calculateCalories() {
        // Implementation for calculating calories burned
    }
}
