package com.evilTest.evilTest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.evilTest.evilTest.models.UserModel;
import com.evilTest.evilTest.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userService.getUsers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel userModel){
        return this.userService.saveUser(userModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getById(@PathVariable("id") int id){
        return this.userService.getById(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<UserModel> getByUserName(@RequestParam("userName") String userName){
        return this.userService.getByUserName(userName);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") int id){
        boolean isDeleted = this.userService.deleteUser(id);
        if(isDeleted)
            return "Registro eliminado. id:"+id;
        else
            return "No se pudo eliminar el registro. id"+id;
    }
}
