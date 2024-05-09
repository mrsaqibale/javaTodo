package com.todo.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;   
	 private String email;
	 private String password;
	 private String name;
	    
	 public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String email, String password, String name, List<Todo> todos, Role role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.todos = todos;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	 private List<Todo> todos;
	    
	 @ManyToOne
	 @JoinColumn(name = "role_id")
	 private Role role;
}
