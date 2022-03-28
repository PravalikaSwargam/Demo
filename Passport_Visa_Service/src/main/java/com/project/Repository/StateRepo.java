package com.project.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.State;
	@Repository
	public interface StateRepo extends JpaRepository<State, Integer>{

	}


