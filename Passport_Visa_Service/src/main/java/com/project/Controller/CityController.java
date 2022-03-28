package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.City;
import com.project.Service.CityService;

@RestController
@RequestMapping("/Place")
public class CityController {

	@Autowired
	CityService cs;

	@PostMapping("/addCity")
	public ResponseEntity<City> addCity(@Validated @RequestBody City city) {
		City emp = cs.addCity(city);
		return new ResponseEntity<City>(emp, HttpStatus.OK);
	}

}
