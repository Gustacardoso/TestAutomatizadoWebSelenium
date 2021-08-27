package Mapeamento;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMapeamento extends BasePage {

    public LoginMapeamento(WebDriver driver) {
        super(driver);
    }
    public By email = By.id("email");
    public By senha = By.id("senha");
    public By botaoEntrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");
    public By ValidacaoLogin = By.cssSelector("body > div.alert.alert-success");
}
