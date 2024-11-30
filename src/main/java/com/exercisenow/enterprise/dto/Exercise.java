package com.exercisenow.enterprise.dto;


import lombok.Data;


@Data
public class Exercise {


    private int exerciseID;

    private String name;

    private String type; // e.g., cardio, strength

    private double duration; // in minutes

    private double goalCaloriesBurned;

    private Workout workout;
}
