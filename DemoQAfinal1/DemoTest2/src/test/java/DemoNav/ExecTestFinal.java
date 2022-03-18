package DemoNav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObject.PageObjectElementsFinal;
import PageObject.PageObjectPopup;
import PageObject.PageObjectWebTableFinal;
import PageObject.PageObjectWidgets;
import utilidadesExcel.ReadExcelFile;
import utilidadesExcel.WriteExcelFile;

public class ExecTestFinal {
	
	     
		private WebDriver driver;
		Properties propiedades;
		ReadExcelFile leer;
		WriteExcelFile escribir;
		PageObjectElementsFinal selecObject;
		PageObjectWidgets selectObjetWidged;
		String  url = null;
		PageObjectWebTableFinal paginas;
		PageObjectPopup paginasPp;
		

		@Before
		public void setUp() throws InterruptedException, IOException 
		{
			

			driver= DemoBaseFinal.chromeDriverConnection();
			
			
			//ACCESOS PORTABLES DEL NAVEGADOR
			selecObject = new PageObjectElementsFinal(driver);
			selectObjetWidged =  new PageObjectWidgets(driver);
			
			// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
			propiedades = new Properties();
			//claseBase= new ClaseBase(driver);
			//ACCESOS PORTABLES DEL NAVEGADOR(VAN EN CADA CASO DE PRUEBA)
		    //driver = claseBase.chromeDriverConnection();
			paginas = new PageObjectWebTableFinal(driver);
			paginasPp = new PageObjectPopup(driver);
		
			//INSTANCIAR CLASES DE EXCEL 
			leer = new ReadExcelFile();
			escribir = new WriteExcelFile();

			// CREAR LA VARIABLE TIPO INPUTSTRING
			InputStream entrada = null;

			// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
			try {
				entrada = new FileInputStream("./Properties/datos.properties");
				propiedades.load(entrada);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println(e);
				// TODO: handle exception
			}
			// INSTANCIAR LA CLASE PAGOBJET
			//paginas = new PagsObjeInicioPrueba(driver);

			// ASIGNAMOS LAS OPCIONES Y LA CONFIGURACION DEL NAVEGADOR A LA VARIABLE DRIVER

			//driver = paginas.chromeDriverConnection();

			// ACCEDER AL METODO DE ABRIR LA PAGINA

			
		}
		
		
		//METDODO DE ACCESO A MERCURY VIAJES
		@Test
		public void DemoQa() throws Exception
		{
			if(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",0,0).equals("Si")) 
			{ 
				
		    //OBTENER EL NOMBRE DEL METODO A EJECUTAR
		    String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
				
		    //CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
		    File rutaCarpeta = paginas.crearCarpeta(propiedades,nomTest);
							
		    paginas.urlAcceso(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,1));
		    
		    selecObject.seleccionElements(rutaCarpeta);
			
			paginas.EnvioTexto(leer, propiedades,"datos",rutaCarpeta);
			
			selecObject.selecDelete(rutaCarpeta);
			
			selectObjetWidged.SelecBarraWidged(rutaCarpeta);
			
	//selectObjetWidged.fieldDateHour(rutaCarpeta);
			
			paginasPp.findAlerts(rutaCarpeta);
			
			//selectObjetWidged.scrollMes(leer, propiedades, rutaCarpeta);
			
			}
			 
		}
		
		
		@After
		public void cerrar() {
			driver.quit();
		}
		

		
}

	

