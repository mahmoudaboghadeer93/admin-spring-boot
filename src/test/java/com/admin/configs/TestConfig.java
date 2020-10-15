package com.admin.configs;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.admin.entities.User;
import com.admin.repositories.UserRepository;

//@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
//@ActiveProfiles("test")
class TestConfig {

	@Autowired
	private UserRepository userRepository;

	@Test
	void findAllUsers() {
		List<User> users = userRepository.findAll();
		assertNotNull(users);
	}

//	@Before
//	public void initialiseRestAssuredMockMvcStandalone() {
//		RestAssuredMockMvc.standaloneSetup(new UserController());
//	}

}
