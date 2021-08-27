package Test;

import interacao.ContaInteracao;
import interacao.LoginInteração;
import Utils.WebDriverUtil;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class TesteConta {

    public  WebDriver driver = WebDriverUtil.openBrowser();

    LoginInteração loginPage = new LoginInteração(driver);
    ContaInteracao contaPage = new ContaInteracao(driver);

    Faker faker = new Faker(new Locale("pt","Br"));
    String nomeFaker = faker.name().firstName();

    @Before
    public void iniciar(){
        loginPage.loginSucess();
    }

    @After
    public void fecharNavegador() {
        driver.quit();
    }
    @Test
    public void adicionarSemNome(){
        this.contaPage.setBotaoContas();
        this.contaPage.setBotaoAdicionar();
        this.contaPage.setbotaoSalvar();
        this.contaPage.setValidMensagemSemNome();
    }
   @Test
   public void MensagemContaSucesso(){
       this.contaPage.setBotaoContas();
       this.contaPage.setBotaoAdicionar();
       this.contaPage.setCampoNome(nomeFaker);
       this.contaPage.setbotaoSalvar();
       this.contaPage.setValidMensagemSucess();
   }
   @Test
   public void ListaConta(){
       contaPage.setBotaoContas();
       contaPage.setBotaoLista();
   }
   @Test
   public void MensagemAlteracaoConta(){
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
       contaPage.setBotaoContas();
       contaPage.setBotaoLista();
       contaPage.setBotaoDeletar();
       contaPage.setValidMensagemDeletar();
   }
}
