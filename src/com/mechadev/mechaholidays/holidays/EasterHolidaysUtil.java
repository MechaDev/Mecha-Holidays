package com.mechadev.mechaholidays.holidays;

import java.util.Calendar;
import java.util.Date;

import com.mechadev.mechaholidays.builders.HolidayBuilder;
import com.mechadev.mechaholidays.enums.H.ChristianHoliday;
import com.mechadev.mechaholidays.utils.DateUtil;

class EasterHolidaysUtil {

	public static HolidayBuilder buildEaster(int year) {
	      int a = year % 19,
	    	  b = year / 100,
	          c = year % 100,
	          d = b / 4,
	          e = b % 4,
	          f = (8 * b + 13) / 25,
	          g = (19 * a + b - d - f + 15) % 30,
	          h = c / 4,
	          i = c % 4,
	          j = (a + 11 * g) / 319,
	          k = (2 * e + 2 * h - i - g + j + 32) % 7,
	          month = (g - j + k + 90) / 25 - 1,
	          day = (g - j + k + month + 20) % 32;

		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.EASTER)
				.setMonth(month)
				.setDay(day)
				.setYear(year);
	}
	
	static HolidayBuilder buildShroveTuesday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar easterMonday = Calendar.getInstance();
		easterMonday.setTime(DateUtil.addDays(easter, -47));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.SHROVE_TUESDAY)
				.setMonth(easterMonday.get(Calendar.MONTH))
				.setDay(easterMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildAshWednesday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar easterMonday = Calendar.getInstance();
		easterMonday.setTime(DateUtil.addDays(easter, -46));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.ASH_WEDNESDAY)
				.setMonth(easterMonday.get(Calendar.MONTH))
				.setDay(easterMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildPalmSundayu(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar easterMonday = Calendar.getInstance();
		easterMonday.setTime(DateUtil.addDays(easter, -7));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.PALM_SUNDAY)
				.setMonth(easterMonday.get(Calendar.MONTH))
				.setDay(easterMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildMaundyThursday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar easterMonday = Calendar.getInstance();
		easterMonday.setTime(DateUtil.addDays(easter, -3));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.MAUNDY_THURSDAY)
				.setMonth(easterMonday.get(Calendar.MONTH))
				.setDay(easterMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildGoodFriday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar easterMonday = Calendar.getInstance();
		easterMonday.setTime(DateUtil.addDays(easter, -2));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.GOOD_FRIDAY)
				.setMonth(easterMonday.get(Calendar.MONTH))
				.setDay(easterMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildEasterMonday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar easterMonday = Calendar.getInstance();
		easterMonday.setTime(DateUtil.addDays(easter, 1));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.EASTER_MONDAY)
				.setMonth(easterMonday.get(Calendar.MONTH))
				.setDay(easterMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildAscensionDay(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar pentecostSunday = Calendar.getInstance();
		pentecostSunday.setTime(DateUtil.addDays(easter, 39));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.ASCENSION_DAY)
				.setMonth(pentecostSunday.get(Calendar.MONTH))
				.setDay(pentecostSunday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildPentecost(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);

		Calendar pentecostSunday = Calendar.getInstance();
		pentecostSunday.setTime(DateUtil.addDays(easter, 49));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.PENTECOST)
				.setMonth(pentecostSunday.get(Calendar.MONTH))
				.setDay(pentecostSunday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildPentecostMonday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar pentecostMonday = Calendar.getInstance();
		pentecostMonday.setTime(DateUtil.addDays(easter, 50));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.PENTECOST_MONDAY)
				.setMonth(pentecostMonday.get(Calendar.MONTH))
				.setDay(pentecostMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
}
