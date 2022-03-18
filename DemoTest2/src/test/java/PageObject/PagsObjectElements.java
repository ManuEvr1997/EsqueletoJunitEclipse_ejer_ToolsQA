package PageObject;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import DemoNav.ClaseBaseFinal;
import MapObject.MapsObjetElements;

public class PagsObjectElements extends MapsObjetElements
{
	
	ClaseBaseFinal DemoB;
	public PagsObjectElements(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void seleccionElements( File rutaCarpeta) throws Exception
		{

			
	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			click( Elements, rutaCarpeta);
			tiempoEspera(3000);
			//JavascriptExecutor js1 = (JavascriptExecutor) driver;
			//js1.executeScript("window.scrollBy(0,1000)");
			click(Table, rutaCarpeta);
			tiempoEspera(3000);
			
			click(Add, rutaCarpeta);
			tiempoEspera(3000);
			
		
		}

	
	public void selecDelete( File rutaCarpeta) throws Exception
	{
	
		click(Delete, rutaCarpeta);
		tiempoEspera(3000);
		
	}
	

}
