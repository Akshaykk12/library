package com.capgemini.library.services;

import java.util.List;

import com.capgemini.library.entities.User;

public interface UserServices {
	
	List<User> getAllUsers();
	
	User getUserById(Long userId);
	
	User createUser(User user);
	
	User updateUser(Long userId, User user);
	
	boolean deleteUser(Long userId);
	
}