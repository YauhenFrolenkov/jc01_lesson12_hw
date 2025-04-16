package edu.training.jc.task4.test;

public class Calc {
	
	public static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int sumOfPrime(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) sum += i;
        }
        return sum;
    }
		
}
