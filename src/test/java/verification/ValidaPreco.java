package verification;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidaPreco {

	public void validaTextoPreco(WebDriver driver) {

		String mensagem = driver.findElement(By.cssSelector("label#valorAplicar-error")).getText();
		Assert.assertEquals(mensagem, "Valor mínimo de 20.00");

	}
}
