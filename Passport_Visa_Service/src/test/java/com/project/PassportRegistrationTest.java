package com.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.Controller.PassportController;
import com.project.Repository.PassportRepo;

@SpringBootTest
public class PassportRegistrationTest {

	@MockBean
	private PassportRepo repo;

	@Autowired
	private PassportController controller;

	@Test
	public void saveUserAddTest() 
	{

		assertThat(controller).isNotNull();
	}
}
