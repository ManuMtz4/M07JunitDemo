package m07junitdemo18test;

import m07junitdemo3.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author manuel y angel
 */
public class TestA {
	@Test
	public void testFibonacci() {
		System.out.println("Inici testFibonacci() 1");
		assertEquals(0, Fibonacci.compute(0));
		assertEquals(1, Fibonacci.compute(1));
		assertEquals(1, Fibonacci.compute(2));
		assertEquals(2, Fibonacci.compute(3));
		System.out.println("Fi testFibonacci() 1");
	}
}
