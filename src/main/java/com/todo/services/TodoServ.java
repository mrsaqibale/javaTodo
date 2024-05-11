package com.todo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.dto.TodoDto;

@Service
public interface TodoServ {

//	create todo 
	TodoDto createTodo(TodoDto entity);
	
	
//	get all todo 
	List<TodoDto> getAllTodo();
	
	
//	get todo by id
	TodoDto getTodoById(Long id);
	
	
//	update todo
	TodoDto updateTodo(TodoDto entity ,Long id);
	
//	change status of todo
	TodoDto updateStatus(Long id);
	
	
//	get completed todo 
	List<TodoDto> getCompletedTodo();
	
	
//	get deleted todo
	List<TodoDto> getDeletedTodo();
	
	
//	soft delete todo 
	void softDeleteUpdate(Long id);
}
