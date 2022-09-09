package com.example.day_4_task.controller;
import com.example.day_4_task.pojo.User;
import com.example.day_4_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userServiceImplementation;

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
    public String getUser(@RequestParam String name,@RequestParam(required = false,defaultValue = "20") Integer age,@RequestParam(defaultValue = "nepal") String address)
    {
        return "User name is: "+name+" and age is: "+age+" and address is: "+address;
    }
}
