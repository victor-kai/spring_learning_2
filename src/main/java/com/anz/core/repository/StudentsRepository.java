package com.anz.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anz.domain.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
	
	Students findByName(String name);
	
	Students findByNameAndAge(String name, Integer age);
	
}
