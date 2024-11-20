package com.exercisenow.enterprise;

import com.exercisenow.enterprise.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExerciseController {

    @RequestMapping("/")
        User user = new User();

    public string index() {
        return "start";
    }

}

@GetMapping("/user/{id}/")
public ResponseEntity<User> fetchUserByUserId(@PathVariable"userId") String id) {
    return new ResponseEntity<>(HttpStatus.OK);
}

@PostMapping(value="/user/{id}", consumes="application/json", produces="application/json")
public User createUser(@RequestBody User user){
    return user;
}

@DeleteMapping("/user/{id}/")
public ResponseEntity deleteUser(@PathVariable("id") String id){
    return new ResponseEntity(HttpStatus.Ok);
}