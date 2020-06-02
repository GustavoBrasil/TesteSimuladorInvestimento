package steps;

import java.awt.AWTException;
import java.awt.HeadlessException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import tasks.SimulacaoTask;
import util.BrowserSupport;
import util.Highlight;
import util.ScreenshotManager;
import verification.ValidaPreco;
import verification.ValidaSimulacao;

public class SimulaInvestimentoTestCase {

	private static WebDriver driver;
	private SimulacaoTask simulacao;
	private ValidaPreco vpreco;
	private ValidaSimulacao vsimulacao;
	private ScreenshotManager screenshot;
	private Highlight marked;

	double dvalores = Math.floor(Math.random() * 20001);
	double dtempo = Math.floor(Math.random() * 21);

	String valores = Double.toString(dvalores);
	String tempo = Double.toString(dtempo);

	@Given("que eu acesse a pagina inicial do simulador")
	public void queEuAcesseAPaginaInicialDoSimulador() {

		SimulaInvestimentoTestCase.driver = BrowserSupport.chromeBrowser();

	}

	@Given("informo o valor inicial para aplicar")
	public void informoOValorInicialParaAplicar() {

		this.simulacao = new SimulacaoTask(driver);
		simulacao.setValorAplicarTextField(valores);

	}

	@Given("informo o quanto eu quero poupar por mes")
	public void informoOQuantoEuQueroPouparPorMes() {
		this.simulacao = new SimulacaoTask(driver);
		simulacao.setPouparPorMesTextField(valores);
	}

	@Given("informo o tempo que eu desejo poupar")
	public void informoOTempoQueEuDesejoPoupar() {
		this.simulacao = new SimulacaoTask(driver);
		simulacao.setTempoParaPouparTextField(tempo);

	}

	@Then("clico em simular")
	public void clicoEmSimular() {
		this.simulacao = new SimulacaoTask(driver);
		simulacao.setSimularButton();

	}

	@Then("valido o resultado")
	public void validoOResultado() throws HeadlessException, AWTException {

		this.vsimulacao = new ValidaSimulacao();
		this.marked = new Highlight();
		this.screenshot = new ScreenshotManager();
		this.vpreco = new ValidaPreco();
		this.simulacao = new SimulacaoTask(driver);

		vsimulacao.validaTextoSimulacao(driver);
		marked.marked(driver);
		screenshot.getScreenshot();

		if (dvalores < 2000) {

			vpreco.validaTextoPreco(driver);
			screenshot.getScreenshot();
			simulacao.setLimparButton();

		}

		else {

			vsimulacao.validaTextoSimulacao(driver);
			marked.marked(driver);
			screenshot.getScreenshot();

		}
	}

	@After
	public void tearDown() {

		driver.close();
		driver.quit();

	}

}
