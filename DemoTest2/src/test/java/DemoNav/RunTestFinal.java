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

import PageObject.PagsObjectElements;
import PageObject.PagsObjetPopup;
import PageObject.PagsObjetWebTablel;
import PageObject.PagsObjetWid;
import utilidadesExcel.ReadExcelFile;
import utilidadesExcel.WriteExcelFile;

public class RunTestFinal {

	private WebDriver driver;
	Properties propiedades;
	ReadExcelFile leer;
	WriteExcelFile escribir;
	PagsObjectElements selecObject;
	PagsObjetWid selectObjetWidged;
	String url = null;
	PagsObjetWebTablel paginas;
	PagsObjetPopup paginasPp;

	@Before
	public void setUp() throws InterruptedException, IOException {

		driver = ClaseBaseFinal.chromeDriverConnection();

		// ACCESOS PORTABLES DEL NAVEGADOR
		selecObject = new PagsObjectElements(driver);
		selectObjetWidged = new PagsObjetWid(driver);

		// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
		propiedades = new Properties();
		paginas = new PagsObjetWebTablel(driver);
		paginasPp = new PagsObjetPopup(driver);

		// INSTANCIAR CLASES DE EXCEL
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

	}

	@Test
	public void DemoQa() throws Exception {
		if (leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 0, 0).equals("Si")) {

			// OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			// CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
			File rutaCarpeta = paginas.crearCarpeta(propiedades, nomTest);

			paginas.urlAcceso(leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 1, 1));

			selecObject.seleccionElements(rutaCarpeta);

			paginas.EnvioTexto(leer, propiedades, "datos", rutaCarpeta);

			selecObject.selecDelete(rutaCarpeta);

			selectObjetWidged.SelecBarraWidged(leer, propiedades, nomTest, rutaCarpeta);

			// selectObjetWidged.fieldDateHour(rutaCarpeta);

			paginasPp.findAlerts(leer, propiedades, "datos", rutaCarpeta);

			// selectObjetWidged.scrollMes(leer, propiedades, rutaCarpeta);

		}

	}

	@After
	public void cerrar() {
		driver.quit();
	}

}

	

