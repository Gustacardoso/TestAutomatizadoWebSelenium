package Test;

import Page.ContaPage;
import Page.LoginPage;
import Utils.WebDriverUtil;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class TesteConta {

    public static WebDriver driver = WebDriverUtil.openBrowser();

    LoginPage loginPage = new LoginPage(driver);
    ContaPage contaPage = new ContaPage(driver);

    Faker faker = new Faker(new Locale("pt","Br"));
    String nomeFaker = faker.name().firstName();
    @Test
    public void adicionarSemNome(){
        loginPage.loginSucess();
        contaPage.setBotaoContas();
        contaPage.setBotaoAdicionar();
        contaPage.setbotaoSalvar();
        contaPage.setValidMensagemSemNome();
    }
   @Test
   public void MensagemContaSucesso(){
        loginPage.loginSucess();
        contaPage.setBotaoContas();
        contaPage.setBotaoAdicionar();
        contaPage.setCampoNome(nomeFaker);
        contaPage.setbotaoSalvar();
        contaPage.setValidMensagemSucess();
   }
   @Test
   public void ListaConta(){
       loginPage.loginSucess();
       contaPage.setBotaoContas();
       contaPage.setBotaoLista();
   }
   @Test
   public void MensagemAlteracaoConta(){
       loginPage.loginSucess();
       contaPage.setBotaoContas();
       contaPage.setBotaoLista();
       contaPage.setEditarConta();
       contaPage.setApagarCampoNome();
       contaPage.setCampoNome(nomeFaker);
       contaPage.setbotaoSalvar();
       contaPage.setValidMensagemEditarSucess();
   }
   @Test
   public void MensagemRemovidaConta(){
       loginPage.loginSucess();
       contaPage.setBotaoContas();
       contaPage.setBotaoLista();
       contaPage.setBotaoDeletar();
       contaPage.setValidMensagemDeletar();
   }
}
