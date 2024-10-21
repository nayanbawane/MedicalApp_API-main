package com.example.MedicalApp.User_Module.Service;

import com.example.MedicalApp.User_Module.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //save operation
    User saveUser(User user);

    // Read operation
    List<User> getAllUser();

    // Update operation
    Optional<User> updateUserDetail(User user, String user_id);

    // Delete operation
    //void deleteUserById(String user_id);

    String findUserByUser_email(String email, String password);


}
