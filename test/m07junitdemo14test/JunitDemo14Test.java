package m07junitdemo14test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static org.junit.Assert.assertTrue;

/**
 * @author manuel y angel
 */

public class JunitDemo14Test {

    static class LoggingRule implements TestRule {
        String str;

        public LoggingRule(String str) {
            this.str = str;
        }

        @Override
        public Statement apply(Statement arg0, Description arg1 ){
            System.out.println(this.str);
            return arg0;
        }
    }

    @Rule
    public final TestRule ruleChain = RuleChain
            .outerRule(new LoggingRule("outerRule"))
            .around(new LoggingRule("middleRule"))
            .around(new LoggingRule("innerRule"));

    @Test
    public void test() {
        System.out.println("Comiezo del test");
        assertTrue(true);
    }
}
