package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.Passport;
import com.project.Service.PassportService;

@RestController
@RequestMapping("/Paregister")
public class PassportController {
	
	@Autowired
	PassportService pgs;

	@PostMapping("/startRegistration")
	public ResponseEntity<String> addUser(@Validated @RequestBody Passport p) {

		pgs.addUser(p);

		return new ResponseEntity<String>("Successfully Registered", HttpStatus.OK);
	}

}

