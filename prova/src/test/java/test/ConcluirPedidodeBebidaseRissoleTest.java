package test;


import core.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.ListaProdutosPage;
import page.FinalizarPedidoPage;

import static core.DriverFactory.getDriver;

public class ConcluirPedidodeBebidaseRissoleTest extends BaseTest {

    ListaProdutosPage listaProdutosPage = new ListaProdutosPage();
    FinalizarPedidoPage finalizarPedidoPage = new FinalizarPedidoPage();


    @Before
    public void inicializa() {
        getDriver().get("https://shopcart-challenge.4all.com/");


    }

    @Test
    public void testComprarBebidaseRissoles(){

        listaProdutosPage.selecionarCategoriaBebidas();
        listaProdutosPage.adicionarTodasBebidas();
        listaProdutosPage.selecionarCategoriaTodos();
        listaProdutosPage.adicionarRissolemedio();
        listaProdutosPage.acessarCarrinho();

        finalizarPedidoPage.aumentar9Rissoles();
        finalizarPedidoPage.diminuir5unidades();
        finalizarPedidoPage.validarValorTotalprodutos();
        finalizarPedidoPage.FinalizarCompra();
        finalizarPedidoPage.ValidarMensagemSucesso();




    }


}
