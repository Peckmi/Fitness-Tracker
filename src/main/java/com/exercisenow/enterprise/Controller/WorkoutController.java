package com.exercisenow.enterprise.Controller;

import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
        Workout savedWorkout = workoutService.createWorkout(workout);
        return new ResponseEntity<>(savedWorkout, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workout> getWorkoutById(@PathVariable int id) {
        return workoutService.getWorkoutById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkout(@PathVariable int id) {
        workoutService.deleteWorkoutById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
