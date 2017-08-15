package com.mechadev.mechaholidays.holidays;

import java.util.Calendar;
import java.util.Date;

import com.mechadev.mechaholidays.builders.HolidayBuilder;
import com.mechadev.mechaholidays.enums.ChristianHoliday;
import com.mechadev.mechaholidays.utils.DateUtil;

class ChristianHolidaysUtil {

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
	
	static HolidayBuilder buildEpiphany(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.EPIPHANY)
				.setMonth(Calendar.JANUARY)
				.setDay(6)
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
	
	static HolidayBuilder buildHolySaturday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar holySaturday = Calendar.getInstance();
		holySaturday.setTime(DateUtil.addDays(easter, -1));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.HOLY_SATURDAY)
				.setMonth(holySaturday.get(Calendar.MONTH))
				.setDay(holySaturday.get(Calendar.DAY_OF_MONTH))
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
	
	static HolidayBuilder buildTrinitySunday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);

		Calendar trinitySunday = Calendar.getInstance();
		trinitySunday.setTime(DateUtil.addDays(easter, 56));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.TRINITY_SUNDAY)
				.setMonth(trinitySunday.get(Calendar.MONTH))
				.setDay(trinitySunday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildCorpusChristi(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);

		Calendar corpusChristi = Calendar.getInstance();
		corpusChristi.setTime(DateUtil.addDays(easter, 60));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.CORPUS_CHRISTI)
				.setMonth(corpusChristi.get(Calendar.MONTH))
				.setDay(corpusChristi.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildAssumptionOfMary(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.ASSUMPTION_OF_MARY)
				.setMonth(Calendar.AUGUST)
				.setDay(15)
				.setYear(year);
	}
	
	static HolidayBuilder buildWhitMonday(int year) {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		
		Calendar whitMonday = Calendar.getInstance();
		whitMonday.setTime(DateUtil.addDays(easter, 50));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.WHIT_MONDAY)
				.setMonth(whitMonday.get(Calendar.MONTH))
				.setDay(whitMonday.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildFeastOfStFrancisOfAssisi(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.FEAST_OF_ST_FRANCIS_ASSISI)
				.setMonth(Calendar.OCTOBER)
				.setDay(4)
				.setYear(year);
	}
	
	static HolidayBuilder buildAllSaintsDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.ALL_SAINTS_DAY)
				.setMonth(Calendar.NOVEMBER)
				.setDay(1)
				.setYear(year);
	}
	
	static HolidayBuilder buildAllSoulsDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.ALL_SOULS_DAY)
				.setMonth(Calendar.NOVEMBER)
				.setDay(2)
				.setYear(year);
	}
	
	static HolidayBuilder buildFirstSundayOfAdvent(int year) {
		int weeks = 4;
		int corrections = 0;
		
		Calendar christmas = Calendar.getInstance();
		christmas.set(year, Calendar.DECEMBER, 25);
		
		if(christmas.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			weeks--;
			corrections = christmas.get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY;
		}
		
		Calendar firstDayOfAdvent = Calendar.getInstance();
		firstDayOfAdvent.setTime(DateUtil.addDays(christmas.getTime(), -1 * ((weeks * 7) + corrections)));
		
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.FIRST_SUNDAY_OF_ADVENT)
				.setMonth(firstDayOfAdvent.get(Calendar.MONTH))
				.setDay(firstDayOfAdvent.get(Calendar.DAY_OF_MONTH))
				.setYear(year);
	}
	
	static HolidayBuilder buildFeastOfTheImmaculateConception(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.FEAST_OF_THE_IMMACULATE_CONCEPTION)
				.setMonth(Calendar.DECEMBER)
				.setDay(8)
				.setYear(year);
	}
	
	static HolidayBuilder buildChristmasEve(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(ChristianHoliday.CHRISTMAS_EVE)
				.setMonth(Calendar.DECEMBER)
				.setDay(24)
				.setYear(year);
	}
	
}
