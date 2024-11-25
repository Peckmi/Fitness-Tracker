package com.exercisenow.enterprise.dto;

import lombok.Data;

public @Data
class Reward {
    private int rewardID;
    private String description;
    private String goalToAchieve;
    private double requiredProgress;

    public Boolean checkRewardEligibility(double progress) { return progress >= requiredProgress; }
}
