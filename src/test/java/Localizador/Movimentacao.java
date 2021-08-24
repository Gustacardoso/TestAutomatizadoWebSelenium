package Localizador;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Movimentacao extends BasePage {
    public Movimentacao(WebDriver driver) {
        super(driver);
    }

    public By botaoMovimentacao  = By.cssSelector("#navbar > ul > li.active > a");

}
