package suites;
import core.DriverFactory;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.ComprarDocesTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        ComprarDocesTest.class
})

public class SuiteTeste {
    @AfterClass
    public static void finalizaTudo(){
        DriverFactory.killDriver();

    }
}
