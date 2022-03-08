package com.himanshu.RelateUserPost.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Post {

    @Id
//    @GeneratedValue
    private String id;
    private String text;
    @ManyToOne
    private User user;
    private int rating;

    public Post(String id, String text, User user, int rating) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.rating = rating;
    }

    public Post() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", user=" + user +
                ", rating=" + rating +
                '}';
    }
}
