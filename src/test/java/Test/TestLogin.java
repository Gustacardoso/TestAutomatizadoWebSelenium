package Test;

import Page.Adicionar;
import Page.Login;
import Utils.WebDriverUtil;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {

    public static WebDriver driver = WebDriverUtil.openBrowser();

    Login login = new Login(driver);
    Adicionar adicionar = new Adicionar(driver);

    @Test
    public void LoginSucess(){
       login.LoginSucesso();
    }
    @Test
    public void adicionarSemNome(){
        LoginSucess();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoAdicionar();
        this.adicionar.setbotaoSalvar();
        this.adicionar.setValidMensagemErro();
    }

    @Test
    public void ContaCriadaComSucesso(){
        LoginSucess();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoAdicionar();
        this.adicionar.setCampoNome();
        this.adicionar.setbotaoSalvar();
        this.adicionar.setValidMensagemSucess();
    }

    @Test
    public void listaContasCadastradas(){
        LoginSucess();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoLista();
    }

    @Test
    public void AlteracaoDeConta(){
        listaContasCadastradas();
        this.adicionar.setEditarConta();
        this.adicionar.setApagarCampoNome();
        this.adicionar.setCampoNome();
        this.adicionar.setbotaoSalvar();
        this.adicionar.setValidMensagemEditarSucess();

    }
    @Test
    public void ContaRemovida(){
        listaContasCadastradas();

    }

}

