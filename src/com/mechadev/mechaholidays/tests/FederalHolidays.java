package com.mechadev.mechaholidays.tests;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.mechadev.mechaholidays.enums.FederalHoliday;
import com.mechadev.mechaholidays.holidays.Holidays;

public class FederalHolidays extends AbstractTest {

	@Test
	public void newYearsDay() throws ParseException {
		Date newYearsDay   = Holidays.get(FederalHoliday.NEW_YEARS_DAY, year);
		assertTrue(newYearsDay.compareTo(simpleDateFormat.parse("January 1, 1974")) == 0);
	}	
	
	@Test
	public void inaugurationDay() throws ParseException {
		Date inaugurationDay   = Holidays.get(FederalHoliday.INAUGURATION_DAY, year);
		assertTrue(inaugurationDay.compareTo(simpleDateFormat.parse("January 20, 1976")) == 0);
	}	
	
	@Test
	public void martinLutherKingJrDay() throws ParseException {
		Date martinLutherKingJrDay   = Holidays.get(FederalHoliday.MARTIN_LUTHER_KING_JR_DAY, year);
		assertTrue(martinLutherKingJrDay.compareTo(simpleDateFormat.parse("January 21, 1974")) == 0);
	}	
	
	@Test
	public void georgeWashingtonsBirthday() throws ParseException {
		Date georgeWashingtonsBirthday   = Holidays.get(FederalHoliday.GEORGE_WASHINGTONS_BIRTHDAY, year);
		assertTrue(georgeWashingtonsBirthday.compareTo(simpleDateFormat.parse("February 18, 1974")) == 0);
	}	
	
	@Test
	public void memorialDay() throws ParseException {
		Date memorialDay   = Holidays.get(FederalHoliday.MEMORIAL_DAY, year);
		assertTrue(memorialDay.compareTo(simpleDateFormat.parse("May 27, 1974")) == 0);
	}	
	
	@Test
	public void independenceDay() throws ParseException {
		Date independenceDay   = Holidays.get(FederalHoliday.INDEPENDENCE_DAY, year);
		assertTrue(independenceDay.compareTo(simpleDateFormat.parse("July 4, 1974")) == 0);
	}	
	
	@Test
	public void laborDay() throws ParseException {
		Date laborDay   = Holidays.get(FederalHoliday.LABOR_DAY, year);
		assertTrue(laborDay.compareTo(simpleDateFormat.parse("September 2, 1974")) == 0);
	}	
	
	@Test
	public void columbusDay() throws ParseException {
		Date columbusDay   = Holidays.get(FederalHoliday.COLUMBUS_DAY, year);
		assertTrue(columbusDay.compareTo(simpleDateFormat.parse("October 14, 1974")) == 0);
	}	
	
	@Test
	public void veteransDay() throws ParseException {
		Date veteransDay   = Holidays.get(FederalHoliday.VETERANS_DAY, year);
		System.out.println(veteransDay);
		assertTrue(veteransDay.compareTo(simpleDateFormat.parse("October 28, 1974")) == 0);
	}	
	
	@Test
	public void thanksgiving() throws ParseException {
		Date thanksgiving   = Holidays.get(FederalHoliday.THANKSGIVING, year);
		assertTrue(thanksgiving.compareTo(simpleDateFormat.parse("November 28, 1974")) == 0);
	}	
}
