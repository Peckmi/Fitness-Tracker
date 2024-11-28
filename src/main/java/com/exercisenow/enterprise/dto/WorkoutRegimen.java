package com.exercisenow.enterprise.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class WorkoutRegimen {
    @Id
    private int regimenID;
    @Column
    private int userID;
    @Column
    private List<Workout> workouts;
    @Column
    private String[] schedule;
    @Column
    private String notes;

    @Column
    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    @Column
    public void removeWorkout(Workout workout) {
        workouts.remove(workout);
    }
}
