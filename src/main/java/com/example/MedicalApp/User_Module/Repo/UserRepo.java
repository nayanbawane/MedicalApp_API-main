package com.example.MedicalApp.User_Module.Repo;

import com.example.MedicalApp.User_Module.Entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM user where user_id=?")
    User findByUser_userid(String user_id);


    @Query(nativeQuery = true, value = "SELECT * FROM user where email=? and password=?")
    User findUserByUser_email(String email,String password);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "Delete FROM user where user_id = :user_id")
    void deleteByUser_id(String user_id);





}