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
	    
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	 private List<Todo> todos;
	    
	 @ManyToOne
	 @JoinColumn(name = "role_id")
	 private Role role;
}
