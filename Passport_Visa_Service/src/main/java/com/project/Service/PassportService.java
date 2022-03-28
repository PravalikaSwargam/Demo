package com.project.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Exception.PVSBusinessException;
import com.project.Model.Passport;
import com.project.Repository.PassportRepo;

@Service
public class PassportService {
	@Autowired
	PassportRepo pgr;

	public Passport addUser(Passport p) {

		
		String s2 = p.getUserId().substring(5, p.getUserId().length());

		int num = Integer.parseInt(s2);
		int maxNum = num + 1;
		String no = String.valueOf(maxNum);

		String n2 = String.valueOf(p.getBOOKLET_TYPE());
		String ss = "FPS-" + n2 + no;
		p.setTemp_num(ss);

		LocalDate d = LocalDate.now();
		if (p.getDATE_OF_ISSUE().equals(d)) 
		{
			LocalDate ld = p.getDATE_OF_ISSUE().plusYears(10);
			p.setDATE_OF_EXPIRY(ld);
			
	    } else {
			  throw new PVSBusinessException(); 
			  }
			 
		return pgr.save(p);
	}

}
