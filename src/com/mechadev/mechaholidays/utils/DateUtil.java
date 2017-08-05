package com.mechadev.mechaholidays.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date addDays(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return calendar.getTime();
	}
	
}
