package com.project.Flatmate.Fight.Resolver.service;

import com.project.Flatmate.Fight.Resolver.model.User;
import com.project.Flatmate.Fight.Resolver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(userRepository.findByUsername(username));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsersWithMostComplaintsAgainst() {
        return userRepository.findAll().stream()
                .sorted((u1, u2) -> Integer.compare(u2.getComplaintsAgainst(), u1.getComplaintsAgainst()))
                .collect(Collectors.toList());
    }

    public List<User> getUsersWithMostUpvotedComplaints() {
        return userRepository.findAll().stream()
                .sorted((u1, u2) -> Integer.compare(u2.getKarmaPoints(), u1.getKarmaPoints()))
                .collect(Collectors.toList());
    }
}

