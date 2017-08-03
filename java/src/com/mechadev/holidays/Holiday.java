package com.mechadev.holidays;


public enum Holiday {
	NEW_YEARS_DAY("New Years Day"),
	INAUGURATION_DAY("Inauguration Day"),
	MARTIN_LUTHER_KING_JR_DAY("Martin Luther King Jr Day"),
	GEORGE_WASHINGTONS_BIRTHDAY("George Washington's Birthday"),
	MEMORIAL_DAY("Memorial Day"),
	INDEPENDENCE_DAY("Independence Day"),
	LABOR_DAY("Labor Day"),
	COLUMBUS_DAY("Columbus Day"),
	VETERANS_DAY("Verterans Day"),
	THANKSGIVING_DAY("Thanksgiving"),
	CHRISTMAS_DAY("Christmas");
	
	private final String name;
	
	private Holiday(String name) { this.name = name; }
	
	public String getName() { return name; }
}
