package com.todo.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TodoDto {
	public TodoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TodoDto(@NotBlank @Size(min = 3, message = "Title must be at least 3 characters long") String title,
			@NotBlank @Size(min = 5, message = "Description must be at least 5 characters long") String description,
			Date date, boolean status, boolean deleted, List<UserDto> users) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.status = status;
		this.deleted = deleted;
		this.users = users;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public List<UserDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserDto> users) {
		this.users = users;
	}

	@NotBlank
    @Size(min = 3, message = "Title must be at least 3 characters long")
    private String title;
    
    @NotBlank
    @Size(min = 5 , message="Description must be at least 5 characters long")
    private String description;
    private Date date;
    private boolean status;
    private boolean deleted;
    
    private List<UserDto> users;
}
