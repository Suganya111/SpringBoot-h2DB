package com.aaludra.employe.response;

	import com.aaludra.employee.entity.Employee;
import lombok.Getter;
	import lombok.Setter;

	@Setter
	@Getter
	public class EmployeeResponse {

		private long empId;
		
		private String empName;

		private String empCity;

		private String empSalary;
				
		public EmployeeResponse (Employee employee) {
			this.empId = employee.getEmpId();
			this.empName = employee.getEmpName();
			this.empCity = employee.getEmpCity();
			this.empSalary = employee.getEmpSalary();
			}
		}