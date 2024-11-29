package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.dto.Exercise;
import com.exercisenow.enterprise.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public void saveExercise(Exercise exercise) {
        exerciseRepository.saveExercise(exercise);
    }

    public List<Exercise> getAllExercises() {
        return exerciseRepository.getAllExercises();
    }

    public Exercise getExerciseById(int id) {
        return exerciseRepository.getExerciseById(id);
    }

    public void deleteExercise(int id) {
        exerciseRepository.deleteExercise(id);
    }
}

