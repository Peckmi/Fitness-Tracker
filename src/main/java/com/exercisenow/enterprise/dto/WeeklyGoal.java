package com.exercisenow.enterprise.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
@Entity
public @Data
@Table
class WeeklyGoal {
    @Id
    private int goalID;
    @Column
    private int userID;
    @Column
    private double targetCalories;
    @Column
    private int targetWorkouts;
    @Column
    private double targetDuration;
    @Column
    private double totalCalories;
    @Column
    private int totalWorkouts;
    @Column
    private double totalDuration;
    @Column
    private double caloriePercentage;
    @Column
    private int workoutPercentage;
    @Column
    private double durationPercentage;
    @Column
    private List<Workout> currentWorkouts;

    public void updateProgress(double calories, int workouts, double duration) {
        totalCalories += calories;
        totalWorkouts += workouts;
        totalDuration += duration;
        checkGoalCompletion();
    }

    public void checkGoalCompletion() {
        caloriePercentage = (totalCalories / targetCalories) * 100;
        workoutPercentage = (totalWorkouts / targetWorkouts) * 100;
        durationPercentage = (totalDuration / targetDuration) * 100;
    }

    public void addWorkout(Workout workout) { currentWorkouts.add(workout); }

    public void removeWorkout(Workout workout) { currentWorkouts.remove(workout); }

    public void generateProgressChart() {
        // Implementation to generate a progress chart
    }
}
