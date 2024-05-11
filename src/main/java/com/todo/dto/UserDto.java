package com.todo.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {

	 @NotBlank
	    @Email(message = "Email must be valid")
	    private String email;
	    
	    @NotBlank
	    @Size(min = 4, message = "Password must be at least 4 characters long")
	    private String password;
	    
	    @NotBlank(message = "Name cannot be blank")
	    private String name;
	    
	    private List<RoleDto> roles;

		public UserDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserDto(@NotBlank @Email(message = "Email must be valid") String email,
				@NotBlank @Size(min = 4, message = "Password must be at least 4 characters long") String password,
				@NotBlank(message = "Name cannot be blank") String name, List<RoleDto> roles) {
			super();
			this.email = email;
			this.password = password;
			this.name = name;
			this.roles = roles;
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

		public List<RoleDto> getRoles() {
			return roles;
		}

		public void setRoles(List<RoleDto> roles) {
			this.roles = roles;
		}
}
