package screenShots;

import static center.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import center.DriverFactory;

public class TC001ConsultaValida {

	
public void evidenciar() throws IOException {
		
		Date d = new Date();
		File shot= ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		Files.copy(shot, new File("C:\\evidencias\\Primeiro Cenario\\"+d.toString().replace(":"," ")+".png"));
		
		DriverFactory.killDriver();
			
			
		}
	
	
}
