package m07junitdemo16test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;


/**
 * @author manuel y angel
 */

public class JunitDemo16Test {

    /**
     * Expected tag
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testExMsg1() {
        List list =  new ArrayList();
        list.get(0);
    }

    /**
     * Try/Catch
     */
    @Test
    public void testExMsg2() {
        try {
            List list =  new ArrayList();
            list.get(0);
            fail("FALLO - Se esperaba la Excepcion IndexOutOfBounds");
        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
            assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
        }
    }

    /**
     * Rule
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testExMsg3() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0); // execution will never get past this line
    }
}
