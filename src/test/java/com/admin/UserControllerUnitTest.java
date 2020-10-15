package com.admin;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.admin.controllers.UserController;
import com.admin.services.UserService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

//@RunWith(MockitoJUnitRunner.class)
public class UserControllerUnitTest {

	@Mock
	private UserService userService;

	@InjectMocks
	private UserController userController;

//	@Before
	public void initialiseRestAssuredMockMvcStandalone() {
		RestAssuredMockMvc.standaloneSetup(userController);
	}

}
