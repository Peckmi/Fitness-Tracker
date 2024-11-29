package com.exercisenow.enterprise.Repository;

import com.exercisenow.enterprise.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Save or update user
    public void saveUser(User user) {
        String sql = "REPLACE INTO users (userID, name, email, password, age, weight, height) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getUserID(), user.getUsername(), user.getEmail(),
                user.getPassword(), user.getAge(), user.getWeight(), user.getHeight());
    }

    // Fetch the signed-up user's details
    public User findSingleUser() {
        String sql = "SELECT * FROM users LIMIT 1"; // Fetch only one user
        return jdbcTemplate.queryForObject(sql, new UserRowMapper());
    }

    // Delete user
    public void deleteUser() {
        String sql = "DELETE FROM users";
        jdbcTemplate.update(sql);
    }

    // RowMapper for User
    private static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUserID(rs.getInt("userID"));
            user.setUsername(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            user.setWeight(rs.getDouble("weight"));
            user.setHeight(rs.getDouble("height"));
            return user;
        }
    }
}
