package com.example.demo1.controller;

import com.example.demo1.pojo.User;
import com.example.demo1.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImplementation userServiceImplementation;

    //get all user details;

    @GetMapping("/getAll")
    public ArrayList<User> getUserDetail()
    {
           return  userServiceImplementation.getAll();
    }

    //get user with provided id;

    @GetMapping("/get/{id}")
    public ArrayList<User> getSingleUser(@PathVariable Integer id)
    {
        return userServiceImplementation.getUserByPath(id);
    }

    @GetMapping("/getRequest")
    public String getUser(@RequestParam String name,@RequestParam(required = false) Integer age,@RequestParam(defaultValue = "nepal") String address)
    {
        return "User name is: "+name+" and age is: "+age+" and address is: "+address;
    }
}
