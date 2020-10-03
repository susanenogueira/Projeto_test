package page;

import core.BasePage;
import core.DSL;
import org.openqa.selenium.WebDriver;

public class ListaProdutosPage extends BasePage {

    public void clicarCategoria(){
        dsl.clicarBotao("open-categories-btn");

    }

    public void selecionarCategoriaDoces(){
        dsl.clicarBotao("open-categories-btn");
        dsl.clicarBotao("category-1");
    }
}
