package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.City;
import com.project.Repository.CityRepo;

@Service
public class CityService {
	@Autowired
	CityRepo repo;

	public City addCity(City c) {
		return repo.save(c);
	}
}
