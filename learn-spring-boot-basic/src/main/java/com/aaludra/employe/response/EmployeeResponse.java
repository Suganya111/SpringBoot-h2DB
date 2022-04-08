package com.aaludra.employe.response;

	import java.util.Date;

import com.aaludra.employee.entity.Employee;

import lombok.Getter;
	import lombok.Setter;

	@Setter
	@Getter
	public class EmployeeResponse {

		private Long empId;
		
		private String empName;

		private String empCity;

		private String empDesignation;
		
		private String empSalary;

		private String empEffectiveDate;

				
		public EmployeeResponse (Employee employee) {
			this.empId = employee.getEmpId();
			this.empName = employee.getEmpName();
			this.empCity = employee.getEmpCity();
			this.empDesignation = employee.getEmpDesignation();
			
			this.empSalary =employee.getEmployeeSalary().getEmpSalary();
			this.empEffectiveDate = employee.getEmployeeSalary().getEmpEffectiveDate();
		}
		
		}