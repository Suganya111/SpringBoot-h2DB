package com.aaludra.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaludra.employee.CreateEmployeeReq;
import com.aaludra.employee.entity.Employee;
import com.aaludra.employee.repo.EmployeeRepo;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepository;
	
	public List<Employee> getAllEmployee () {
		return employeeRepository.findAll();
	}
	
	public Employee createEmployee (CreateEmployeeReq createEmployeeRequest) {
		Employee employee = new Employee(createEmployeeRequest);
		
		employee = employeeRepository.save(employee);
		return employee;
	}
	
}
