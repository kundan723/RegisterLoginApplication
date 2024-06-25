package com.learn.springboot.services;

import java.util.List;

import com.learn.springboot.entities.User;

public interface UserService {

	public String addUser(User user);
	public List<User> validateUser();
	public User existByEmail(String email);
}
