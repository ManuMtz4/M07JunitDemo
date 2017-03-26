package m07junitdemo3test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author manuel y angel
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitDemo3Test {

    @Test
    public void testA() {
        System.out.println("A");
    }
    @Test
    public void testC() {
        System.out.println("C");
    }
    @Test
    public void testB() {
        System.out.println("B");
    }
}
