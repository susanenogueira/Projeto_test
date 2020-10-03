package test;


import core.BaseTest;
import org.junit.Test;
import page.ListaProdutosPage;
import page.FinalizarPedidoPage;


public class ConcluirPedidodeBebidaseRissoleTest extends BaseTest {

    ListaProdutosPage listaProdutosPage = new ListaProdutosPage();
    FinalizarPedidoPage finalizarPedidoPage = new FinalizarPedidoPage();




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
