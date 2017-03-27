package m07junitdemo17test;

import m07junitdemo3.Fibonacci;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author manuel y angel
 */

@RunWith(Parameterized.class)
public class JunitDemo17Test {
	private final int n;
	private final int resultat;

	@Parameters
	public static Collection<Object[]> parametres() {
		return Arrays.asList(new Object[][]{
				{0, 0},
				{1, 1},
				{2, 1},
				{3, 2},
				{4, 3},
				{5, 5},
				{6, 8},
				{7, 13},
				{8, 21},
				{9, 34},
				{10, 55}
		});
	}

	public JunitDemo17Test(int n, int resultat) {
		this.n = n;
		this.resultat = resultat;
	}

	@Test
	public void testFibonacci() {
		assertEquals(resultat, Fibonacci.compute(n));
	}
}