package com.mechadev.holidays;

import java.util.Calendar;
import java.util.Date;

public class Holidays {
	
	public static Date get(Holiday holiday) {
		return get(holiday, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static Date get(Holiday holiday, int year) {
		HolidayBuilder holidayBuilder = null;
		switch(holiday) {
			case NEW_YEARS_DAY:
				holidayBuilder = buildNewYearsDay(year);
				break;
			case INAUGURATION_DAY:
				holidayBuilder = buildInaugurationDay(year);
				break;
				
			case MARTIN_LUTHER_KING_JR_DAY:
				holidayBuilder = buildMartinLutherKingJrDay(year);
				break;
				
			case GEORGE_WASHINGTONS_BIRTHDAY:
				holidayBuilder = buildGeorgeWashingtonsBirthday(year);
				break;
				
			case MEMORIAL_DAY:
				holidayBuilder = buildMemorialDay(year);
				break;
				
			case INDEPENDENCE_DAY:
				holidayBuilder = buildIndependenceDay(year);
				break;
				
			case LABOR_DAY:
				holidayBuilder = buildLaborDay(year);
				break;
				
			case COLUMBUS_DAY:
				holidayBuilder = buildColumbusDay(year);
				break;
				
			case VETERANS_DAY:
				holidayBuilder = buildVeteransDay(year);
				break;
				
			case THANKSGIVING_DAY:
				holidayBuilder = buildThanksgivingDay(year);
				break;
				
			case CHRISTMAS_DAY:
				holidayBuilder = buildChristmasDay(year);
				break;
				
			default:
				throw new HolidayException(String.format(HolidayException.HOLIDAY_ID_UNSUPPORTED, holiday.getName()));
		}
		
		return holidayBuilder.build();
	}
	
	private Holidays() { }
	
	private static HolidayBuilder buildNewYearsDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.NEW_YEARS_DAY)
				.setMonth(Calendar.JANUARY)
				.setDay(1)
				.setYear(year);
	}
	
	private static HolidayBuilder buildInaugurationDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.INAUGURATION_DAY)
				.setMonth(Calendar.JANUARY)
				.setDay(20)
				.setYear(year);
	}
	
	private static HolidayBuilder buildMartinLutherKingJrDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.MARTIN_LUTHER_KING_JR_DAY)
				.setMonth(Calendar.JANUARY)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(3)
				.setYear(year);
	}
	
	private static HolidayBuilder buildGeorgeWashingtonsBirthday(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.GEORGE_WASHINGTONS_BIRTHDAY)
				.setMonth(Calendar.FEBRUARY)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(3)
				.setYear(year);
	}
	
	private static HolidayBuilder buildMemorialDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.MEMORIAL_DAY)
				.setMonth(Calendar.MAY)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(HolidayBuilder.LAST_DAY_OF_WEEK_IN_MONTH)
				.setYear(year);
	}
	
	private static HolidayBuilder buildIndependenceDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.INDEPENDENCE_DAY)
				.setMonth(Calendar.JULY)
				.setDay(4)
				.setYear(year);
	}
	
	private static HolidayBuilder buildLaborDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.LABOR_DAY)
				.setMonth(Calendar.SEPTEMBER)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(1)
				.setYear(year);
	}
	
	private static HolidayBuilder buildColumbusDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.COLUMBUS_DAY)
				.setMonth(Calendar.OCTOBER)
				.setDayOfWeek(Calendar.MONDAY)
				.setDayOfWeekInMonth(2)
				.setYear(year);
	}
	
	private static HolidayBuilder buildVeteransDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.VETERANS_DAY)
				.setMonth(Calendar.NOVEMBER)
				.setDay(11)
				.setYear(year);
	}
	
	private static HolidayBuilder buildThanksgivingDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.THANKSGIVING_DAY)
				.setMonth(Calendar.NOVEMBER)
				.setDayOfWeek(Calendar.THURSDAY)
				.setDayOfWeekInMonth(4)
				.setYear(year);
	}
	
	private static HolidayBuilder buildChristmasDay(int year) {
		return HolidayBuilder
				.getInstance()
				.setHoliday(Holiday.CHRISTMAS_DAY)
				.setMonth(Calendar.DECEMBER)
				.setDay(25)
				.setYear(year);
	}
	
	@SuppressWarnings("serial")
	static class HolidayException extends RuntimeException {
		private static final String HOLIDAY_ID_UNSUPPORTED = "Holiday unsupported %s in current version";
		
		public HolidayException(String message) {
			super(message);
		}
	}
}