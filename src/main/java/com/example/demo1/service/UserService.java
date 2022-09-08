package com.example.demo1.service;

import com.example.demo1.pojo.User;
import java.util.ArrayList;

public interface UserService {

    ArrayList<User> getUserByPath(Integer id);
//    User getUserByRequest(String name,Integer age);
    ArrayList<User> getAll();

}
