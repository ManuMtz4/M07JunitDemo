package m07junitdemo12test;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


/**
 * @author manuel y angel
 */

public class JunitDemo12Test {
    private static StringBuilder watchedLog = new StringBuilder();

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog.append(description).append("\n");
        }

        @Override
        protected void succeeded(Description description) {
            watchedLog.append(description).append(" Exito").append("\n");
        }
    };

    @Test
    public void testConExito() {
        Assert.assertEquals(5,5);
    }

    @Test
    public void testFallido() {
        Assert.assertEquals(3,5);
    }
    
    @Test
    public void testFallido2() {
        fail();
    }
}
