package com.exercisenow.enterprise.repository;

import com.exercisenow.enterprise.dto.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ExerciseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Save a new exercise
    public void saveExercise(Exercise exercise) {
        String sql = "INSERT INTO exercises (name, type, duration, goal_calories_burned) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, exercise.getName(), exercise.getType(), exercise.getDuration(), exercise.getGoalCaloriesBurned());
    }

    // Get all exercises
    public List<Exercise> getAllExercises() {
        String sql = "SELECT * FROM exercises";
        return jdbcTemplate.query(sql, new ExerciseRowMapper());
    }

    // Get exercise by ID
    public Exercise getExerciseById(int id) {
        String sql = "SELECT * FROM exercises WHERE exercise_id = ?";
        return jdbcTemplate.queryForObject(sql, new ExerciseRowMapper(), id);
    }

    // Delete an exercise
    public void deleteExercise(int id) {
        String sql = "DELETE FROM exercises WHERE exercise_id = ?";
        jdbcTemplate.update(sql, id);
    }

    // RowMapper for Exercise
    private static class ExerciseRowMapper implements RowMapper<Exercise> {
        @Override
        public Exercise mapRow(ResultSet rs, int rowNum) throws SQLException {
            Exercise exercise = new Exercise();
            exercise.setExerciseID(rs.getInt("exercise_id"));
            exercise.setName(rs.getString("name"));
            exercise.setType(rs.getString("type"));
            exercise.setDuration(rs.getDouble("duration"));
            exercise.setGoalCaloriesBurned(rs.getDouble("goal_calories_burned"));
            // Add workout mapping here if needed
            return exercise;
        }
    }
}
