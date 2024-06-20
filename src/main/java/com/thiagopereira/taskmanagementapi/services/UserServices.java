package com.thiagopereira.taskmanagementapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagopereira.taskmanagementapi.models.user.User;
import com.thiagopereira.taskmanagementapi.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public User create(User user) {
        return repository.save(user);
    }

}
