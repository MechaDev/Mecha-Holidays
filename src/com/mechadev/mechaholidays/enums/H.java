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
		SHROVE_TUESDAY("Shrove Tuesday"),
		ASH_WEDNESDAY("Ash Wednesday"),
		PALM_SUNDAY("Palm Sunday"),
		MAUNDY_THURSDAY("Maundy Thursday"),
		GOOD_FRIDAY("Good Friday"),
		EASTER("Easter Sunday"),
		EASTER_MONDAY("Easter Monday"),
		ASCENSION_DAY("Ascension Day"),
		PENTECOST("Pentecost Sunday"),
		PENTECOST_MONDAY("Pentecost Monday");
		
		private final String name;
		
		private ChristianHoliday(String name) { this.name = name; }
		
		@Override
		public String getName() { return name; }
	}
	
	public enum Season implements Holiday  {
		MARCH_EQUINOX("March Equinox"),
		JUNE_SOLSTICE("June Solstice"),
		SEPTEMBER_EQUINOX("September Equinox"),
		DECEMBER_SOLSTICE("December Solstice");
		
		private final String name;
		
		private Season(String name) { this.name = name; }
		
		@Override
		public String getName() { return name; }
	}
}
