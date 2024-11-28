package com.exercisenow.enterprise.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="Reward")
public class Reward {
    @Id
    private int rewardID;
    @Column
    private String description;
    @Column
    private String goalToAchieve;
    @Column
    private double requiredProgress;

    public Boolean checkRewardEligibility(double progress) { return progress >= requiredProgress; }
}
