package com.exercisenow.enterprise;

import com.exercisenow.enterprise.Controller.WorkoutController;
import com.exercisenow.enterprise.dto.Workout;
import com.exercisenow.enterprise.service.WorkoutService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class WorkoutControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private WorkoutService workoutService;

    @InjectMocks
    private WorkoutController workoutController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(workoutController).build();
    }

    @Test
    public void testCreateWorkout() throws Exception {
        Workout workout = new Workout();
        workout.setWorkoutID(1);
        workout.setType("Cardio");
        workout.setDuration(30);
        workout.setIntensity("High");
        workout.setCaloriesBurned(300);
        workout.setWeekday("Monday");
        workout.setDate(new Date());

        when(workoutService.createWorkout(workout)).thenReturn(workout);

        mockMvc.perform(post("/workouts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"type\": \"Cardio\", \"duration\": 30, \"intensity\": \"High\", \"caloriesBurned\": 300, \"weekday\": \"Monday\", \"date\": \"2024-11-29\" }"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.type").value("Cardio"))
                .andExpect(jsonPath("$.duration").value(30))
                .andExpect(jsonPath("$.intensity").value("High"))
                .andExpect(jsonPath("$.caloriesBurned").value(300))
                .andExpect(jsonPath("$.weekday").value("Monday"))
                .andExpect(jsonPath("$.date").value("2024-11-29"));
    }

    @Test
    public void testGetAllWorkouts() throws Exception {
        Workout workout1 = new Workout();
        workout1.setWorkoutID(1);
        workout1.setType("Cardio");
        workout1.setDuration(30);
        workout1.setIntensity("High");
        workout1.setCaloriesBurned(300);
        workout1.setWeekday("Monday");
        workout1.setDate(new Date());

        Workout workout2 = new Workout();
        workout2.setWorkoutID(2);
        workout2.setType("Strength");
        workout2.setDuration(45);
        workout2.setIntensity("Medium");
        workout2.setCaloriesBurned(500);
        workout2.setWeekday("Wednesday");
        workout2.setDate(new Date());

        List<Workout> workouts = Arrays.asList(workout1, workout2);

        when(workoutService.getAllWorkouts()).thenReturn(workouts);

        mockMvc.perform(get("/workouts"))
                .andExpect(jsonPath("$[1].type").value("Cardio")) // Verify the first workout's type
                .andExpect(jsonPath("$[2].type").value("Strength"));
    }

    @Test
    public void testGetWorkoutById() throws Exception {
        Workout workout = new Workout();
        workout.setWorkoutID(1);
        workout.setType("Cardio");
        workout.setDuration(30);
        workout.setIntensity("High");
        workout.setCaloriesBurned(300);
        workout.setWeekday("Monday");
        workout.setDate(new Date());

        when(workoutService.getWorkoutById(1)).thenReturn(workout);

        mockMvc.perform(get("/workouts/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.type").value("Cardio"))
                .andExpect(jsonPath("$.duration").value(30))
                .andExpect(jsonPath("$.intensity").value("High"));
    }

    @Test
    public void testDeleteWorkout() throws Exception {
        int workoutId = 1;

        mockMvc.perform(delete("/workouts/1"))
                .andExpect(status().isNoContent());
    }
}
