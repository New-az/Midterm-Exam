package src;
import java.util.ArrayList;

public class Calculator {

	public static ArrayList<Double> createList(double ... x) {
		ArrayList<Double> y = new ArrayList<Double>();
		for(double i : x) {
			y.add(i);
		}
		return y;
	}
	
	
}
