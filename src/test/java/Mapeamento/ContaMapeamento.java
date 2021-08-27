package Mapeamento;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContaMapeamento extends BasePage {

    public By BotaoConta =  By.className("dropdown");
    public By BotaoAdicionar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]");
    public By BotaoSalvar = By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button");
    public  By validarMensagemErro = By.cssSelector("body > div.alert.alert-danger");
    public By validarMensagemSucess = By.cssSelector("body > div.alert.alert-success");
    public  By CampoNome = By.id("nome");
    public  By BotaoListar = By.cssSelector("#navbar > ul > li.dropdown.open > ul > li:nth-child(2) > a");
    public By BotaoDeletar = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(2) > span");
    public By EditarConta = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1) > span");

    public ContaMapeamento(WebDriver driver) {
        super(driver);
    }
}
