package PageObject;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementoLogin extends BasePage {

    public ElementoLogin(WebDriver driver) {
        super(driver);
    }
    public WebElement getEmail(){
        return driver.findElement(By.id("email"));
    }
    public WebElement getSenha(){
        return driver.findElement(By.id("senha"));
    }
    public WebElement getButton(){
        return driver.findElement(By.cssSelector("body > div.jumbotron.col-lg-4 > form > button"));
    }
}
