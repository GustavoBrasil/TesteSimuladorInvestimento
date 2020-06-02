package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimulacaoPage {

	private WebDriver driver;

	public SimulacaoPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValorAplicarTextField() {

		WebElement aplicar = driver.findElement(By.cssSelector("#valorAplicar"));
		return aplicar;

	}

	public WebElement getPouparPorMesTextField() {

		WebElement poupar = driver.findElement(By.id("valorInvestir"));
		return poupar;

	}

	public WebElement getTempoParaPouparTextField() {

		WebElement tempo = driver.findElement(By.id("tempo"));
		return tempo;

	}

	public WebElement getSimularButton() {

		WebElement simular = driver.findElement(By.cssSelector(".btn.btnAmarelo.btnSimular"));
		return simular;

	}

	public WebElement getLimparButton() {

		WebElement limpar = driver.findElement(By.cssSelector(".btn.btnLimpar"));
		return limpar;

	}
}
