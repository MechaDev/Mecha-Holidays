package com.mechadev.mechaholidays.enums;


public class H {

	public enum FederalHoliday implements Holiday {
		NEW_YEARS_DAY("New Years Day"),
		INAUGURATION_DAY("Inauguration Day"),
		MARTIN_LUTHER_KING_JR_DAY("Martin Luther King Jr Day"),
		GEORGE_WASHINGTONS_BIRTHDAY("George Washington's Birthday"),
		MEMORIAL_DAY("Memorial Day"),
		INDEPENDENCE_DAY("Independence Day"),
		LABOR_DAY("Labor Day"),
		COLUMBUS_DAY("Columbus Day"),
		VETERANS_DAY("Verterans Day"),
		THANKSGIVING("Thanksgiving"),
		CHRISTMAS_DAY("Christmas");
		
		private final String name;
		
		private FederalHoliday(String name) { this.name = name; }
		
		@Override
		public String getName() { return name; }
	}
	
	public enum ChristianHoliday implements Holiday {
		EPIPHANY("Epiphany"),
		SHROVE_TUESDAY("Shrove Tuesday"),
		ASH_WEDNESDAY("Ash Wednesday"),
		PALM_SUNDAY("Palm Sunday"),
		MAUNDY_THURSDAY("Maundy Thursday"),
		GOOD_FRIDAY("Good Friday"),
		HOLY_SATURDAY("Holy Saturday"),
		EASTER("Easter Sunday"),
		EASTER_MONDAY("Easter Monday"),
		ASCENSION_DAY("Ascension Day"),
		PENTECOST("Pentecost Sunday"),
		WHIT_MONDAY("Whit Monday"),
		TRINITY_SUNDAY("Trinity Sunday"),
		CORPUS_CHRISTI("Corpus Christi"),
		ASSUMPTION_OF_MARY("Assumption of Mary"),
		FEAST_OF_ST_FRANCIS_ASSISI("Feat of St Francis Assisi"),
		ALL_SAINTS_DAY("All Saint's Day"),
		ALL_SOULS_DAY("All Soul's Day"),
		FIRST_SUNDAY_OF_ADVENT("First Sunday of Advent"),
		FEAST_OF_THE_IMMACULATE_CONCEPTION("Feast of the Immaculate Conception"),
		CHRISTMAS_EVE("Christmas Eve"),
		CHRISTMAS("Christmas");
		
		private final String name;
		
		private ChristianHoliday(String name) { this.name = name; }
		
		@Override
		public String getName() { return name; }
	}
	
	public enum SeasonalHoliday implements Holiday  {
		MARCH_EQUINOX("March Equinox"),
		JUNE_SOLSTICE("June Solstice"),
		SEPTEMBER_EQUINOX("September Equinox"),
		DECEMBER_SOLSTICE("December Solstice");
		
		private final String name;
		
		private SeasonalHoliday(String name) { this.name = name; }
		
		@Override
		public String getName() { return name; }
	}
}
