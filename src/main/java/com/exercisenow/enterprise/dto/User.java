package com.exercisenow.enterprise.dto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private int age;

    @Column
    private double weight;

    @Column
    private double height;

    private List<WeeklyGoal> weeklyGoals;

    private WorkoutRegimen currentRegimen;

    private List<Reward> rewards;

    @Column
    private int currentWeek;



    public void viewProgress() {
        weeklyGoals.get(currentWeek).checkGoalCompletion();
    }

    public void updateProfile(String username , String email, String password, int age, double weight, double height) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public void addReward(Reward reward) { rewards.add(reward); }

    public void addWeeklyGoal(WeeklyGoal goal) {
        weeklyGoals.add(goal);
    }

    public void trackWorkout(Workout workout) { currentRegimen.addWorkout(workout); }

    public void removeReward(Reward reward) { rewards.remove(reward); }

    public void removeWeeklyGoal(WeeklyGoal goal) { weeklyGoals.remove(goal); }

    public void removeWorkout(Workout workout) { currentRegimen.removeWorkout(workout); }
}
