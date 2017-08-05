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
public class ChristianHolidays extends AbstractTest {

	@Test
	public void epiphany() throws ParseException {
		Date epiphany   = Holidays.get(ChristianHoliday.EPIPHANY, year);
		assertTrue(epiphany.compareTo(simpleDateFormat.parse("January 6, 1974")) == 0);
	}
	
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
	public void holySaturday() throws ParseException {
		Date holySaturday   = Holidays.get(ChristianHoliday.HOLY_SATURDAY, year);
		assertTrue(holySaturday.compareTo(simpleDateFormat.parse("April 13, 1974")) == 0);
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
	public void corpusChristi() throws ParseException {
		Date corpusChristi = Holidays.get(ChristianHoliday.CORPUS_CHRISTI, year);
		assertTrue(corpusChristi.compareTo(simpleDateFormat.parse("June 13, 1974")) == 0);
	}

	@Test
	public void assumptionOfMary() throws ParseException {
		Date assumptionOfMary = Holidays.get(ChristianHoliday.ASSUMPTION_OF_MARY, year);
		assertTrue(assumptionOfMary.compareTo(simpleDateFormat.parse("August 15, 1974")) == 0);
	}
	
	@Test
	public void trinitySunday() throws ParseException {
		Date trinitySunday = Holidays.get(ChristianHoliday.TRINITY_SUNDAY, year);
		assertTrue(trinitySunday.compareTo(simpleDateFormat.parse("June 9, 1974")) == 0);
	}
	
	@Test
	public void whitMonday() throws ParseException {
		Date whitMonday = Holidays.get(ChristianHoliday.WHIT_MONDAY, year);
		assertTrue(whitMonday.compareTo(simpleDateFormat.parse("June 3, 1974")) == 0);
	}
	
	@Test
	public void feastOfStFrancisOfAssisi() throws ParseException {
		Date feastPfStFramcosOfAssisi = Holidays.get(ChristianHoliday.FEAST_OF_ST_FRANCIS_ASSISI, year);
		assertTrue(feastPfStFramcosOfAssisi.compareTo(simpleDateFormat.parse("October 4, 1974")) == 0);
	}
	
	@Test
	public void allSaintsDay() throws ParseException {
		Date allSaintsDay = Holidays.get(ChristianHoliday.ALL_SAINTS_DAY, year);
		assertTrue(allSaintsDay.compareTo(simpleDateFormat.parse("November 1, 1974")) == 0);
	}
	
	@Test
	public void allSoulsDay() throws ParseException {
		Date allSoulsDay = Holidays.get(ChristianHoliday.ALL_SOULS_DAY, year);
		assertTrue(allSoulsDay.compareTo(simpleDateFormat.parse("November 2, 1974")) == 0);
	}
	
	@Test
	public void firstDayOfAdvent() throws ParseException {
		Date firstDayOfAdvent = Holidays.get(ChristianHoliday.FIRST_SUNDAY_OF_ADVENT, year);
		System.out.println(firstDayOfAdvent);
		assertTrue(firstDayOfAdvent.compareTo(simpleDateFormat.parse("December 1, 1974")) == 0);
	}
	
	@Test
	public void feastOfTheImmaculateConception() throws ParseException {
		Date feastOfTheImmaculateConception = Holidays.get(ChristianHoliday.FEAST_OF_THE_IMMACULATE_CONCEPTION, year);
		assertTrue(feastOfTheImmaculateConception.compareTo(simpleDateFormat.parse("December 8, 1974")) == 0);
	}
	
	@Test
	public void christmasEve() throws ParseException {
		Date christmasEve = Holidays.get(ChristianHoliday.CHRISTMAS_EVE, year);
		assertTrue(christmasEve.compareTo(simpleDateFormat.parse("December 24, 1974")) == 0);
	}
	
	@Test
	public void christmas() throws ParseException {
		Date christmas = Holidays.get(ChristianHoliday.CHRISTMAS, year);
		assertTrue(christmas.compareTo(simpleDateFormat.parse("December 25, 1974")) == 0);
	}
}
