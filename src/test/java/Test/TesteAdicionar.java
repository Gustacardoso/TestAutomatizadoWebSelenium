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
    @Test
    public void MensagemSucessDeletar(){
        login.LoginSucesso();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoLista();
        this.adicionar.setBotaoDeletar();
        this.adicionar.setValidMensagemDeletar();
    }
    @Test
    public void AlteracaoDeConta(){
        login.LoginSucesso();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoLista();
        this.adicionar.setEditarConta();
        this.adicionar.setApagarCampoNome();
        this.adicionar.setCampoNome();
        this.adicionar.setbotaoSalvar();
        this.adicionar.setValidMensagemEditarSucess();

    }
}
