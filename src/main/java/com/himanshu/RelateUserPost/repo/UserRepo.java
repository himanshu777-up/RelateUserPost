package com.himanshu.RelateUserPost.repo;

import com.himanshu.RelateUserPost.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
