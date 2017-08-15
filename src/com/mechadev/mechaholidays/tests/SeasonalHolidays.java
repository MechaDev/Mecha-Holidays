package com.mechadev.mechaholidays.tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.mechadev.mechaholidays.enums.SeasonalHoliday;
import com.mechadev.mechaholidays.holidays.Holidays;

public class SeasonalHolidays extends AbstractTest {

	@Test
	public void marchEquinox() throws ParseException {
		Date marchEquinox   = Holidays.get(SeasonalHoliday.MARCH_EQUINOX, year);
		assertTrue(marchEquinox.compareTo(simpleDateFormat.parse("March 20, 1974")) == 0);
	}
	
	@Test
	public void juneSolstice() throws ParseException {
		Date juneSolstice   = Holidays.get(SeasonalHoliday.JUNE_SOLSTICE, year);
		assertTrue(juneSolstice.compareTo(simpleDateFormat.parse("June 21, 1974")) == 0);
	}

	@Test
	public void septemberEquinox() throws ParseException {
		Date septemberEquinox   = Holidays.get(SeasonalHoliday.SEPTEMBER_EQUINOX, year);
		assertTrue(septemberEquinox.compareTo(simpleDateFormat.parse("September 22, 1974")) == 0);
	}
	
	@Test
	public void decemberSolstice() throws ParseException {
		Date decemberSolstice   = Holidays.get(SeasonalHoliday.DECEMBER_SOLSTICE, year);
		assertTrue(decemberSolstice.compareTo(simpleDateFormat.parse("December 21, 1974")) == 0);
	}
}
