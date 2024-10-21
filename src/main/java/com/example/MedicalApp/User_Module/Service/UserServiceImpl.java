package com.example.MedicalApp.User_Module.Service;

import com.example.MedicalApp.User_Module.Entity.User;
import com.example.MedicalApp.User_Module.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    //sign in implementation
    @Override
    public User saveUser(User user) {
        UUID uuid = UUID.randomUUID();
        user.setUser_id(String.valueOf(uuid));
        return userRepo.save(user);
    }

    //get all user
    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepo.findAll();
    }

    //update user
    @Override
    public Optional<User> updateUserDetail(User user, String user_id) {
        Optional<User> user1 = Optional.ofNullable(userRepo.findUserByUser_userid(user_id));
        if (user1.isPresent()) {
//            user1.get().setId(user1.get().getId());
//            user1.get().setUser_id(user1.get().getUser_id());
//            user1.get().setDate_of_account_creation(user1.get().getDate_of_account_creation());

            user1.get().setPassword(user.getPassword());
            user1.get().setName(user.getName());
            user1.get().setEmail(user.getEmail());
            user1.get().setPhone_Number(user.getPhone_Number());
            user1.get().setPinCode(user.getPinCode());
            user1.get().setAddress(user.getAddress());
            user1.get().setIsApproved(user.getIsApproved());
            user1.get().setBlock(user.getBlock());
            userRepo.save(user1.get());

        }

        return user1;
    }

    @Override
    public String findUserByUser_email(String email, String password) {
        Optional<User> user1 = Optional.ofNullable(userRepo.findUserByUser_email(email, password));
        if (user1.isPresent()) {

            System.out.println(user1);
            return "User Login successfully";
        }
        System.out.println(user1);
        return "User Login unsuccessfully";
    }


}
