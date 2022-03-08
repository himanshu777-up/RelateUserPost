package com.himanshu.RelateUserPost.controller;

import com.himanshu.RelateUserPost.model.Post;
import com.himanshu.RelateUserPost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET, value = "/allposts")
    public List<Post> showAllPosts(){
        return postService.getAllPosts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/randposts")
    public void createRands(){
        postService.addRandomPosts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addpost")
    public void addPost(@RequestBody Post post){
        postService.createPost(post);
    }


}
