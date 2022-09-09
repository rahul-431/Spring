package com.example.day_4_task.service;

import com.example.day_4_task.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImplementation implements UserService{

    ArrayList<User> userList=new ArrayList<User>();

    @Override
    public ArrayList<User> getUserByPath(Integer id) {
//        model=model.stream().filter(user-> user.getId()!=userId).collect(Collectors.toList());
        ArrayList<User> selectedUser=new ArrayList<>();
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).getId()==id)
            {
                selectedUser.add( userList.get(i));
            }
        }
        return selectedUser;
    }

//    @Override
//    public User getUserByRequest(String name,Integer age) {
//        return null;
//    }

    @Override
    public ArrayList<User> getAll() {
        userList.add(new User(1,"rahul mijar","hetauda","9865410868"));
        userList.add(new User(2,"animesh dahal","hetauda","98456720"));
        return userList;
    }
}
