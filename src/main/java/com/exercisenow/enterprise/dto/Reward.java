package com.exercisenow.enterprise.dto;


import lombok.Data;


@Data
public class Reward {

    private int rewardID;

    private String description;

    private String goalToAchieve;

    private double requiredProgress;

    // Function to decide whether or not the user is eligible for the reward
    public Boolean checkRewardEligibility(double progress) { return progress >= requiredProgress; }
}
