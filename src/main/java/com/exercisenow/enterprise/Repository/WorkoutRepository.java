package com.exercisenow.enterprise.Repository;

import com.exercisenow.enterprise.dto.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

}
