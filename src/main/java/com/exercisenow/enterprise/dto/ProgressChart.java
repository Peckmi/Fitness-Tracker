package com.exercisenow.enterprise.dto;

import lombok.Data;

import java.util.List;

public @Data
class ProgressChart {
    private int chartID;
    private int userID;
    private List<Workout> weeklyData;
    private List<WeeklyGoal> goalData;

    public void generateChart() {
        // Implementation to generate a progress chart
    }

    public void compareToGoals() {
        // Implementation to compare progress to goals
    }
}
