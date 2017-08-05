package com.mechadev.mechaholidays.tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.mechadev.mechaholidays.enums.H.ChristianHoliday;
import com.mechadev.mechaholidays.holidays.Holidays;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EasterHolidays extends AbstractTest {

	@Test
	public void shroveThursday() throws ParseException {
		Date shroveTuesday   = Holidays.get(ChristianHoliday.SHROVE_TUESDAY, year);
		assertTrue(shroveTuesday.compareTo(simpleDateFormat.parse("February 26, 1974")) == 0);
	}
	
	@Test
	public void ashWednesday() throws ParseException {
		Date ashWednesday   = Holidays.get(ChristianHoliday.ASH_WEDNESDAY, year);
		assertTrue(ashWednesday.compareTo(simpleDateFormat.parse("February 27, 1974")) == 0);
	}
	
	@Test
	public void palmSunday() throws ParseException {
		Date palmSunday   = Holidays.get(ChristianHoliday.PALM_SUNDAY, year);
		assertTrue(palmSunday.compareTo(simpleDateFormat.parse("April 7, 1974")) == 0);
	}
	
	@Test
	public void maundyThursday() throws ParseException {
		Date maundyThursday   = Holidays.get(ChristianHoliday.MAUNDY_THURSDAY, year);
		assertTrue(maundyThursday.compareTo(simpleDateFormat.parse("April 11, 1974")) == 0);
	}
	
	@Test
	public void goodFriday() throws ParseException {
		Date goodFriday   = Holidays.get(ChristianHoliday.GOOD_FRIDAY, year);
		assertTrue(goodFriday.compareTo(simpleDateFormat.parse("April 12, 1974")) == 0);
	}

	@Test
	public void easter() throws ParseException {
		Date easter = Holidays.get(ChristianHoliday.EASTER, year);
		assertTrue(easter.compareTo(simpleDateFormat.parse("April 14, 1974")) == 0);
	}
	
	@Test
	public void easterMonday() throws ParseException {
		Date easterMonday = Holidays.get(ChristianHoliday.EASTER_MONDAY, year);
		assertTrue(easterMonday.compareTo(simpleDateFormat.parse("April 15, 1974")) == 0);
	}
	
	@Test
	public void ascensionDay() throws ParseException {
		Date ascensionDay = Holidays.get(ChristianHoliday.ASCENSION_DAY, year);
		assertTrue(ascensionDay.compareTo(simpleDateFormat.parse("May 23, 1974")) == 0);
	}
	
	@Test
	public void pentecost() throws ParseException {
		Date pentecost = Holidays.get(ChristianHoliday.PENTECOST, year);
		assertTrue(pentecost.compareTo(simpleDateFormat.parse("June 2, 1974")) == 0);
	}
	
	@Test
	public void pentecostMonday() throws ParseException {
		Date pentecostMonday = Holidays.get(ChristianHoliday.PENTECOST_MONDAY, year);
		assertTrue(pentecostMonday.compareTo(simpleDateFormat.parse("June 3, 1974")) == 0);
	}
}
