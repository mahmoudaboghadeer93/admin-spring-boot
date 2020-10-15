package com.admin.user;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.admin.entities.User;
import com.admin.repositories.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Configuration
//@TestConfiguration
//@SpringBootTest
public class UserTest {

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private UserService userService;
//
//	@Bean
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}

	@Test
	void findAllUsersRespsitoryTest() {
		List<User> users = userRepository.findAll();
		assertNotNull(users);
	}

//	@Test
//	void findAllUsersServiceTest() {
//		ResponseEntity<List<UserDTO>> response = userService.findAll();
//		assertNotNull(response);
//	}

}
