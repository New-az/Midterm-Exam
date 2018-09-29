package unittest;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;

import src.Calculator;

public class TestCalculator {

	static final double TOL = 1.0E-6;
	
//	@Test
//	public void sumNumber() {
//		assertEquals(10.0, Calculator.sumNumber(7.4+2.6), TOL);
//	}
//	
//	@Test
//	public void sumManyNumber() {
//		assertEquals(17.0,Calculator.sumNumber(12.7+15.2+2.3+8.0-20.9),TOL);
//	}
	
	@Test
	public void checkList() {
		ArrayList<Double> number = new ArrayList<Double>();
		number = makeList(10,20,30,40,-50);
		assertEquals(number,Calculator.createList(10,20,30,40,-50));
	}
	
	private ArrayList<Double> makeList(double ... x){
		ArrayList<Double> number = new ArrayList<Double>();
		for(double i : x) {
			number.add(i);
		}
		return number;
	}
}
