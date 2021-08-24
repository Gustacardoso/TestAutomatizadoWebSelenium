package Page;

import Localizador.ContaLocalizador;
import Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ContaPage extends BasePage {

    ContaLocalizador contaLocalizador = new ContaLocalizador(driver);
    public ContaPage(WebDriver driver) {
        super(driver);
    }
    public void setBotaoContas(){
        driver.findElement(contaLocalizador.BotaoConta).click();
    }
    public void setBotaoAdicionar() {
        driver.findElement(contaLocalizador.BotaoAdicionar).click();
    }
    public void setbotaoSalvar(){
        driver.findElement(contaLocalizador.BotaoSalvar).click();
    }
    public void setValidMensagemSemNome(){
        WebElement textoErro = driver.findElement(contaLocalizador.validarMensagemErro);
        textoErro.equals("Informe o nome da conta");
    }
    public void setValidMensagemSucess(){
        WebElement textoSucess = driver.findElement(contaLocalizador.validarMensagemSucess);
        textoSucess.equals("Conta adicionada com sucesso");
    }
    public void setCampoNome(String nome){
        driver.findElement(contaLocalizador.CampoNome).sendKeys(nome);
    }
    public void setBotaoLista(){
        driver.findElement(contaLocalizador.BotaoListar).click();
    }
    public void setEditarConta(){
        driver.findElement(contaLocalizador.EditarConta).click();
    }
    public void setApagarCampoNome(){
        driver.findElement(contaLocalizador.CampoNome).clear();
    }
    public void setValidMensagemEditarSucess(){
        WebElement textoSucess = driver.findElement(contaLocalizador.validarMensagemSucess);
        textoSucess.equals("Conta alterada com sucesso!");
    }
    public void setBotaoDeletar(){
        driver.findElement(contaLocalizador.BotaoDeletar).click();
    }
    public void setValidMensagemDeletar(){
        WebElement textoSucess = driver.findElement(contaLocalizador.BotaoDeletar);
        textoSucess.equals("Conta removida com sucesso!");
    }
}
