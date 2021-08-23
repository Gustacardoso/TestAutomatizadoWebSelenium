package Page;

import Localizador.LoginLocalizador;
import Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    LoginLocalizador loginLocalizador = new LoginLocalizador(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setEmail(String setEmail){
       driver.findElement(loginLocalizador.email).sendKeys(setEmail);
    }
    public void setSenha(String setSenha){
        driver.findElement(loginLocalizador.senha).sendKeys(setSenha);
    }

    public void setclickEntrar(){
        driver.findElement(loginLocalizador.botaoEntrar).click();
    }

   public void loginSucess(){
        setEmail("gusta_tamy@hotmail.com");
        setSenha("123456");
        setclickEntrar();
   }


}
