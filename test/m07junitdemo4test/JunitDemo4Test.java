package m07junitdemo4test;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author manuel y angel
 */
public class JunitDemo4Test {

    @Ignore("Ignora este test")
    @Test
    public void testEq() {
        assertThat(1, is(1));
    }
}
