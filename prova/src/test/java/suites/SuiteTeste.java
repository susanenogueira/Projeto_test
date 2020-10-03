package suites;
import core.DriverFactory;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.ConcluirPedidoDeDocesTest;
import test.ConcluirPedidodeBebidaseRissoleTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConcluirPedidoDeDocesTest.class,
        ConcluirPedidodeBebidaseRissoleTest.class
})

public class SuiteTeste {
    @AfterClass
    public static void finalizaTudo(){
        DriverFactory.killDriver();

    }
}
