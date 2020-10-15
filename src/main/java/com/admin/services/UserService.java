package com.admin.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dtos.UserDTO;
import com.admin.entities.User;
import com.admin.repositories.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> users = userRepository.findAll();
		List<UserDTO> userDTOs = new ArrayList<>();

		for (User user : users) {
			UserDTO userDTO = new UserDTO();
			userDTOs.add(userDTO.toDTO(user));
		}
		return new ResponseEntity<>(userDTOs, HttpStatus.OK);
	}

	public ResponseEntity<UserDTO> findById(Long id) {
		User user = userRepository.findByUserId(id);
		return new ResponseEntity<>(new UserDTO().toDTO(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDTO> add(UserDTO userDTO) {
		return new ResponseEntity<>(new UserDTO().toDTO(userRepository.save(userDTO.toEntity())), HttpStatus.OK);
	}

	public ResponseEntity<UserDTO> update(UserDTO userDTO) {
		User user = userRepository.findByUserId(userDTO.getId());
		userDTO.updateEntity(user);
		return new ResponseEntity<>(new UserDTO().toDTO(userRepository.save(user)), HttpStatus.OK);
	}

	public ResponseEntity<UserDTO> delete(Long id) {
		userRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
