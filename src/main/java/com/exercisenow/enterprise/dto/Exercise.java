package com.exercisenow.enterprise.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Exercise")
@Data
public class Exercise {

    @Id
    private int exerciseID;
    @Column
    private String name;
    @Column
    private String type; // e.g., cardio, strength
    @Column
    private double duration; // in minutes
    @Column
    private double goalCaloriesBurned;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id")
    private Workout workout;
}
