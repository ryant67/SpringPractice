package com.springproject.controllers;

import com.springproject.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/createPost")
    public String newPostForm() {
        return "createPost";
    }

    @GetMapping("/allPosts")
    public String postIndex(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "allPosts";
    }

}
