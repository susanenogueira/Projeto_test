package page;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ListaProdutosPage extends BasePage {

    public void clicarCategoria(){
        clicarBotao("open-categories-btn");

    }

    public void selecionarCategoriaDoces(){
        clicarCategoria();
        clicarBotao("category-1");
    }

    public void adicionarCarrinhoBrigadeiro()
    {
        clicarBotao("add-product-4-btn");
    }


    public void adicionarCarrinhoAlfajor(){
        clicarBotao("add-product-5-btn");
    }


    public void selecionarCategoriaTodos(){
        clicarCategoria();
        clicarBotao("category-all");
    }

    public void selecionarCategoriaBebidas(){
        clicarCategoria();
        clicarBotao("category-0");

    }

    public void adicionarTodasBebidas(){
        adicionarCarrinhoCocacola();
        adicionarCarrinhofanta();
        adicionarAguaSemGas();

    }

    public void adicionarCarrinhoCocacola(){

        clicarBotao("add-product-0-btn");

    }

    public void adicionarCarrinhofanta(){

        clicarBotao("add-product-1-btn");

    }

    public void adicionarAguaSemGas(){

        clicarBotao("add-product-2-btn");

    }

    public void adicionarRissolemedio(){

        clicarBotao("add-product-3-btn");

    }


    public void acessarCarrinho(){

        clicarBotao("cart-btn");

    }




}
