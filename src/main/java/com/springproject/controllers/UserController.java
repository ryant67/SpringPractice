package com.springproject.controllers;

import com.springproject.models.User;
import com.springproject.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String landing() {
        return "landing";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName,
            @RequestParam(name = "age") int age,
            @RequestParam(name = "email") String email,
            @RequestParam(name = "phoneNumber") long phoneNumber,
            @RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password, Model model) {
        User user = new User();
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setAge(user.getAge());
        user.setEmail(user.getEmail());
        user.setPhoneNumber(user.getPhoneNumber());
        user.setUserName(user.getUserName());
        user.setPassword(user.getPassword());
        return "/register";
    }

    @GetMapping("/users")
    public String index(Model model) {
        model.addAttribute("users", userDao.findAll());
        return "allUsers";
    }

}
