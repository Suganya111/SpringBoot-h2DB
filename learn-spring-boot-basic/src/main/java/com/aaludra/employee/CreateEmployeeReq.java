package com.aaludra.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CreateEmployeeReq {

	private String empName;

	private String empCity;

	private String empSalary;

}
