package com.exercisenow.enterprise.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutID;
    @Column
    private int userID;
    @Column
    private String type;
    @Column
    private double duration; // in minutes
    @Column
    private String intensity;
    @Column
    private double caloriesBurned;
    @Column
    private String weekday;
    @Column
    private Date date;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exercise> exercises;

    public void addExercise(Exercise exercise) { exercises.add(exercise); }

    public void removeExercise(Exercise exercise) { exercises.remove(exercise); }
}
