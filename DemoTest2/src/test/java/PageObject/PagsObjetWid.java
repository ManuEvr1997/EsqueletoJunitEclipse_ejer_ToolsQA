package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import MapObject.MapsObjectWidt;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetWid extends MapsObjectWidt

{

	public PagsObjetWid(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void SelecBarraWidged(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta ) throws Exception {
		
		//scrollVertical(rutaCarpeta, 340, 231, 340 ,1140);
		//scrollVertical(rutaCarpeta, 410, 301, 340 ,1090);
		//tiempoEspera(3000);
		click(barraWidged,rutaCarpeta);
		tiempoEspera(3000);
		click(datePiker,rutaCarpeta);
		tiempoEspera(3000);
		
		//Date Time
		
		click(selectdate, rutaCarpeta);
		tiempoEspera(3000);
		
		controla(selectdate,rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(selectdate, rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,9),selectdate,rutaCarpeta);
		
		intro(selectdate,rutaCarpeta);
		
		controla(dateMonthDateHour,rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(dateMonthDateHour, rutaCarpeta);
		
		String datos = (leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,10)+","+(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,11)));
		
		sendkey(datos,dateMonthDateHour, rutaCarpeta);
		
		intro(dateMonthDateHour,rutaCarpeta);

	}

}
