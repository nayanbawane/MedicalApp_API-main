package com.example.MedicalApp.User_Module.Controller;

import com.example.MedicalApp.User_Module.Entity.User;
import com.example.MedicalApp.User_Module.Repo.UserRepo;
import com.example.MedicalApp.User_Module.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    //get user signup
    @PostMapping("/user_signup")
    public User saveUser(@Validated @RequestBody User user) {
        return userService.saveUser(user);
    }


    //get all user list
    @GetMapping("/users")
    public List<User> getAllUserList() {
        return userService.getAllUser();
    }

    //update user detail
    @PatchMapping("/user/{user_id}")
    public ResponseEntity<Optional<User>> updateUserDetail(@RequestBody User user,
                                                           @PathVariable("user_id") String user_id) {
        return new ResponseEntity<Optional<User>>(userService.updateUserDetail(user, user_id), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> findUserByUser_email(@RequestParam("email") String email, @RequestParam("password") String password) {
        return new ResponseEntity<>(userService.findUserByUser_email(email,password), HttpStatus.OK);
    }


}
