package m07junitdemo10test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * @author manuel y angel
 */

public class JunitDemo10Test {
    @Rule
    public TestName name = new TestName();

    @Test
    public void printMyName() {
        System.out.println("Nombre del metodo Test: " + name.getMethodName());
    }
}
