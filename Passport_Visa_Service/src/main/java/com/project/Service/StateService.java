package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.Model.State;
import com.project.Repository.StateRepo;

@Service
@Component
public class StateService {
	@Autowired
	StateRepo repo;

	public State addState(State c) {
		return repo.save(c);
	}

}
