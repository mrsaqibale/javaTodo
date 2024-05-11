package com.todo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.dto.TodoDto;
import com.todo.servicesImp.TodoServImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class TodoCon {

	@Autowired
	TodoServImp todoServImp;
	
//	get all todos
	@GetMapping("/todo")
	public List<TodoDto> getAllTodo() {
		return todoServImp.getAllTodo();
	}
	
}
