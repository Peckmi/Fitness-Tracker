package com.exercisenow.enterprise;

import com.exercisenow.enterprise.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WorkoutServiceTest {

    @Autowired
    private WorkoutService workoutService;
}

//    @Test
//    public void testCreateAndFetchWorkout() {
//        Workout workout = new Workout();
//        workout.setUserID(1);
//        workout.setType("Cardio");
//        workout.setDuration(30);
//        workout.setIntensity("High");
//        workout.setCaloriesBurned(300);
//        workout.setWeekday("Monday");
//        workout.setDate(new Date());
//
//        // Save the workout
//        workoutService.createWorkout(workout);
//
//        // Fetch all workouts
//        assert !workoutService.getAllWorkouts().isEmpty();
//    }
//}
