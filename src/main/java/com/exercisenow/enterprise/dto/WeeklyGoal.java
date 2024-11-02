package com.exercisenow.enterprise.dto;

import lombok.Data;

public @Data
class WeeklyGoal {
    private int goalID;
    private int userID;
    private double targetCalories;
    private int targetWorkouts;
    private double targetDuration;
    private double currentCalories;
    private int currentWorkouts;
    private double currentDuration;
    private double progressPercentage;

    public void updateProgress(double calories, int workouts, double duration) {
        currentCalories += calories;
        currentWorkouts += workouts;
        currentDuration += duration;
        checkGoalCompletion();
    }

    public void checkGoalCompletion() {
        // Implementation for checking goal completion
        progressPercentage = (currentCalories / targetCalories) * 100; // Example calculation
    }
}
