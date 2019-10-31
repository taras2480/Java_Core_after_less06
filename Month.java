/*
 * LOGOS It Academy Lesson_09_hw
 * enum Mounth
 * */

 package ua.lgs.lviv.task1_3_enum_month;

/* count with parameters */
public enum Month {
	MARCH(Seasons.SPRINT, 31), APRIL(Seasons.SPRINT, 30), MAY(Seasons.SPRINT, 31), JUNE(Seasons.SUMMER, 30),
	JULAY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31), SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31),
	NOVEMBER(Seasons.AUTUMN, 30), DECEMBER(Seasons.WINTER, 31), JANUARY(Seasons.WINTER, 31),
	FEBRUARY(Seasons.WINTER, 28);

	/* fields for Enum */
	Seasons seasons;
	private Integer days;

	/* methods for Enum */
	public Seasons getSeasons() {
		return seasons;
	}

	Integer getDays() {
		return days;
	}

	/* Constructors for Enum */
	private Month(Seasons seasons, Integer days) {
		this.days = days;
		this.seasons = seasons;
	}
}