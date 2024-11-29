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

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void removeWorkout(Workout workout) {
        workouts.remove(workout);
    }
}
