package com.basic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.Repository.employeeRepository;
import com.basic.entity.employee;
import com.basic.exception.ResourceNotfoundException;
import com.basic.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private employeeRepository employeeRepository;
	
	
//	public EmployeeServiceImpl(com.basic.Repository.employeeRepository employeeRepository) {
//		super();
//		this.employeeRepository = employeeRepository;
//	}
	
	
	//create
	@Override
	public employee saveEmployee(employee emp) {
		return employeeRepository.save(emp);
	}

    //get
	@Override
	public List<employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

    //get by id
	@Override
	public employee getEmployeeById(long id) {
	   	Optional<employee> employee =employeeRepository.findById(id);
	   	if(employee.isPresent()) {
	   		return employee.get();
	   	}else {
	   		throw new ResourceNotfoundException("employee","Id", id);
	   	}
	   	
	}
 //delete by id
	@Override
	public void deleEmployeeById(long id) {
	employeeRepository.deleteById(id);
		
	}
}
