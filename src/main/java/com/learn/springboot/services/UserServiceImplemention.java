package com.learn.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.entities.User;
import com.learn.springboot.repository.UserRepository;

@Service
public class UserServiceImplemention implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public String addUser(User user) {
		userRepo.save(user);
		return "User is registered and saved.";
	}

	@Override
	public List<User> validateUser() {
		List<User> userList = userRepo.findAll();
				return userList;
	}

	@Override
	public User existByEmail(String email) {
		User user = userRepo.findByEmail(email);
		return user;
	}


}
