package m07junitdemo6test;

import org.junit.Test;

/**
 * @author manuel y angel
 */

public class JunitDemo6Test {

    @Test(timeout=100)
    public void testWithTimeout() {
        int i = 0;
        while (true) {
            i++;
        }
    }
}
