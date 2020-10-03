package page;

import core.BasePage;
import org.junit.Assert;

public class FinalizarPedidoPage extends BasePage {



    public void aumentar4Brigadeiros(){
        clicarBotao("add-product-4-qtd");
        clicarBotao("add-product-4-qtd");
        clicarBotao("add-product-4-qtd");
        //  Assert.assertEquals("4", obterValueElemento("product-4-qtd"));


    }

    public void botaoFinalizarCompra(){
        clicarBotao("finish-checkout-button");

    }

    public void popSucesso(){

        validaMensagem("//*[@id=\"root\"]/div[3]/div/div/div/h2","Pedido realizado com sucesso!");
        clicarBotaoXpath("//*[@id=\"root\"]/div[3]/div/div/div/button");
    }



}
