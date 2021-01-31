package Pages;

import static center.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.testng.Assert;


public class viacepPG {

	By valores = By.xpath("/html/body/pre");

	public void validarEndereco() {

		String logradouro = "Avenida Augusto de Castro";
		
		
		if (getDriver().getPageSource().contains(logradouro)) {

			System.out.println("Logradouro encontrado");
		} else {

			Assert.fail("Logradouro n�o encontrado");

		}

		
	}
	public void validarIBGE() {
		
		String IBGE = "3550308";
		

		if (getDriver().getPageSource().contains(IBGE)) {

			System.out.println("C�digo IBGE encontrado");
		} else {

			Assert.fail("C�digo IBGE n�o encontrado");

		}
	}
	
	
	

}
