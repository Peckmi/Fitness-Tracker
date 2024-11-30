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

    @PostMapping
    public ResponseEntity<String> addExercise(@RequestBody Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return ResponseEntity.ok("Exercise added successfully. Navigate to /api/exercise to view all exercises.");
    }


    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises() {
        List<Exercise> exercises = exerciseService.getAllExercises();
        return ResponseEntity.ok(exercises);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable int id) {
        Exercise exercise = exerciseService.getExerciseById(id);
        return ResponseEntity.ok(exercise);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExercise(@PathVariable int id) {
        exerciseService.deleteExercise(id);
        return ResponseEntity.ok("Exercise deleted successfully. Navigate to /api/exercise to view remaining exercises.");
    }


    @GetMapping("/add")
    public ResponseEntity<String> addExercisePage() {
        return ResponseEntity.ok("Navigate to /api/exercise/add (Frontend page not implemented).");
    }
}
