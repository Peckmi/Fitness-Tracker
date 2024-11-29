package com.exercisenow.enterprise.Repository;

import com.exercisenow.enterprise.dto.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class WorkoutRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Workout saveWorkout(Workout workout) {
        String sql = "INSERT INTO workouts (userID, type, duration, intensity, caloriesBurned, weekday, date) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        // Using Generated Key for Primary Key
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, workout.getUserID());
            ps.setString(2, workout.getType());
            ps.setDouble(3, workout.getDuration());
            ps.setString(4, workout.getIntensity());
            ps.setDouble(5, workout.getCaloriesBurned());
            ps.setString(6, workout.getWeekday());
            ps.setDate(7, new java.sql.Date(workout.getDate().getTime()));
            return ps;
        });


        return getAllWorkouts().stream()
                .reduce((first, second) -> second)
                .orElse(null);
    }

    public List<Workout> getAllWorkouts() {
        String sql = "SELECT * FROM workouts";
        return jdbcTemplate.query(sql, new WorkoutRowMapper());
    }

    public Workout getWorkoutById(int id) {
        String sql = "SELECT * FROM workouts WHERE workoutID = ?";
        return jdbcTemplate.queryForObject(sql, new WorkoutRowMapper(), id);
    }

    public int deleteWorkoutById(int id) {
        String sql = "DELETE FROM workouts WHERE workoutID = ?";
        return jdbcTemplate.update(sql, id);
    }

    private static class WorkoutRowMapper implements RowMapper<Workout> {
        @Override
        public Workout mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
            Workout workout = new Workout();
            workout.setWorkoutID(rs.getInt("workoutID"));
            workout.setUserID(rs.getInt("userID"));
            workout.setType(rs.getString("type"));
            workout.setDuration(rs.getDouble("duration"));
            workout.setIntensity(rs.getString("intensity"));
            workout.setCaloriesBurned(rs.getDouble("caloriesBurned"));
            workout.setWeekday(rs.getString("weekday"));
            workout.setDate(rs.getDate("date"));
            return workout;
        }
    }
}
