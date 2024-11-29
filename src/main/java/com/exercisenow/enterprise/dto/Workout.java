package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Data
public class Workout {

    private int workoutID;

    private int userID;

    private String type;

    private double duration; // in minutes

    private String intensity;

    private double caloriesBurned;

    private String weekday;

    private Date date;

    private List<Exercise> exercises = new ArrayList<>();


//    public void addExercise(Exercise exercise) { exercises.add(exercise); }
//
//    public void removeExercise(Exercise exercise) { exercises.remove(exercise); }
}