package m07junitdemo5test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author manuel y angel
 */

public class JunitDemo5Test {

    @BeforeClass
    public static void inicioClase() {
        System.out.println("@BeforeClass inicioClase");
    }

    @AfterClass
    public static void finalClase() {
        System.out.println("@AfterClass finalClase");
    }

    // Hará el print de @Before, @After y @TestX
    private void println(String string) {
        System.out.println(string);
    }

    @Before
    public void inicioFuncion() {
        this.println("@Before inicioFuncion");
    }

    @After
    public void funcionAcabada() {
        this.println("@After funcionAcabada");
    }

    @Test
    public void test1() {
        this.println("@Test test1()");
    }

    @Test
    public void test2() {
        this.println("@Test test2()");
    }
}
