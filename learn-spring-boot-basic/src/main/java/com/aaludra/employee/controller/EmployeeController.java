package com.aaludra.employee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaludra.employe.response.EmployeeResponse;
import com.aaludra.employee.CreateEmployeeReq;
import com.aaludra.employee.UpdateEmployeeReq;
import com.aaludra.employee.entity.Employee;
import com.aaludra.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getAll")
	public List<EmployeeResponse> getAllEmployee () {
		List<Employee> employeeList = employeeService.getAllEmployee();
		List<EmployeeResponse> employeeResponseList = new ArrayList<EmployeeResponse>();
		
		employeeList.stream().forEach(employee -> {
			employeeResponseList.add(new EmployeeResponse(employee));
		});
		
		return employeeResponseList;
	}
	
	@PostMapping("create")
	public EmployeeResponse createEmployee (@Valid @RequestBody CreateEmployeeReq createEmployeeRequest) {
		Employee employee = employeeService.createEmployee(createEmployeeRequest);
		
		return new EmployeeResponse(employee);
	}

	@PutMapping("update")
	public EmployeeResponse updateEmployee (@Valid @RequestBody UpdateEmployeeReq updateEmployeeRequest) {
		Employee employee = employeeService.updateEmployee(updateEmployeeRequest);
		
		return new EmployeeResponse(employee);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent (@PathVariable long id) {
		return employeeService.deleteEmployee(id);
	}
	
	@GetMapping("getByFirstName/{empName}")
	public List<EmployeeResponse> getByEmpName (@PathVariable String empName) {
		List<Employee> employeeList = employeeService.getByEmpName(empName);
		
		List<EmployeeResponse> employeeResponseList = new ArrayList<EmployeeResponse>();
		
		employeeList.stream().forEach(employee -> {
			employeeResponseList.add(new EmployeeResponse(employee));
		});
		
		return employeeResponseList;
	}
	
	
}
