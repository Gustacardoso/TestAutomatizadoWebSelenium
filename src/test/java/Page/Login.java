package Page;

import PageObject.ElementoLogin;
import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {


    public Login(WebDriver driver) {
        super(driver);
    }
    ElementoLogin elementoLogin = new ElementoLogin(driver);

    public void setEmail(){
        elementoLogin.getEmail().sendKeys("gusta_tamy@hotmail.com");
    }
    public void setSenha(){
        elementoLogin.getSenha().sendKeys("123456");
    }

    public void clickEntrar(){
        elementoLogin.getButton().click();
    }

   public void LoginSucesso(){
        setEmail();
        setSenha();
       clickEntrar();
   }


}
