package com.basic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basic.entity.employee;

public interface employeeRepository extends JpaRepository<employee, Long>{
	
	

}
