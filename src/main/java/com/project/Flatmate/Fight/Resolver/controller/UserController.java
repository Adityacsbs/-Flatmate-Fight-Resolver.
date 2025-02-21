package com.project.Flatmate.Fight.Resolver.controller;


import com.project.Flatmate.Fight.Resolver.model.User;
import com.project.Flatmate.Fight.Resolver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Register a new user")
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @Operation(summary = "Get user by username")
    @GetMapping("/{username}")
    public Optional<User> getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/leaderboard/complaints-against")
    public List<User> getUsersWithMostComplaintsAgainst() {
        return userService.getUsersWithMostComplaintsAgainst();
    }

    @GetMapping("/leaderboard/upvoted-complaints")
    public List<User> getUsersWithMostUpvotedComplaints() {
        return userService.getUsersWithMostUpvotedComplaints();
    }
    
}

