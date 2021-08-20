package PageObject;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementConta extends BasePage {


    public ElementConta(WebDriver driver) {
        super(driver);
    }
    public WebElement getBotaoConta(){
        return driver.findElement(By.className("dropdown"));
    }
    public WebElement getBotaoAdicionar(){
        return driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]"));
    }
    public WebElement getBotaoSalvar(){
        return driver.findElement(By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button"));
    }
    public WebElement getValideMensagemSemNome(){
        return driver.findElement(By.cssSelector("body > div.alert.alert-danger"));
    }
    public WebElement getValideMensagemsucess(){
        return driver.findElement(By.cssSelector("body > div.alert.alert-success"));
    }
    public WebElement getCampoNome(){
        return driver.findElement(By.id("nome"));
    }
    public WebElement getBotaoLista(){
        return driver.findElement(By.cssSelector("#navbar > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
    }

    public WebElement getEditarConta(){
        return driver.findElement(By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1) > span"));
    }
}
