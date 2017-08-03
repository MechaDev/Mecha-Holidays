package com.mechadev.holidays;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HolidayBuilder {
	private static HolidayBuilder instance;
	
	public static HolidayBuilder getInstance() { 
		if(instance == null) {
			instance = new HolidayBuilder();
		}
		return instance;
	}
	
	private HolidayBuilder() {
		calendar = new GregorianCalendar();
		calendar.clear();
	} 
	
	protected static int LAST_DAY_OF_WEEK_IN_MONTH = -1;
	
	private final Calendar calendar;
	
	private Holiday holiday;
	private int dayOfWeekInMonth;
	private int dayOfWeek;
	
	private boolean holidaySet;
	private boolean monthSet;
	private boolean daySet;
	private boolean yearSet;
	private boolean dayOfWeekInMonthSet;
	private boolean dayOfWeekSet;
	

	
	public HolidayBuilder setHoliday(Holiday holiday) {
		this.holiday = holiday;
		holidaySet = true;
		
		return this;
	}
	
	public HolidayBuilder setMonth(int month) {
		if(month < Calendar.JANUARY || month > Calendar.DECEMBER) {
			throw new HolidayBuilderException(String.format(HolidayBuilderException.MONTH_INDEX_OUT_OF_BOUNDS, month));
		}
		
		calendar.set(Calendar.MONTH, month);
		monthSet = true;
		
		if(daySet && calendar.get(Calendar.DAY_OF_MONTH) > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
			throw new HolidayBuilderException(String.format(HolidayBuilderException.DAY_INDEX_OUT_OF_BOUNDS, calendar.get(Calendar.DAY_OF_MONTH), month));
		}
		
		return this;
	}
	
	public HolidayBuilder setDay(int day) {
		if(monthSet  && (day < 0 || day > calendar.getActualMaximum(Calendar.DAY_OF_MONTH))) {
			throw new HolidayBuilderException(String.format(HolidayBuilderException.DAY_INDEX_OUT_OF_BOUNDS, day, calendar.get(Calendar.MONTH)));
		}
		
		calendar.set(Calendar.DAY_OF_MONTH, day);
		daySet = true;
		
		return this;
	}
	
	public HolidayBuilder setYear(int year) {
		calendar.set(Calendar.YEAR, year);
		this.yearSet = true;
		
		return this;
	}
	
	public HolidayBuilder setDayOfWeekInMonth(int dayOfWeekInMonth) {
//		if(dayOfWeekInMonth < 0) {
//			throw new HolidayBuilderException(String.format(HolidayBuilderException.DAY_OF_WEEK_IN_MONTH_INDEX_OUT_OF_BOUNDS, dayOfWeekInMonth));
//		}
		
		this.dayOfWeekInMonth = dayOfWeekInMonth;
		dayOfWeekInMonthSet = true;
		
		return this;
	}
	
	public HolidayBuilder setDayOfWeek(int dayOfWeek) { 
		if(dayOfWeek < Calendar.SUNDAY || dayOfWeek > Calendar.SATURDAY) {
			throw new HolidayBuilderException(String.format(HolidayBuilderException.DAY_OF_WEEK_INDEX_OUT_OF_BOUNDS, dayOfWeek));
		}
		
		this.dayOfWeek = dayOfWeek;
		dayOfWeekSet = true;
		
		return this;
	}
	
	public Date build() {
		
		if(!holidaySet)
			throw new HolidayBuilderException(HolidayBuilderException.HOLIDAY_ID_NOT_SET);
		
		switch(holiday) {
		
		//Static holidays
			case NEW_YEARS_DAY:
			case INDEPENDENCE_DAY:
			case VETERANS_DAY:
			case CHRISTMAS_DAY:
			case INAUGURATION_DAY:
				if(!monthSet) {
					throw new HolidayBuilderException(HolidayBuilderException.MONTH_NOT_SET);
				}
				
				if(!daySet) {
					throw new HolidayBuilderException(HolidayBuilderException.DAY_NOT_SET);
				}
				
				if(!yearSet) {
					calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
				}
				
				if(holiday == Holiday.INAUGURATION_DAY) {
					calendar.set(Calendar.YEAR, getNextLeapYear(calendar.get(Calendar.YEAR)));
				}
				
				break;
							
		//Dynamic holidays
			case MARTIN_LUTHER_KING_JR_DAY:
			case GEORGE_WASHINGTONS_BIRTHDAY:
			case MEMORIAL_DAY:
			case LABOR_DAY:
			case COLUMBUS_DAY:
			case THANKSGIVING_DAY:
				if(!monthSet) {
					throw new HolidayBuilderException(HolidayBuilderException.MONTH_NOT_SET);
				}
				
				if(!yearSet) {
					calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
				}
				
				if(!dayOfWeekInMonthSet) {
					throw new HolidayBuilderException(HolidayBuilderException.WEEK_APPEARENCE_NOT_SET);
				}
				
				if(!dayOfWeekSet) {
					throw new HolidayBuilderException(HolidayBuilderException.DAY_OF_WEEK_NOT_SET);
				}
				
				calendar.set(Calendar.DAY_OF_WEEK, dayOfWeek);
				calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);
				
				break;
		}
		
		return calendar.getTime();
		
	}
	
	private int getNextLeapYear(int year) {
		while(year % 4 != 0) year++;
		return year;
	}
	
	
	@SuppressWarnings("serial")
	class HolidayBuilderException extends RuntimeException {
		
		private static final String HOLIDAY_ID_NOT_SET = "Holiday ID not set";
		private static final String MONTH_NOT_SET = "Month not set";
		private static final String DAY_NOT_SET = "Day not set";
		private static final String WEEK_APPEARENCE_NOT_SET = "Day of week in month not set";
		private static final String DAY_OF_WEEK_NOT_SET = "Day of week not set";
		
		private static final String MONTH_INDEX_OUT_OF_BOUNDS = "Month index out of bounds: %d"; 
		private static final String DAY_INDEX_OUT_OF_BOUNDS = "Month index out of bounds: %d for month: %d"; 
		private static final String DAY_OF_WEEK_INDEX_OUT_OF_BOUNDS = "Day of week index out of bounds: %d";
		
		public HolidayBuilderException(String message) {
			super(message);
		}
	}
}
