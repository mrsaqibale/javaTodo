package com.todo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.todo.models.Todo;

import jakarta.persistence.Id;

@Component
public interface TodoRepo extends CrudRepository<Todo, Integer> {

}
