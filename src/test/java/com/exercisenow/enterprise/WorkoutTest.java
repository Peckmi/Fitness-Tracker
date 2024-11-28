package com.exercisenow.enterprise;

import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.Repository.WorkoutRepository;
import com.exercisenow.enterprise.service.WorkoutService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class WorkoutTest {

    @Autowired
    private WorkoutService workoutService;

    @Autowired
    private WorkoutRepository workoutRepository;

    @Test
    public void testSaveAndRetrieveWorkout() {

        Workout workout = new Workout();
        workout.setType("Cardio");
        workout.setDuration(30);
        workout.setIntensity("High");
        workout.setCaloriesBurned(250);
        workout.setWeekday("Monday");
        workout.setDate(new Date());
        workoutRepository.save(workout);



        workoutRepository.save(workout);
        List<Workout> workouts = workoutRepository.findAll();

        assertThat(workouts).isNotEmpty();
        assertThat(workouts.size()).isEqualTo(1); // Expect exactly one workout
        Workout retrievedWorkout = workouts.get(0);
        assertThat(retrievedWorkout.getType()).isEqualTo("Cardio");
        assertThat(retrievedWorkout.getDuration()).isEqualTo(30);
        assertThat(retrievedWorkout.getIntensity()).isEqualTo("High");
        assertThat(retrievedWorkout.getCaloriesBurned()).isEqualTo(250);
        assertThat(retrievedWorkout.getWeekday()).isEqualTo("Monday");
    }

}
