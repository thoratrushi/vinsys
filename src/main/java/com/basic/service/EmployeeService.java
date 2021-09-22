package com.basic.service;

import java.util.List;

import com.basic.entity.employee;

public interface EmployeeService {
	//post
	employee saveEmployee(employee emp);
	
	//get all employee
	List<employee> getAllEmployee();
	
	
	//get employee id
	employee getEmployeeById (long id);
	
	//delete by id
	void deleEmployeeById(long id);

}
