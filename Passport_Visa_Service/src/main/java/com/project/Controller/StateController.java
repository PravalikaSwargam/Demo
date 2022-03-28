package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.State;
import com.project.Service.StateService;

@RestController
@RequestMapping("/stateDetails")
public class StateController {
	@Autowired
	StateService ser;

	@PostMapping("/addState")
	public ResponseEntity<State> addState(@Validated @RequestBody State s) {

		State emp = ser.addState(s);
		System.out.println(emp);
		return new ResponseEntity<State>(emp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}


