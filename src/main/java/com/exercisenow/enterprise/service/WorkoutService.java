package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.Repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public void saveWorkout(Workout workout) {
        workoutRepository.save(workout);
    }
    public Optional<Workout> getWorkoutById(int id) {
        return workoutRepository.findById(id);
    }

    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }
}
