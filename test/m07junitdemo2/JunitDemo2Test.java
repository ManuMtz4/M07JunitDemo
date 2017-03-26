package m07junitdemo2;

import m07junitdemo2.Calc;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author manuel y angel
 */
public class JunitDemo2Test {

    @Test
    public void testJunit (){
        Calc t = new Calc(1,'e',2);
        assertThat(t.getOpType(), anyOf(equalTo('+'), equalTo('-'), equalTo('*'), equalTo('/'), equalTo('%')));
    }
}
