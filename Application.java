/*
 * LOGOS It Academy Lesson_09_hw
 * Class Application
 * */





package ua.lgs.lviv.task1_3_enum_month;
/**
 * @since java 1.8
 * @author taras2409
 * @version 1.1
 * */

/* import Scanner.Library */
import java.util.Scanner;

/* name to class */
public class Application {
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		

		Month[] mas = Month.values();
		Scanner sc = new Scanner(System.in);
		
		
		/* endless cycle */
            while (true) {
			menu();
			switch (sc.next()) {
			/* counting input parametres */
			case "1": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(mas, month);

				if (!flag) {
					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);
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
					String message = "Season does not exist";
					throw new WrongInputConsoleParametersException(message);
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
					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);
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
					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);
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
					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);
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
				if (!flag) {

					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);

				}

				break;

			}
			}
		}

	}

	/**
	 * @param input params
	 * users menu
	 * @author taras2409
	* */
	
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