package com.himanshu.RelateUserPost.repo;

import com.himanshu.RelateUserPost.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepo extends JpaRepository<Post, UUID> {
}
