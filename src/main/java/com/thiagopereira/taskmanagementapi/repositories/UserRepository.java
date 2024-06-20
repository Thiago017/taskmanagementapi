package com.thiagopereira.taskmanagementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagopereira.taskmanagementapi.models.user.User;

public interface UserRepository extends JpaRepository<User, String> {

}
