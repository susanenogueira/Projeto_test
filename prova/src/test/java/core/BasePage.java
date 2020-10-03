package core;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

public class BasePage {

    public String obterValorCampo(String id) {
        return getDriver().findElement(By.id(id)).getAttribute("value");

    }


    public void clicarBotao(By by) {

        getDriver().findElement(by).click();
    }

    public void clicarBotao(String id) {

        clicarBotao(By.id(id));
    }


    public void clicarBotaoXpath(String texto) {

        clicarBotao(By.xpath(texto));
    }


    public void validaMensagemXpath(String texto, String mensagem0) {

        WebElement mensagemPop = getDriver().findElement(By.xpath(texto));
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem0, mensagem);

    }

    public void validaMensagem(String id, String mensagem0) {

        WebElement mensagemPop = getDriver().findElement(By.id(id));
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem0, mensagem);

    }


    public void printarIdHandle() {

        System.out.println(getDriver().getWindowHandle());
        System.out.println(getDriver().getWindowHandles());
    }

    public void popUp() {
        getDriver().switchTo().getClass();
    }

    public String obterValueElemento(String id) {
        return getDriver().findElement(By.id(id)).getAttribute("value");


    }

}







