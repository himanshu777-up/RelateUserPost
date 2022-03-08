package com.himanshu.RelateUserPost.controller;

import com.himanshu.RelateUserPost.model.User;
import com.himanshu.RelateUserPost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/genUsers")
    public void generateRandomUsers(){
        userService.addRandUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> allUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
