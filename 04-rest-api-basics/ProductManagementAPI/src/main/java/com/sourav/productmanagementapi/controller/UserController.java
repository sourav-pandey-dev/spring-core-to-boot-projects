package com.sourav.productmanagementapi.controller;

import com.sourav.productmanagementapi.model.User;
import com.sourav.productmanagementapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

 @Autowired
    UserService service;

 @GetMapping("/hello")
    public String greet(){
     return "Hello world";
 }
 @GetMapping("/user/{id}")
    User finduser(@PathVariable("id") int id){
        return service.getUserById(id);
    }
    @PostMapping("/user")
    public String adduser(@RequestBody User user){
     service.addUser(user);
        return "user" + user.getName() + "added";
    }
    @GetMapping("/user")
    List<User> finduserByName(@RequestParam String name){
        return service.getUserByName(name);
    }


}
