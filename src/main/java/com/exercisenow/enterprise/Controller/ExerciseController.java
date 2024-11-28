package com.exercisenow.enterprise.Controller;

import com.exercisenow.enterprise.dto.Exercise;
import com.exercisenow.enterprise.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExerciseController {

    @RequestMapping("/")
        public String index() {
        User user = new User();
        return "start";
    }

    @GetMapping("/user/{id}/")
    public ResponseEntity fetchUserByUserId(@PathVariable("userId") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/user/{id}", consumes="application/json", produces="application/json")
    public User createUser(@RequestBody User user){
        return user;
    }

    @GetMapping("/add")
    public String addExerciseForm(Model model) {
        model.addAttribute("exercise", new Exercise());
        return "addexercise";
    }
    @DeleteMapping("/user/{id}/")
    public ResponseEntity deleteUser(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }


}


