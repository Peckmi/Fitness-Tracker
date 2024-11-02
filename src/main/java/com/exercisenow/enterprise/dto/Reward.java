package com.exercisenow.enterprise.dto;

import lombok.Data;

public @Data
class Reward {
    private int rewardID;
    private String description;
    private String goalToAchieve;
    private double progressPercentage;

    public void checkRewardEligibility() {
        // Implementation to check eligibility for the reward
    }
}
