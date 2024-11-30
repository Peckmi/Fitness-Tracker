package com.exercisenow.enterprise;

import com.exercisenow.enterprise.Repository.WorkoutRepository;
import com.exercisenow.enterprise.dto.Workout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class WorkoutRepositoryTest {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Test
    public void testSaveWorkout() {
        Workout workout = new Workout();
        workout.setType("Cardio");
        workout.setDuration(30);
        workout.setIntensity("High");
        workout.setCaloriesBurned(300);
        workout.setWeekday("Monday");

        Workout savedWorkout = workoutRepository.saveWorkout(workout);
        assertNotNull(savedWorkout.getWorkoutID());
    }
    @Test
    public void testGetAllWorkouts() {
        List<Workout> workouts = workoutRepository.getAllWorkouts();
        System.out.println("Fetched workouts: " + workouts);
        Assertions.assertFalse(workouts.isEmpty(), "No workouts found in database");
    }

    @Test
    public void testFetchAllWorkouts() {
        List<Workout> workouts = workoutRepository.getAllWorkouts().stream().toList();
        assertFalse(workouts.isEmpty());
    }
}
