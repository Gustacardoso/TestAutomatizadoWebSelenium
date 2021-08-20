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
    public void LoginSucesso(){
       login.LoginSucesso();
    }
    @Test
    public void adicionarSemNome(){
        LoginSucesso();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoAdicionar();
        this.adicionar.setbotaoSalvar();
        this.adicionar.setValidMensagemErro();
    }

    @Test
    public void ContaCriadaComSucesso(){
        LoginSucesso();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoAdicionar();
        this.adicionar.setCampoNome();
        this.adicionar.setbotaoSalvar();
        this.adicionar.setValidMensagemSucess();
    }

    @Test
    public void listaContasCadastradas(){
        LoginSucesso();
        this.adicionar.setBotaoContas();
        this.adicionar.setBotaoLista();
    }


    @Test
    public void ContaRemovida(){
        listaContasCadastradas();
        //FALTOU O BOTAO
        this.adicionar.setValidMensagemDeletar();

    }

}

