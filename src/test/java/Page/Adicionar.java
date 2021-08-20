package Page;

import PageObject.ElementConta;
import Utils.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class Adicionar  extends BasePage {


    public Adicionar(WebDriver driver) {
        super(driver);
    }
    ElementConta elementConta = new ElementConta(driver);



    public void setBotaoContas(){
        elementConta.getBotaoConta().click();
    }
    public void setBotaoAdicionar(){
        elementConta.getBotaoAdicionar().click();
    }
    public void setbotaoSalvar(){
        elementConta.getBotaoSalvar().click();
    }

    public void setValidMensagemErro(){
        WebElement textoErro = elementConta.getValideMensagemSemNome();
        textoErro.equals("Informe o nome da conta");
    }

    public void setValidMensagemSucess(){
        WebElement textoSucess = elementConta.getValideMensagemsucess();
        textoSucess.equals("Conta adicionada com sucesso");
    }

    public void setCampoNome(){
        Faker faker = new Faker(new Locale("pt","Br"));
        String nome = faker.name().firstName();
        elementConta.getCampoNome().sendKeys(nome);
    }

    public void setBotaoLista(){
        elementConta.getBotaoLista().click();
    }

    public void setEditarConta(){
        elementConta.getEditarConta().click();
    }
    public void setApagarCampoNome(){
        elementConta.getCampoNome().clear();
    }
    public void setValidMensagemEditarSucess(){
        WebElement textoSucess = elementConta.getValideMensagemsucess();
        textoSucess.equals("Conta alterada com sucesso!");
    }
    public void setBotaoDeletar(){
        elementConta.getBotaoDeletar().click();
    }
    public void setValidMensagemDeletar(){
        WebElement textoSucess = elementConta.getValideMensagemsucess();
        textoSucess.equals("Conta removida com sucesso!");
    }
}
