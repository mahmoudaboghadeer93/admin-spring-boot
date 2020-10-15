package com.admin.dtos;

import com.admin.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

	private Long id;

	private String username;

	private String firstName;

	private String lastName;

	private String password;

	public UserDTO toDTO(User user) {
		id = user.getId();
		username = user.getUsername();
		firstName = user.getFirstName();
		lastName = user.getLastName();
		password = user.getPassword();
		return this;
	}

	public User toEntity() {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		return user;
	}

	public void updateEntity(User user) {
		if (username != null)
			user.setUsername(username);
		if (firstName != null)
			user.setFirstName(firstName);
		if (lastName != null)
			user.setLastName(lastName);
		if (password != null)
			user.setPassword(password);
	}

}
