package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapObject.MapsObjetPopup;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetPopup extends MapsObjetPopup {

	public PagsObjetPopup(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void findAlerts (ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta) throws Exception {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
	
		
		
		click(alertsFrame, rutaCarpeta);
		tiempoEspera(2000);
		
		click(alerts, rutaCarpeta);
		tiempoEspera(1000);
		
		click(btnClic1, rutaCarpeta);
		driver.switchTo().alert().dismiss();
		tiempoEspera(100);
		click(btnClic2, rutaCarpeta);
		tiempoEspera(7000);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta);
		tiempoEspera(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClic4, rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().sendKeys(leer.getCellValue(propiedades.getProperty("PathExcel"),nomTest,1,8));
		alert();
		
	}

}
