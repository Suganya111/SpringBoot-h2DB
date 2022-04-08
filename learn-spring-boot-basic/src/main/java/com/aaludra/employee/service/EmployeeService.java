package com.aaludra.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaludra.employee.CreateEmployeeReq;
import com.aaludra.employee.UpdateEmployeeReq;
import com.aaludra.employee.entity.Employee;
import com.aaludra.employee.entity.EmployeeSalary;
import com.aaludra.employee.repo.EmployeeRepo;
import com.aaludra.employee.repo.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepository;
	@Autowired
	EmployeeRepository employeeSalaryRepository;
	
	public List<Employee> getAllEmployee () {
		return employeeRepository.findAll();
	}
		public Employee createEmployee (CreateEmployeeReq createStudentRequest) {
		Employee employee = new Employee(createStudentRequest);
		
		EmployeeSalary employeeSalary = new EmployeeSalary();
		employeeSalary.setEmpSalary(createStudentRequest.getEmpSalary());
		employeeSalary.setEmpEffectiveDate(createStudentRequest.getEmpEffectiveDate());
		
		employeeSalary = employeeSalaryRepository.save(employeeSalary);
		
		employee.setEmployeeSalary(employeeSalary);
		employee = employeeRepository.save(employee);
		return employee;
	}

	public Employee updateEmployee (UpdateEmployeeReq updateEmployeeRequest) {
		Employee employee = employeeRepository.findById(updateEmployeeRequest.getEmpId()).get();
		
		if (updateEmployeeRequest.getEmpName() != null && 
				!updateEmployeeRequest.getEmpName().isEmpty()) {
			employee.setEmpName(updateEmployeeRequest.getEmpName());
		}
		if (updateEmployeeRequest.getEmpCity() != null && 
				!updateEmployeeRequest.getEmpCity().isEmpty()) {
			employee.setEmpCity(updateEmployeeRequest.getEmpCity());
		}
		if (updateEmployeeRequest.getEmpDesignation() != null && 
				!updateEmployeeRequest.getEmpDesignation().isEmpty()) {
			employee.setEmpDesignation(updateEmployeeRequest.getEmpDesignation());
		}
		
		employee = employeeRepository.save(employee);
		return employee;
	}
	
	public String deleteEmployee (long id) {
		employeeRepository.deleteById(id);
		return "Employee ID has been deleted successfully";
	}
	
	public List<Employee> getByEmpName (String empName) {
		return employeeRepository.findByEmpName(empName);
	}
}
