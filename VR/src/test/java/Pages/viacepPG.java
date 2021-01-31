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

			Assert.fail("Logradouro não encontrado");

		}

		
	}
	public void validarIBGE() {
		
		String IBGE = "3550308";
		

		if (getDriver().getPageSource().contains(IBGE)) {

			System.out.println("Código IBGE encontrado");
		} else {

			Assert.fail("Código IBGE não encontrado");

		}
	}
	
	
	

}
