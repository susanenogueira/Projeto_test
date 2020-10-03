package test;

import core.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.ListaProdutosPage;

import static core.DriverFactory.getDriver;

public class ComprarDocesTest extends BaseTest {

        private ListaProdutosPage page;

        @Before
        public void inicializa(){
            getDriver().get("https://shopcart-challenge.4all.com/");
            page = new ListaProdutosPage();
        }



        @Test
        public void deveCategoria() {

            page.selecionarCategoriaDoces();


           // Assert.assertEquals("Test Analyst Challenge",driver.getTitle());

        }
    }


