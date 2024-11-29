package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.Repository.WorkoutRepository;
import com.exercisenow.enterprise.dto.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout createWorkout(Workout workout) {
        return workoutRepository.saveWorkout(workout);
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.getAllWorkouts();
    }

    public Workout getWorkoutById(int id) {
        return workoutRepository.getWorkoutById(id);
    }

    public void deleteWorkoutById(int id) {
        workoutRepository.deleteWorkoutById(id);
    }
}

