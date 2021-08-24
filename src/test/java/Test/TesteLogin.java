package Test;
import Page.LoginPage;
import Utils.WebDriverUtil;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TesteLogin {

    public static WebDriver driver = WebDriverUtil.openBrowser();
    LoginPage login = new LoginPage(driver);

    @Test
    public void LoginSucesso(){
        login.loginSucess();
        login.setValidacaoLogin("Bem Vindo, Gustavo Cardoso da Silveira");
    }
}

