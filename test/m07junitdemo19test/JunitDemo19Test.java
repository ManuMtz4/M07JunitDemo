package m07junitdemo19test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author manuel y angel
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses({TestA.class, TestB.class})
public class JunitDemo19Test {
}
