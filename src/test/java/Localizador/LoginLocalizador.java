package Localizador;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLocalizador extends BasePage {
    public LoginLocalizador(WebDriver driver) {
        super(driver);
    }
    public By email = By.id("email");
    public By senha = By.id("senha");
    public By botaoEntrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");



}
