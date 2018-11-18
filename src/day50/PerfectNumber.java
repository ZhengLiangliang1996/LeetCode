package day50;

import day37.SumOfLeftLeaves;

public class PerfectNumber {
	
	public static boolean checkPerfectNumber(int num) {
		 if (num == 1) return false;
	     int sum = 1;
	     //every time the divisors u got is in pair.
	     for (int i = 2; i < Math.sqrt(num); ++i) if (num % i == 0) sum += i + num / i;
	     return sum == num;
    }
	
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
	}
}
