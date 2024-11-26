package com.exercisenow.enterprise.dto;
//import javax.persistence.*;
import lombok.Data;

public @Data
class Exercise {

    private int exerciseID;

    private String name;

    private String type; // e.g., cardio, strength

    private double duration; // in minutes

    private double goalCaloriesBurned;
}
