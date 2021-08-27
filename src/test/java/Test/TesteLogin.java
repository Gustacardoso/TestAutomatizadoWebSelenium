package Test;
import interacao.LoginInteração;
import Utils.WebDriverUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TesteLogin {

    public WebDriver driver = WebDriverUtil.openBrowser();
    LoginInteração login = new LoginInteração(driver);

    @Before
    public void iniciar(){
        login.loginSucess();
    }

    @After
    public void fecharNavegador() {
        driver.quit();
    }
    @Test
    public void LoginSucesso(){
        Assert.assertEquals("Bem vindo, chico !","Bem vindo, chico !");

    }
}

