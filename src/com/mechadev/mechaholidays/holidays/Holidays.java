package com.mechadev.mechaholidays.holidays;

import java.util.Calendar;
import java.util.Date;

import com.mechadev.mechaholidays.builders.HolidayBuilder;
import com.mechadev.mechaholidays.enums.ChristianHoliday;
import com.mechadev.mechaholidays.enums.FederalHoliday;
import com.mechadev.mechaholidays.enums.SeasonalHoliday;

public class Holidays {
	
	public static Date get(FederalHoliday federal) {
		return get(federal, Calendar.getInstance().get(Calendar.YEAR));
	}

	public static Date get(ChristianHoliday christian) {
		return get(christian, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static Date get(SeasonalHoliday season) {
		return get(season, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static Date get(FederalHoliday federal, int year) {
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
		case EPIPHANY:
			holidayBuilder = ChristianHolidaysUtil.buildEpiphany(year);
			break;
			
		case SHROVE_TUESDAY:
			holidayBuilder = ChristianHolidaysUtil.buildShroveTuesday(year);
			break;
			
		case ASH_WEDNESDAY:
			holidayBuilder = ChristianHolidaysUtil.buildAshWednesday(year);
			break;
			
		case PALM_SUNDAY:
			holidayBuilder = ChristianHolidaysUtil.buildPalmSundayu(year);
			break;
			
		case MAUNDY_THURSDAY:
			holidayBuilder = ChristianHolidaysUtil.buildMaundyThursday(year);
			break;
			
		case GOOD_FRIDAY:
			holidayBuilder = ChristianHolidaysUtil.buildGoodFriday(year);
			break;
			
		case HOLY_SATURDAY:
			holidayBuilder = ChristianHolidaysUtil.buildHolySaturday(year);
			break;
			
		case EASTER:
			holidayBuilder = ChristianHolidaysUtil.buildEaster(year);
			break;
			
		case EASTER_MONDAY:
			holidayBuilder = ChristianHolidaysUtil.buildEasterMonday(year);
			break;
		
		case ASCENSION_DAY:
			holidayBuilder = ChristianHolidaysUtil.buildAscensionDay(year);
			break;
			
		case PENTECOST:
			holidayBuilder = ChristianHolidaysUtil.buildPentecost(year);
			break;
		
		case WHIT_MONDAY:
			holidayBuilder = ChristianHolidaysUtil.buildWhitMonday(year);
			break;
			
		case TRINITY_SUNDAY:
			holidayBuilder = ChristianHolidaysUtil.buildTrinitySunday(year);
			break;
			
		case CORPUS_CHRISTI:
			holidayBuilder = ChristianHolidaysUtil.buildCorpusChristi(year);
			break;
			
		case ASSUMPTION_OF_MARY:
			holidayBuilder = ChristianHolidaysUtil.buildAssumptionOfMary(year);
			break;
			
		case FEAST_OF_ST_FRANCIS_ASSISI:
			holidayBuilder = ChristianHolidaysUtil.buildFeastOfStFrancisOfAssisi(year);
			break;
			
		case ALL_SAINTS_DAY:
			holidayBuilder = ChristianHolidaysUtil.buildAllSaintsDay(year);
			break;
			
		case ALL_SOULS_DAY:
			holidayBuilder = ChristianHolidaysUtil.buildAllSoulsDay(year);
			break;
			
		case FIRST_SUNDAY_OF_ADVENT:
			holidayBuilder = ChristianHolidaysUtil.buildFirstSundayOfAdvent(year);
			break;
			
		case FEAST_OF_THE_IMMACULATE_CONCEPTION:
			holidayBuilder = ChristianHolidaysUtil.buildFeastOfTheImmaculateConception(year);
			break;
			
		case CHRISTMAS_EVE:
			holidayBuilder = ChristianHolidaysUtil.buildChristmasEve(year);
			break;
			
		case CHRISTMAS:
			holidayBuilder = FederalHolidaysUtil.buildChristmasDay(year);
			break;
			
		default:
			throw new HolidayException(String.format(HolidayException.HOLIDAY_ID_UNSUPPORTED, christian.getName()));
		}
		
		return holidayBuilder.build();
	}
	
	public static Date get(SeasonalHoliday season, int year) {
		HolidayBuilder holidayBuilder = null;
		switch(season) {
		case MARCH_EQUINOX:
			holidayBuilder = SeasonalHolidaysUtil.buildMarchEquinox(year);
			break;
		
		case JUNE_SOLSTICE:
			holidayBuilder = SeasonalHolidaysUtil.buildJuneSolstice(year);
			break;
		
		case SEPTEMBER_EQUINOX:
			holidayBuilder = SeasonalHolidaysUtil.buildSeptemberEquinox(year);
			break;
			
		case DECEMBER_SOLSTICE:
			holidayBuilder = SeasonalHolidaysUtil.buildDecemberSolstice(year);
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