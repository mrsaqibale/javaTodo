package com.todo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.todo.models.Role;

@Component
public interface RoleRepo extends CrudRepository<Role, Long>{

}
