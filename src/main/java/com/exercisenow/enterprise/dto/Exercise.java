package com.exercisenow.enterprise.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
public @Data
@Table(name="Exercise")
class Exercise {

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
}
