package com.spring.BlogPost.service;

import com.spring.BlogPost.model.User;
import com.spring.BlogPost.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> m(String name) {

        return  userRepository.getAllUser(name);
    }
    public void registerUser(User newUser) {
        userRepository.registerUser(newUser);
    }
}
