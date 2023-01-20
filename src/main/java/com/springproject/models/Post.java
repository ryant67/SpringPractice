package com.springproject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "post_title", nullable = false, length = 100)
    private String postTitle;

    @Column(name = "post_body", nullable = false, length = 500)
    private String postBody;

    //Many posts can belong to one user.
    @ManyToOne
    @JoinColumn(name = "user_username")
    private User user;

    //Constructors
    //1. Used all fields
    //2. Used for post creation & edit
    //3. Empty

    public Post(long id, String postTitle, String postBody, User user) {
        this.id = id;
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.user = user;
    }

    public Post(String postTitle, String postBody) {
        this.postTitle = postTitle;
        this.postBody = postBody;
    }

    public Post() {}

    //Getters and Setters

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getPostTitle() {
        return postTitle;
    }
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostBody() {
        return postBody;
    }
    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
