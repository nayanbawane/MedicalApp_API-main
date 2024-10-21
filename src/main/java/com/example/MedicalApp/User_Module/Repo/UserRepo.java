package com.example.MedicalApp.User_Module.Repo;

import com.example.MedicalApp.User_Module.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM user where user_id=?")
    User findUserByUser_userid(String user_id);


    @Query(nativeQuery = true, value = "SELECT * FROM user where email=? and password=?")
    User findUserByUser_email(String email,String password);




}