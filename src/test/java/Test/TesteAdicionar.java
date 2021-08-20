package Test;

import Page.Adicionar;
import Page.Login;
import Utils.WebDriverUtil;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TesteAdicionar {

    public static WebDriver driver = WebDriverUtil.openBrowser();

    Login login = new Login(driver);
    Adicionar adicionar = new Adicionar(driver);

    @Test
    public void adicionarSemNome(){
        login.LoginSucesso();
    }
}
