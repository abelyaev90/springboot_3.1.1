package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;
import com.example.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {

        return userRepository.getOne(id);
    }

    public List<User> printUsers() {

        return userRepository.findAll();
    }

    public User addUser(User user) {

        return userRepository.save(user);
    }

    public void deleteById(Long id) {

        userRepository.deleteById(id);
    }
}
