package unittest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Calculator;

public class TestCalculator {

	static final double TOL = 1.0E-6;
	
	@Test
	public void sumNumber() {
		assertEquals(10.0, Calculator.sumNumber(7.4+2.6), TOL);
	}
	
	@Test
	public void sumManyNumber() {
		assertEquals(17.0,Calculator.sumNumber(12.7+15.2+2.3+8.0-20.9),TOL);
	}
	
}
