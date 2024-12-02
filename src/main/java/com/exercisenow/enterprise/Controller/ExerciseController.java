package com.exercisenow.enterprise.Controller;

import com.exercisenow.enterprise.dto.Exercise;
import com.exercisenow.enterprise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    // Endpoint to add exercise
    @PostMapping
    public ResponseEntity<String> addExercise(@RequestBody Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return ResponseEntity.ok("Exercise added successfully. Navigate to /api/exercise to view all exercises.");
    }

    // Endpoint to get all exercises
    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises() {
        List<Exercise> exercises = exerciseService.getAllExercises();
        return ResponseEntity.ok(exercises);
    }

    // Endpoint to get an exercise by its id
    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable int id) {
        Exercise exercise = exerciseService.getExerciseById(id);
        return ResponseEntity.ok(exercise);
    }

    // Endpoint to delete an exercise using its id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExercise(@PathVariable int id) {
        exerciseService.deleteExercise(id);
        return ResponseEntity.ok("Exercise deleted successfully. Navigate to /api/exercise to view remaining exercises.");
    }

    // Endpoint to add an exercise page
    @GetMapping("/add")
    public ResponseEntity<String> addExercisePage() {
        return ResponseEntity.ok("Navigate to /api/exercise/add (Frontend page not implemented).");
    }
}
