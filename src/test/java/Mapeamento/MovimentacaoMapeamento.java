package Mapeamento;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovimentacaoMapeamento extends BasePage {
    public MovimentacaoMapeamento(WebDriver driver) {
        super(driver);
    }

    public By botaoMovimentacao  = By.cssSelector("#navbar > ul > li.active > a");

}
