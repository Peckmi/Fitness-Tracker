package com.exercisenow.enterprise.dto;
import lombok.Data;

import java.util.List;

@Data
public class User {
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

    private int currentWeek;

    // View user's progress
    public void viewProgress() {
        weeklyGoals.get(currentWeek).checkGoalCompletion();
    }

    // Update user's profile
    public void updateProfile(String username , String email, String password, int age, double weight, double height) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    // Add reward to user's rewards
    public void addReward(Reward reward) { rewards.add(reward); }

    // Add goal to user's weekly goals
    public void addWeeklyGoal(WeeklyGoal goal) { weeklyGoals.add(goal); }

    // Add a workout to user's regimen
    public void trackWorkout(Workout workout) { currentRegimen.addWorkout(workout); }

    // Remove a reward from user's rewards
    public void removeReward(Reward reward) { rewards.remove(reward); }

    // Remove a goal from user's weekly goals
    public void removeWeeklyGoal(WeeklyGoal goal) { weeklyGoals.remove(goal); }

    // Remove a workout from user's regimen
    public void removeWorkout(Workout workout) { currentRegimen.removeWorkout(workout); }
}
