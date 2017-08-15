package com.mechadev.mechaholidays.holidays;

import java.util.Calendar;

import com.mechadev.mechaholidays.builders.HolidayBuilder;
import com.mechadev.mechaholidays.enums.FederalHoliday;

class FederalHolidaysUtil {

	protected static HolidayBuilder buildNewYearsDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.NEW_YEARS_DAY)
				.setMonth(Calendar.JANUARY)
				.setDay(1)
				.setYear(year);
	}

	protected static HolidayBuilder buildInaugurationDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.INAUGURATION_DAY)
				.setMonth(Calendar.JANUARY)
				.setDay(20)
				.setYear(year);
	}

	protected static HolidayBuilder buildMartinLutherKingJrDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.MARTIN_LUTHER_KING_JR_DAY)
				.setMonth(Calendar.JANUARY)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(3)
				.setYear(year);
	}

	protected static HolidayBuilder buildGeorgeWashingtonsBirthday(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.GEORGE_WASHINGTONS_BIRTHDAY)
				.setMonth(Calendar.FEBRUARY)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(3)
				.setYear(year);
	}

	protected static HolidayBuilder buildMemorialDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.MEMORIAL_DAY)
				.setMonth(Calendar.MAY)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(Holidays.LAST_DAY_OF_WEEK_IN_MONTH)
				.setYear(year);
	}

	protected static HolidayBuilder buildIndependenceDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.INDEPENDENCE_DAY)
				.setMonth(Calendar.JULY)
				.setDay(4)
				.setYear(year);
	}

	protected static HolidayBuilder buildLaborDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.LABOR_DAY)
				.setMonth(Calendar.SEPTEMBER)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(1)
				.setYear(year);
	}

	protected static HolidayBuilder buildColumbusDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.COLUMBUS_DAY)
				.setMonth(Calendar.OCTOBER)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(2)
				.setYear(year);
	}

	protected static HolidayBuilder buildVeteransDay(int year) {
		if(year >= 1971 && year <= 1977) {
			return HolidayBuilder
					.getInstance()
					.setHoliday(FederalHoliday.VETERANS_DAY)
					.setMonth(Calendar.OCTOBER)
					.setDayOfWeek(Calendar.MONDAY)
					.setDayOfWeekInMonth(4)
					.setYear(year);
		} else {
			return HolidayBuilder
					.getInstance()
					.setHoliday(FederalHoliday.VETERANS_DAY)
					.setMonth(Calendar.NOVEMBER)
					.setDay(11)
					.setYear(year);
		}
	}

	protected static HolidayBuilder buildThanksgivingDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.THANKSGIVING)
				.setMonth(Calendar.NOVEMBER)
				.setDayOfWeek(Calendar.THURSDAY)
				.setDayOfWeekInMonth(4)
				.setYear(year);
	}

	protected static HolidayBuilder buildChristmasDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(FederalHoliday.CHRISTMAS_DAY)
				.setMonth(Calendar.DECEMBER)
				.setDay(25)
				.setYear(year);
	}

}
