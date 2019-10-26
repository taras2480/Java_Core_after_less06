package ua.lgs.lviv.enumeration_task3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			switch (sc.next()) {
			
			
			case "1":{
		
		System.out.println("Enter two numerics");
		if (sc.hasNextInt()) {
			num1=sc.nextInt();
		} else {
			System.out.println("Mistake");
			return;
		}
		if (sc.hasNextInt()) {
			num2=sc.nextInt();
			System.out.println((num1+num2));
		} else {
			System.out.println("Mistake");
			
		}
			}
		}
	}
	}
}

	

