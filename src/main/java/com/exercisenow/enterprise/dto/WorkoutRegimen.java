package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.List;

public @Data
class WorkoutRegimen {
    private int regimenID;
    private int userID;
    private List<Workout> exercises;
    private String[] schedule;
    private String notes;

    public void addExercise(Workout workout) {
        exercises.add(workout);
    }

    public void removeExercise(Workout workout) {
        exercises.remove(workout);
    }

    public void viewRegimen() {
        // Implementation for viewing the workout regimen
    }
}
