package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
 @Autowired
	EmployeeService service;
	
	// get all employee
@GetMapping("/getall")
	List<Employee> getAllEmployee() {
       return service.getAllEmployee();
	}

	// get single employee
@GetMapping("/get")
	Employee getEmployee(@PathVariable Long id) {
      return service.getEmployee(id);
	}

	// create employee
@PostMapping("/create")
	Employee createEmployee(@RequestBody Employee emp) {
      
	return service.createEmployee(emp);
	}

	// update employee
@PutMapping("/update")
	Employee updateEmployee(@RequestBody Employee emp) {
      
	 return service.updateEmployee(emp);
	 
	}

	// delete employee
@DeleteMapping("/del")
	void deleteEmployee(@PathVariable Long id) {
       service.deleteEmployee(id);
	}

}
