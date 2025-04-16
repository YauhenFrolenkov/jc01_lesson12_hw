package edu.training.jc.task4.main;

import java.util.Scanner;

import edu.training.jc.task4.test.Calc;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое положительное число N (больше 1)");

		while (true) {
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Ошибка. Введите целое положительное число N (больше 1)");
			}
			n = sc.nextInt();

			if (n > 1) {
				break;
			} else {
				System.out.println("Ошибка. Введите целое положительное число N (больше 1)");
			}

		}

		if (Calc.isPrime(n) == true) {
			System.out.println("Число " + n + " является простым.");
			int sum = Calc.sumOfPrime(n);
			System.out.println("Сумма всех простых чисел, меньших " + n + ", равна " + sum + ".");
		} else {
			 System.out.println("Число " + n + " не является простым.");
		}
		
		sc.close();

	}

	
}
