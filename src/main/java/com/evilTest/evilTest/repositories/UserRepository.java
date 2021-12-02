package com.evilTest.evilTest.repositories;

import java.util.ArrayList;

import com.evilTest.evilTest.models.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
    public abstract ArrayList<UserModel> findByUserName(String userName);
    
}
