package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import MapObject.MapObjetWebTables;
import utilidadesExcel.ReadExcelFile;

public class PageObjectWebTableFinal extends  MapObjetWebTables
{
	public PageObjectWebTableFinal(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void EnvioTexto(ReadExcelFile leer, Properties propiedades,String numHoja,File rutaCarpeta ) throws Exception 
	{
		
		//String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		//File rutaCarpeta = crearCarpeta(propiedades,nomTest);
		
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,2),firstName,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,3),lastName,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,4),userEmail,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,5),userEdad,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,6),userSalario,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,7),userDepartment,rutaCarpeta);
		
		click( sendInfo, rutaCarpeta);
		tiempoEspera(1000);
		
		
		
	}
	
	

}
