package m07junitdemo9test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * @author manuel y angel
 */

public class JunitDemo9Test {
    int i = 1;
    @Rule
    public final ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void example() {
        if (i == 1)
        errorCollector.addError(new Throwable("Error encontrado"));
    }
}
