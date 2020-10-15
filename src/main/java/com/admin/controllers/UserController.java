package com.admin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.dtos.UserDTO;
import com.admin.services.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "find-all")
	public ResponseEntity<List<UserDTO>> findAll() {
		return userService.findAll();
	}

	@PostMapping(path = "add")
	public ResponseEntity<UserDTO> add(@RequestBody UserDTO userDTO) {
		return userService.add(userDTO);
	}

	@PutMapping(path = "update")
	public ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO) {
		return userService.update(userDTO);
	}

	@DeleteMapping(path = "delete")
	public ResponseEntity<UserDTO> delete(@RequestBody String id) {
		return userService.delete(Long.valueOf(id));
	}

}
