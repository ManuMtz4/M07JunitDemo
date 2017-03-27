package m07junitdemo19test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestA {
	@Test
	public void sinCategoria() {
		System.out.println("Dentro de TestA SIN categoria");
	}

	@Category(SlowTests.class)
	@Test
	public void conCategoriaSlow() {
		System.out.println("Dentro de TestA categoria Slow");
	}
}
