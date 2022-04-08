package com.aaludra.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateEmployeeReq {
	
	private Long empId;
	
	private String empName;

	private String empCity;

	private String empDesignation;

}
