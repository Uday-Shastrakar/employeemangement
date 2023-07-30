package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	// get all employee 
	List<Employee> getAllEmployee();
	
	// get single employee 
	Employee getEmployee(Long id );
	
	// create employee 
	Employee createEmployee(Employee emp);
	
	
	//update employee
	Employee updateEmployee(Employee emp);
	
	//delete employee 
	void deleteEmployee(Long id );
	
	
	
}
