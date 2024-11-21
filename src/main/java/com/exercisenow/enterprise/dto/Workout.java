package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

public @Data
class Workout {
    private int workoutID;
    private int userID;
    private String type;
    private double duration; // in minutes
    private String intensity;
    private double caloriesBurned;
    private String weekday;
    private Date date;
    private List<Exercise> exercises;

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void removeExercise(Exercise exercise) {
        exercises.remove(exercise);
    }
}
