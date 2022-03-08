package com.himanshu.RelateUserPost.service;

import com.himanshu.RelateUserPost.model.Post;
import com.himanshu.RelateUserPost.model.User;
import com.himanshu.RelateUserPost.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public List<Post> getAllPosts(){
        System.out.println("Get all posts called");
        List<Post> postList = new ArrayList<>();
        postRepo.findAll().forEach(postList::add);
        return postList;
    }

    public void createPost(Post post){
        postRepo.save(post);
    }

    public void addRandomPosts(){
        System.out.println("add random posts method called");
        User user1 = new User("name1", "abc1", 123);
        User user2 = new User("name2", "ab2", 234);
        User user3 = new User("name3", "ab3", 345);

        Post post1 = new Post("1", "text1", user1, 5);
        Post post2 = new Post("2", "text2", user2, 4);
        Post post3 = new Post("3", "text3", user3, 3);

        postRepo.save(post1);
        postRepo.save(post2);
        postRepo.save(post3);

    }


}
