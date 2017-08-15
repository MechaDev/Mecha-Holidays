package com.mechadev.mechaholidays.enums;

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