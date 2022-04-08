package com.aaludra.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.aaludra.employee.CreateEmployeeReq;
import com.aaludra.employee.enums.EnumEmployee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private Long empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_city")
	private String empCity;

	@Column(name = "emp_designation")
	private String empDesignation;
	
	@OneToOne
	@JoinColumn(name = "salary_id")
	private EmployeeSalary employeeSalary;
	
	private EnumEmployee enumEmployee;
	
	public Employee(CreateEmployeeReq createEmployeeRequest) {
		this.empName = createEmployeeRequest.getEmpName();
		this.empCity = createEmployeeRequest.getEmpCity();
		this.empDesignation = createEmployeeRequest.getEmpDesignation();		
	}
}
