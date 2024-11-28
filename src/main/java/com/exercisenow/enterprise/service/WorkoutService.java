package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.Repository.WorkoutRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Transactional
    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    @Transactional
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @Transactional
    public Optional<Workout> getWorkoutById(int id) {
        return workoutRepository.findById(id);
    }
}
