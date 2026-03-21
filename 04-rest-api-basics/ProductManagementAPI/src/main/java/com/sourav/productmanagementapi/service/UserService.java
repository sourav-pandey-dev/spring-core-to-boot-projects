package com.sourav.productmanagementapi.service;

import com.sourav.productmanagementapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    List<User> userList = new ArrayList<>();

    public List<User> addUser(User u){
        userList.add(u);
        return userList;
    }
    public User getUserById(int id){
        for(User u : userList){
            if(id == u.getId()) return u;
        }
        return new User();
    }
    public List<User> getUserByName(String name){

        List<User> nameUser = new ArrayList<>();
        for(User u : userList){
            if(name.equalsIgnoreCase(u.getName())) nameUser.add(u);
        }
        return nameUser;
    }


}
