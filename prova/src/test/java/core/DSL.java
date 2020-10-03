package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static core.DriverFactory.getDriver;

public class DSL {



      public String obterValorCampo(String id) {
        return getDriver().findElement(By.id(id)).getAttribute("value");

    }

    public void clicarBotao(String id){
        getDriver().findElement(By.id(id)).click();

    }

   public String obterTexto(String id){
        return getDriver().findElement(By.id(id)).getText();
        //verificar se vai precisarfazer de outra forma
   }

   public void trocarJanela(String id){
       getDriver().switchTo().window(id);
   }

}
