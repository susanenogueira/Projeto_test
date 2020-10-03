package test;

import core.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.ListaProdutosPage;
import page.FinalizarPedidoPage;

import static core.DriverFactory.getDriver;

public class ConcluirPedidoDeDocesTest extends BaseTest {

    ListaProdutosPage listaProdutosPage = new ListaProdutosPage();
    FinalizarPedidoPage finalizarPedidoPage = new FinalizarPedidoPage();



    @Before
    public void inicializa() {
        getDriver().get("https://shopcart-challenge.4all.com/");


    }


    @Test
    public void testComprarDoces() {

        listaProdutosPage.selecionarCategoriaDoces();
        listaProdutosPage.adicionarCarrinhoBrigadeiro();
        listaProdutosPage.adicionarCarrinhoAlfajor();
        listaProdutosPage.selecionarCategoriaTodos();
        listaProdutosPage.acessarCarrinho();

        finalizarPedidoPage.aumentar4Brigadeiros();
        finalizarPedidoPage.FinalizarCompra();
        finalizarPedidoPage.ValidarMensagemSucesso();

    }
}


