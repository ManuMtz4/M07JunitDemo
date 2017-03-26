package m07junitdemo11test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

/**
 * @author manuel y angel
 */

public class JunitDemo11Test {
    public static String log;

    @Rule
    public final TestRule globalTimeout = Timeout.millis(50);

    @Test
    public void testInfinito1() {
        log += "test1";
        while(true) {}
    }

    @Test
    public void testInfinito2() {
        log += "test2";
        while(true) {}
    }
}
