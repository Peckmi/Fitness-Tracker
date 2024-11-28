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

    @GetMapping("/createworkout")
    public String showCreateWorkoutPage(Model model) {
        model.addAttribute("workout", new Workout());
        return "createworkout";
    }

    @PostMapping("/list")
    public String createWorkout(@ModelAttribute Workout workout) {
        workoutService.createWorkout(workout);
        return "redirect:/workouts/list";
    }

    @GetMapping("/")
    public String listWorkouts(Model model) {
        List<Workout> workouts = workoutService.getAllWorkouts();
        model.addAttribute("workouts", workouts);
        return "workouts";
    }
}



