package m07junitdemogeneral;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicTest {
	@Test
	public void sumTest() {
		assertEquals(4, Integer.sum(2, 2));
	}

	@Test
	public void parseTest() {
		assertEquals(4, Integer.parseInt("4"));
	}

	@Test
	public void indexOfTest() {
		int array[] = new int[]{0,1,2,3};
		assertEquals(2, indexOf(array, 2));
		assertEquals(3, indexOf(array, 3));
	}

	private int indexOf(int array[], int searchFor) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == searchFor) return i;
		}
		return -1;
	}
}
