package com.himanshu.RelateUserPost.service;

import com.himanshu.RelateUserPost.model.User;
import com.himanshu.RelateUserPost.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void addUser(User user){

        userRepo.save(user);
    }

    public List<User> getAllUsers(){
        System.out.println("showing all users");
        List<User> userList = new ArrayList<>();
        userRepo.findAll().forEach(userList::add);
        return userList;
    }

    public void addRandUsers(){
        System.out.println("rand users generating");
        User user1 = new User("name1", "abc1", 123);
        User user2 = new User("name2", "ab2", 234);
        User user3 = new User("name3", "ab3", 345);

        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);
    }
}
