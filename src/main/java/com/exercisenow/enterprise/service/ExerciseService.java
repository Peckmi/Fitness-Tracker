package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.dto.Exercise;
import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.Repository.ExerciseRepository;
import com.exercisenow.enterprise.Repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private WorkoutRepository workoutRepository;


}
