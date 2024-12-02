package com.exercisenow.enterprise.Controller;

import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    // Endpoint to show all workouts
    @GetMapping
    public String showWorkouts(Model model) {
        List<Workout> workouts = workoutService.getAllWorkouts();
        model.addAttribute("workouts", workouts);
        return "workouts";
    }

    // Endpoint to get a workout by its id
    @GetMapping("/{id}")
    public String getWorkoutById(@PathVariable int id, Model model) {
        Workout workout = workoutService.getWorkoutById(id);
        model.addAttribute("workout", workout);
        return "workoutDetails";
    }

    // Endpoint to create a workout
    @PostMapping
    public String createWorkout(@ModelAttribute Workout workout) {
        workoutService.createWorkout(workout);
        return "redirect:/workouts";
    }

    // Endpoint to delete a workout using its id
    @DeleteMapping("/{id}")
    public String deleteWorkout(@PathVariable int id) {
        workoutService.deleteWorkoutById(id);
        return "redirect:/workouts";
    }
}
