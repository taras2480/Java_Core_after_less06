package ua.lgs.lviv.enumeration_task1;

import java.util.Scanner;

public class Application {

	enum Seasons {
		SPRINT, SUMMER, AUTUMN, WINTER;
	}

	enum Month {

		MARCH(Seasons.SPRINT, 31), APRIL(Seasons.SPRINT, 30), MAY(Seasons.SPRINT, 31), JUNE(Seasons.SUMMER, 30),
		JULAY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31), SEPTEMBER(Seasons.AUTUMN, 30),
		OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30), DECEMBER(Seasons.WINTER, 31),
		JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28);

		Seasons seasons;
		private Integer days;

		public Seasons getSeasons() {
			return seasons;
		}

		Integer getDays() {
			return days;
		}

		private Month(Seasons seasons, Integer days) {
			this.days = days;
			this.seasons = seasons;
		}

	}

	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити чи такий місяць існує");
		System.out.println("Натисніть 2, щоб вивести всі місяці однієї пори року");
		System.out.println("Натисніть 3, щоб вивести всі місяці з одинаковою кількістю днів");
		System.out.println("Натисніть 4, щоб вивести місяці з найменшою кількістю днів");
		System.out.println("Натисніть 5, щоб вивести місяці з найбільшою кількістю днів");
		System.out.println("Натисніть 6 , щоб вивести наступну пору року");
		System.out.println("Натисніть 7 , щоб вивести попередню пору року");
		System.out.println("Натисніть 8 , щоб вивести місяці, які мають парну кількість днів");
		System.out.println("Натисніть 9 , щоб вивести місяці, які мають непарну кількість днів");
		System.out.println("Натисніть 10 і місяць ,щоб перевірити чи парна кількість днів в місяці");

	}

	public static void main(String[] args) {

		Month[] mas = Month.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(mas, month);

				if (!flag) {
					System.out.println("Month doesnt exit");
				}
				break;
			}
			case "2": {
				System.out.println("Enter Seasons");
				sc = new Scanner(System.in);
				String seasonsSc = sc.next().toUpperCase();
				boolean flag = false;
				for (Month m : mas) {
					if (m.getSeasons().name().equals(seasonsSc)) {

						flag = true;
					}
				}
				if (flag) {
					Seasons ses = Seasons.valueOf(seasonsSc);
					for (Month mf : mas) {
						if (mf.getSeasons().toString().equalsIgnoreCase(seasonsSc)) {
							System.out.println(mf);
						}
					}
				}

				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}

			case "3": {
				System.out.println("Enter Number of days per month");
				sc = new Scanner(System.in);
				Integer days = sc.nextInt();

				boolean flag = false;
				for (Month m : mas) {
					if (m.getDays().equals(days)) {

						flag = true;
					}
				}
				if (flag) {

					for (Month mft : mas) {
						if (mft.getDays().equals(days)) {
							System.out.println(mft);
						}
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;

			}
			case "4": {
				System.out.println("Enter number (if this number lower than q-ty days of month pls try again");
				sc = new Scanner(System.in);
				Integer days = sc.nextInt();

				boolean flag = false;
				for (Month mon : mas) {
					if (mon.getDays() < days) {
						System.out.println(mon + " " + mon.getDays());

					}

				}

				break;

			}
			case "5": {
				System.out.println("Enter number (if this number higher than q-ty days of month pls try again");
				sc = new Scanner(System.in);
				Integer days = sc.nextInt();

				boolean flag = false;
				for (Month mon : mas) {
					if (mon.getDays() > days) {
						System.out.println(mon + " " + mon.getDays());

					}

				}

				break;

			}
			case "6": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = extracted(mas, month);

				if (flag) {

					Month mnth = Month.valueOf(month);
					int ordinal = mnth.ordinal();
					if (ordinal == mas.length - 1) {
						ordinal = 0;
						System.out.println(mas[ordinal]);

					} else {
						System.out.println(mas[ordinal - 1]);
					}
				}

				if (!flag) {
					System.out.println("Month doesnt exit");
				}
				break;

			}
			case "7": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month1 = sc.next().toUpperCase();
				boolean flag = extracted(mas, month1);

				if (flag) {

					Month mnth1 = Month.valueOf(month1);
					int ordinal = mnth1.ordinal();
					if (ordinal == 0) {
						ordinal = mas.length - 1;
						System.out.println(mas[ordinal]);

					} else {
						System.out.println(mas[ordinal - 1]);
					}
				}

				if (!flag) {
					System.out.println("Month doesnt exit");
				}
				break;

			}

			case "8": {
				sc = new Scanner(System.in);

				for (Month mon : mas) {

					if (mon.getDays() % 2 == 0) {

						System.out.println(mon + " " + mon.getDays());

					}

				}

				break;

			}
			case "9": {
				sc = new Scanner(System.in);

				for (Month mon : mas) {

					if (mon.getDays() % 2 == 1) {

						System.out.println(mon + " " + mon.getDays());

					}

				}

				break;

			}
			case "10": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month1 = sc.next().toUpperCase();
				boolean flag = extracted(mas, month1);

				if (flag) {

					Month mnth = Month.valueOf(month1);

					if (mnth.getDays() % 2 == 0) {

						System.out.println("The month has an even number of days");

					} else {
						System.out.println("The month has an odd number of days");
					}
				}

				break;

			}
			}
		}

	}

	private static boolean extracted(Month[] mas, String month) {
		boolean flag = false;
		for (Month m : mas) {

			if (m.name().equals(month)) {

				flag = true;
			}
		}
		return flag;
	}

	

	private static boolean isMonthPresent(Month[] mas, String month) {
		boolean flag = false;
		for (Month m : mas) {

			if (m.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}

}
