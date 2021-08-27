package interacao;
import Mapeamento.LoginMapeamento;
import Utils.BasePage;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginInteração extends BasePage {

    LoginMapeamento loginLocalizador = new LoginMapeamento(driver);

    public LoginInteração(WebDriver driver) {
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
        setEmail("Chiplim@hotmail.com");
        setSenha("123456");
        setclickEntrar();
   }
}
