package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pages.SimulacaoPage;

public class SimulacaoTask {

	private SimulacaoPage simulacao;
	private WebDriver driver;

	public SimulacaoTask(WebDriver driver) {
		this.driver = driver;
		this.simulacao = new SimulacaoPage(driver);
	}

	public void setValorAplicarTextField(String valor) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		simulacao.getValorAplicarTextField().sendKeys(valor);

	}

	public void setPouparPorMesTextField(String poupar) {

		simulacao.getPouparPorMesTextField().sendKeys(poupar);

	}

	public void setTempoParaPouparTextField(String tempo) {

		simulacao.getTempoParaPouparTextField().sendKeys(tempo);

	}

	public void setSimularButton() {

		simulacao.getSimularButton().click();

	}

	public void setLimparButton() {

		simulacao.getLimparButton().click();

	}

}
