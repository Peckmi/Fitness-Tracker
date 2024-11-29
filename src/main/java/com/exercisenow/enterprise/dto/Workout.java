package com.exercisenow.enterprise.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "workouts")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutID;

    private int userID;

    private String type;

    private double duration; // in minutes

    private String intensity;

    private double caloriesBurned;

    private String weekday;

    private Date date;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exercise> exercises = new ArrayList<>();
//
//    public void addExercise(Exercise exercise) { exercises.add(exercise); }
//
//    public void removeExercise(Exercise exercise) { exercises.remove(exercise); }
}