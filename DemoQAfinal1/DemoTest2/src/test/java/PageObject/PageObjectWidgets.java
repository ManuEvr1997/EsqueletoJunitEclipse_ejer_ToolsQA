package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import MapObject.MapObjectWidget;
import utilidadesExcel.ReadExcelFile;

public class PageObjectWidgets extends MapObjectWidget

{

	public PageObjectWidgets(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void SelecBarraWidged(File rutaCarpeta ) throws Exception {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		click(barraWidged, rutaCarpeta);
		tiempoEspera(3000);
		
		click(datePiker, rutaCarpeta);
		tiempoEspera(3000);
		
		click(textFieldDate, rutaCarpeta);
		tiempoEspera(3000);
		
		click(dateMonth, rutaCarpeta);
		tiempoEspera(3000);
		
		click(BtnFecha, rutaCarpeta);
		tiempoEspera(3000);
		
		click(BtnAño, rutaCarpeta);
		tiempoEspera(3000);
		
		click(mesCuarto, rutaCarpeta);
		tiempoEspera(3000);
		
	
		
		/*actor.attemptsTo(
				Enter.keyValues("" + Keys.CONTROL + "a").into(input_clear),
				Enter.keyValues("" + Day + "" + mount + "" + year).into(input_clear)
				);*/
		

	}
	
	/*public void fieldDateHour (File rutaCarpeta) throws Exception{
		
		click(dateMonthDateHour, rutaCarpeta);
		tiempoEspera(3000);
	}*/
	
	


}
