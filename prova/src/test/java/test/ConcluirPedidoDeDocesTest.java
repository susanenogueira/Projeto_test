package test;


import core.BaseTest;
import org.junit.Test;
import page.ListaProdutosPage;
import page.FinalizarPedidoPage;



public class ConcluirPedidoDeDocesTest extends BaseTest {

    ListaProdutosPage listaProdutosPage = new ListaProdutosPage();
    FinalizarPedidoPage finalizarPedidoPage = new FinalizarPedidoPage();


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


