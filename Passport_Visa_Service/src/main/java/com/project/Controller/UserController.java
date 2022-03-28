package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.User;
import com.project.Service.UserService;

@RestController
@RequestMapping("/usertable")
public class UserController {
	
	@Autowired
	UserService ser;

	@PostMapping("/addUsers")
	public ResponseEntity<User> addUsers(@Validated @RequestBody User s) {
		User emp = ser.addUsers(s);
		System.out.println(emp);
		return new ResponseEntity<User>(emp, HttpStatus.OK);
	}

}
