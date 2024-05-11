package com.todo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.dto.UserDto;

@Service
public interface UserServ {

//	create user
	UserDto createUser(UserDto entity);
	
	
//	get all users
	List<UserDto> getAllUsers();
	
	
//	get user by id
	UserDto getUserById(int id);
	
	
//	delete user
	void deleteUser(int id);
	
	
//	update user password
	UserDto updateUserPassword(String pass);
	
	
//	update username
	UserDto updateUserName(String name);
	
}
