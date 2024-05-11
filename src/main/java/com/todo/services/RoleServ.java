package com.todo.services;

import org.springframework.stereotype.Service;

import com.todo.dto.RoleDto;

@Service
public interface RoleServ {

//	create Role
	RoleDto createRole(RoleDto entity);
	
	
//	delete role
	void deleteRole(int id);
	
	
//	update role
	RoleDto updateRole(RoleDto entity, int id);
}
