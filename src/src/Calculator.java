package src;

public class Calculator {

	public static double sumNumber(double ... x) {
		int sum = 0;
		for(double i : x) {
			sum += i;
		}
		return sum;
		
	}
}
