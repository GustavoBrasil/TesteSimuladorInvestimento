package verification;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidaSimulacao {

	public void validaTextoSimulacao(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(
				driver.findElement(By.cssSelector(".maisOpcoes > span")), "Veja estas outras opções para você"));

		String mensagem = driver.findElement(By.cssSelector(".maisOpcoes > span")).getText();
		Assert.assertEquals(mensagem, "Veja estas outras opções para você");

	}

}
