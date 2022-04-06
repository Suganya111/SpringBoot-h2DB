package com.aaludra.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.aaludra.employee.CreateEmployeeReq;
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

	@Column(name = "emp_salary")
	private String empSalary;

	public Employee(CreateEmployeeReq createEmployeeRequest) {
		this.empName = createEmployeeRequest.getEmpName();
		this.empCity = createEmployeeRequest.getEmpCity();
		this.empSalary = createEmployeeRequest.getEmpSalary();
	}
}
