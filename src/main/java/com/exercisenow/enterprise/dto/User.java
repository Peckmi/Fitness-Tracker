package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.List;

public @Data
class User {
    private int userID;
    private String username;
    private String email;
    private String password;
    private int age;
    private double weight;
    private double height;
    private List<WeeklyGoal> weeklyGoals;
    private WorkoutRegimen currentRegimen;
    private List<Reward> rewards;

    public void login() {
        // Implementation for user login
    }

    public void viewProgress() {
        // Implementation for viewing progress
    }

    public void updateProfile() {
        // Implementation for updating user profile
    }

    public void viewRewards() {
        // Implementation for viewing rewards
    }

    public void setWeeklyGoal(WeeklyGoal goal) {
        this.weeklyGoals.add(goal);
    }

    public void trackWorkout(Workout workout) {
        if (currentRegimen != null) {
            currentRegimen.addExercise(workout);
        }
    }
}
