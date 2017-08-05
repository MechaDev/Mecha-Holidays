package com.mechadev.mechaholidays.holidays;

import java.util.Calendar;

import com.mechadev.mechaholidays.builders.HolidayBuilder;
import com.mechadev.mechaholidays.enums.H.Season;

public class SeasonsUtil {
	
	static HolidayBuilder buildMarchEquinox(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Season.MARCH_EQUINOX)
				.setMonth(Calendar.MARCH)
				.setDay(20)
				.setYear(year);
	}
	
	static HolidayBuilder buildJuneSolstice(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Season.JUNE_SOLSTICE)
				.setMonth(Calendar.JUNE)
				.setDay(21)
				.setYear(year);
	}

	static HolidayBuilder buildSeptemberEquinox(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Season.SEPTEMBER_EQUINOX)
				.setMonth(Calendar.SEPTEMBER)
				.setDay(22)
				.setYear(year);
	}
	
	static HolidayBuilder buildDecemberSolstice(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Season.DECEMBER_SOLSTICE)
				.setMonth(Calendar.DECEMBER)
				.setDay(21)
				.setYear(year);
	}
}
