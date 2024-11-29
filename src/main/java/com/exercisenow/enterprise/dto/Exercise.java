package com.exercisenow.enterprise.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="exercise")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
