package com.learn.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	// Method to find user by using the email
	public User findByEmail(String email);
}
