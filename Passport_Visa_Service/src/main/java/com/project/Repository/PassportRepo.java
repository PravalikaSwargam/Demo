package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.Model.Passport;

@Repository
public interface PassportRepo extends JpaRepository<Passport, String> {

}
