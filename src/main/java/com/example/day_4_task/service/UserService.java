package com.example.day_4_task.service;

import com.example.day_4_task.pojo.User;
import java.util.ArrayList;

public interface UserService {

    ArrayList<User> getUserByPath(Integer id);
//    User getUserByRequest(String name,Integer age);
    ArrayList<User> getAll();

}
