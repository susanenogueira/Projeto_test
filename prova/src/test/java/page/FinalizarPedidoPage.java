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

    public void aumentar9Rissoles(){

        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");
        clicarBotao("add-product-3-qtd");

    }

    public void diminuir5unidades(){

        clicarBotao("remove-product-3-qtd");
        clicarBotao("remove-product-3-qtd");
        clicarBotao("remove-product-3-qtd");
        clicarBotao("remove-product-3-qtd");

    }

    public void FinalizarCompra(){
        clicarBotao("finish-checkout-button");

    }

    public void ValidarMensagemSucesso(){

        validaMensagemXpath("//*[@id=\"root\"]/div[3]/div/div/div/h2","Pedido realizado com sucesso!");
        clicarBotaoXpath("//*[@id=\"root\"]/div[3]/div/div/div/button");
    }




    public void validarValorTotalprodutos(){

        validaMensagem("price-total-checkout","R$ 36,00");

    }



}
