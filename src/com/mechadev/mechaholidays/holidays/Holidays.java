package com.mechadev.mechaholidays.holidays;

import java.util.Calendar;
import java.util.Date;

import com.mechadev.mechaholidays.builders.HolidayBuilder;
import com.mechadev.mechaholidays.enums.H;
import com.mechadev.mechaholidays.enums.H.ChristianHoliday;
import com.mechadev.mechaholidays.enums.H.Season;

public class Holidays {
	
	public static Date get(H.FederalHoliday federal) {
		return get(federal, Calendar.getInstance().get(Calendar.YEAR));
	}

	public static Date get(H.ChristianHoliday christian) {
		return get(christian, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static Date get(H.Season season) {
		return get(season, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static Date get(H.FederalHoliday federal, int year) {
		HolidayBuilder holidayBuilder = null;
		switch(federal) {
		case NEW_YEARS_DAY:
			holidayBuilder = FederalHolidaysUtil.buildNewYearsDay(year);
			break;
		case INAUGURATION_DAY:
			holidayBuilder = FederalHolidaysUtil.buildInaugurationDay(year);
			break;
			
		case MARTIN_LUTHER_KING_JR_DAY:
			holidayBuilder = FederalHolidaysUtil.buildMartinLutherKingJrDay(year);
			break;
			
		case GEORGE_WASHINGTONS_BIRTHDAY:
			holidayBuilder = FederalHolidaysUtil.buildGeorgeWashingtonsBirthday(year);
			break;
			
		case MEMORIAL_DAY:
			holidayBuilder = FederalHolidaysUtil.buildMemorialDay(year);
			break;
			
		case INDEPENDENCE_DAY:
			holidayBuilder = FederalHolidaysUtil.buildIndependenceDay(year);
			break;
			
		case LABOR_DAY:
			holidayBuilder = FederalHolidaysUtil.buildLaborDay(year);
			break;
			
		case COLUMBUS_DAY:
			holidayBuilder = FederalHolidaysUtil.buildColumbusDay(year);
			break;
			
		case VETERANS_DAY:
			holidayBuilder = FederalHolidaysUtil.buildVeteransDay(year);
			break;
			
		case THANKSGIVING:
			holidayBuilder = FederalHolidaysUtil.buildThanksgivingDay(year);
			break;
			
		case CHRISTMAS_DAY:
			holidayBuilder = FederalHolidaysUtil.buildChristmasDay(year);
			break;
			
		default:
			throw new HolidayException(String.format(HolidayException.HOLIDAY_ID_UNSUPPORTED, federal.getName()));
		}
		
		return holidayBuilder.build();
	}
	
	public static Date get(ChristianHoliday christian, int year) {
		HolidayBuilder holidayBuilder = null;
		switch(christian) {
		case SHROVE_TUESDAY:
			holidayBuilder = EasterHolidaysUtil.buildShroveTuesday(year);
			break;
			
		case ASH_WEDNESDAY:
			holidayBuilder = EasterHolidaysUtil.buildAshWednesday(year);
			break;
			
		case PALM_SUNDAY:
			holidayBuilder = EasterHolidaysUtil.buildPalmSundayu(year);
			break;
			
		case MAUNDY_THURSDAY:
			holidayBuilder = EasterHolidaysUtil.buildMaundyThursday(year);
			break;
			
		case GOOD_FRIDAY:
			holidayBuilder = EasterHolidaysUtil.buildGoodFriday(year);
			break;
			
		case EASTER:
			holidayBuilder = EasterHolidaysUtil.buildEaster(year);
			break;
			
		case EASTER_MONDAY:
			holidayBuilder = EasterHolidaysUtil.buildEasterMonday(year);
			break;
		
		case ASCENSION_DAY:
			holidayBuilder = EasterHolidaysUtil.buildAscensionDay(year);
			break;
			
		case PENTECOST:
			holidayBuilder = EasterHolidaysUtil.buildPentecost(year);
			break;
		
		case PENTECOST_MONDAY:
			holidayBuilder = EasterHolidaysUtil.buildPentecostMonday(year);
			break;
			
		default:
			throw new HolidayException(String.format(HolidayException.HOLIDAY_ID_UNSUPPORTED, christian.getName()));
		}
		
		return holidayBuilder.build();
	}
	
	public static Date get(Season season, int year) {
		HolidayBuilder holidayBuilder = null;
		switch(season) {
		case MARCH_EQUINOX:
			holidayBuilder = SeasonsUtil.buildMarchEquinox(year);
			break;
		
		case JUNE_SOLSTICE:
			holidayBuilder = SeasonsUtil.buildJuneSolstice(year);
			break;
		
		case SEPTEMBER_EQUINOX:
			holidayBuilder = SeasonsUtil.buildSeptemberEquinox(year);
			break;
			
		case DECEMBER_SOLSTICE:
			holidayBuilder = SeasonsUtil.buildDecemberSolstice(year);
			break;
			
		default:
			throw new HolidayException(String.format(HolidayException.HOLIDAY_ID_UNSUPPORTED, season.getName()));
		}
		
		return holidayBuilder.build();
	}
	
	private Holidays() { }
	
	protected static final int LAST_DAY_OF_WEEK_IN_MONTH = -1;
		
	@SuppressWarnings("serial")
	static class HolidayException extends RuntimeException {
		private static final String HOLIDAY_ID_UNSUPPORTED = "Holiday unsupported %s in current version";
		
		public HolidayException(String message) {
			super(message);
		}
	}
}