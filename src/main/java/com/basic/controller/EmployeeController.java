package com.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.Repository.employeeRepository;
import com.basic.entity.employee;
import com.basic.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired 
	private EmployeeService employeeService;

//	public EmployeeController(EmployeeService employeeService) {
//		super();
//		this.employeeService = employeeService;
//	}
	
	//build create employee RestApi
//	@PostMapping("/employees")
//	public ResponseEntity<employee>saveEmployee(@RequestBody employee emp){
//		return new ResponseEntity<employee>(employeeService.saveEmployee(emp), HttpStatus.CREATED);
//	}
	
	@PostMapping("/employees")
	public employee saveEmployee(@RequestBody employee emp){
		return employeeService.saveEmployee(emp);
	}
	
	//build get all employee REST API
	@GetMapping("/get")
	public List<employee> getEmployees(){
		return employeeService.getAllEmployee();
	}
	//build get all employee id RESTAPI	
//	@GetMapping("/{id}")
//	public ResponseEntity<employee> getEmployeeById(@PathVariable("id") long employeeid){
//		return new ResponseEntity<employee>(employeeService.getEmployeeById(employeeid), HttpStatus.OK);
//	}
	
	@GetMapping("/{id}")
	public employee getEmployeeById(@PathVariable("id") long employeeid){
		return employeeService.getEmployeeById(employeeid);
	}
	
	//delete
	@DeleteMapping("/{id}")
	public void deleEmployeeById(@PathVariable("id")long employeeid) {
		employeeService.deleEmployeeById(employeeid);
	}
	
		

	
}
