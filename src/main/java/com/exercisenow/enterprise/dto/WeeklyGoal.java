package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.List;

public @Data
class WeeklyGoal {
    private int goalID;
    private int userID;
    private double targetCalories;
    private int targetWorkouts;
    private double targetDuration;
    private double totalCalories;
    private int totalWorkouts;
    private double totalDuration;
    private double caloriePercentage;
    private int workoutPercentage;
    private double durationPercentage;
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

    public void addWorkout(Workout workout) {
        currentWorkouts.add(workout);
    }

    public void removeWorkout(Workout workout) {
        currentWorkouts.remove(workout);
    }

    public void generateProgressChart() {
        // Implementation to generate a progress chart
    }
}
