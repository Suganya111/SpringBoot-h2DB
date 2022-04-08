package com.aaludra.employee.enums;

public enum EnumEmployee {
	G1 ("Java"), G2("Spring"), G3("Api");


	String path;

	EnumEmployee(String path) {
		this.path = path;
	}

	public static EnumEmployee choose(String code) {
		for (EnumEmployee values : EnumEmployee.values()) {
			if (values.path.equals(code))
				return values;
		}
		return null;
	}

}
