package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CountA_Test.class, divide_Test.class, square_Test.class })
public class AllTests {

}
