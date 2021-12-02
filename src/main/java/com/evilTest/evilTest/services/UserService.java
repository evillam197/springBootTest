package com.evilTest.evilTest.services;

import java.util.ArrayList;
import java.util.Optional;

import com.evilTest.evilTest.models.UserModel;
import com.evilTest.evilTest.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel userModel){
        return userRepository.save(userModel);
    } 

    public Optional<UserModel> getById(int id){
        return userRepository.findById(id);
    }

    public ArrayList<UserModel> getByUserName(String userName){
        return userRepository.findByUserName(userName);
    }

    public boolean deleteUser(int id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
