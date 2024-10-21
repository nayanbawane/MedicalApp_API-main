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

    //auth user
    String findUserByUser_email_password(String email, String password);

    // Delete operation by user_id
    void deleteUserBy_user_id(String user_id);

}
