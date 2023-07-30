package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeSeviceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;

// get all records  
	@Override
	public List<Employee> getAllEmployee() {

		return repo.findAll();
	}

// get record by id 
	@Override
	public Employee getEmployee(Long id) {

		return repo.findById(id).get();
	}

// create record 
	@Override
	public Employee createEmployee(Employee emp) {

		return repo.save(emp);
	}

//update record by id 
	@Override
	public Employee updateEmployee(Employee emp) {
		Employee obj = repo.findById(emp.getId()).get();
		obj.setFirstName(emp.getFirstName());
		obj.setLastName(emp.getLastName());
		obj.setEmail(emp.getEmail());
		return repo.save(obj);
	}

// delete record 
	@Override
	public void deleteEmployee(Long id) {
        repo.deleteById(id);
	}

}
