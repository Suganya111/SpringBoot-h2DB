package com.aaludra.employee;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

@NoArgsConstructor
public class CreateEmployeeReq {

	private String empName;

	private String empCity;

	private String empDesignation;
	
	private String empSalary;

	private String empEffectiveDate;


}
