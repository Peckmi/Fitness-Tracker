package com.exercisenow.enterprise.dto;

import lombok.Data;
import java.util.List;

@Data
public class WorkoutRegimen {

    private int regimenID;
    private int userID;

    private List<Workout> workouts;

    private String[] schedule;

    private String notes;

    // Add workout to regimen
    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    // Remove workout from regimen
    public void removeWorkout(Workout workout) {
        workouts.remove(workout);
    }
}
