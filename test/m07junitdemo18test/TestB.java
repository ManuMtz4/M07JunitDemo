package m07junitdemo18test;

import m07junitdemo17.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author manuel y angel
 */
public class TestB {
	@Test
	public void testFibonacci() {
		System.out.println("Inici testFibonacci() 2");
		assertEquals(3, Fibonacci.compute(4));
		assertEquals(5, Fibonacci.compute(5));
		assertEquals(8, Fibonacci.compute(6));
		assertEquals(13, Fibonacci.compute(7));
		System.out.println("Fi testFibonacci() 2");
	}
}
