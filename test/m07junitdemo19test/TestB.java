package m07junitdemo19test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class, FastTests.class})
public class TestB {
	@Test
	public void dosCategorias() {
		System.out.println("Dentro de TestB clase con las 2 categorias");
	}
}
