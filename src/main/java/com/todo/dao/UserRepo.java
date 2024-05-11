package com.todo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.todo.models.User;

@Component
public interface UserRepo extends CrudRepository<User, Long>{

}
