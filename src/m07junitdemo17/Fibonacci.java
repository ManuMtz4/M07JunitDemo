package m07junitdemo17;

/**
 * @author manuel y angel
 */

public class Fibonacci {
	public static int compute(int n) {
		int result;

		if (n <= 1) result = n;
		else result = compute(n - 1) + compute(n - 2);

		return result;
	}
}
