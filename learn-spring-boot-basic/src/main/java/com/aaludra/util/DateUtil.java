package com.aaludra.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertStringToDate(String input) {
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");

		try {
			Date date;
			date = formatter.parse(input);

			return new Date(date.getTime());
		} catch (Exception e) {


			return null;
		}

}
}