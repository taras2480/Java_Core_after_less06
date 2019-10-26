package ua.lgs.lviv.enumeration_task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			switch (sc.next()) {

			case "1": {
				System.out.println("Enter numeric");
				sc = new Scanner(System.in);
				Double num = sc.nextDouble();

				if (num % 2 == 0) {
					System.out.println("Number is even");
				} else if (num % 2 == 1) {

					System.out.println("Number is odd");
				}

				else {
					System.out.println("Mistake");
				}

				break;
			}

			}

		}

	}

}
