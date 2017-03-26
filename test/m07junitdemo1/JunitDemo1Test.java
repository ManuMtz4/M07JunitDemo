package m07junitdemo1;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author manumtz y angel
 */
public class JunitDemo1Test {

    public JunitDemo1Test() {
    }

    JunitDemo1 demo1 = new JunitDemo1();

    // variable del Valor Esperado
    char[] expected = demo1.getBadChart().clone();

    // Variable del Valor Obtenido
    char[] actual = demo1.getBadChart();

    @Before
    public void bubbleSortTest() {
        // Sort Implementado a mano
        demo1.bubbleSort();

        // Sort Original de la clase Arrays
        Arrays.sort(expected);
    }

    /**
     * Test of main method, of class JunitDemo1.
     */
    @Test
    public void testMain() {
        assertArrayEquals(expected, actual);
    }
}
