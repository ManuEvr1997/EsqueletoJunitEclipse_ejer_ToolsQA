package PageObject;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapObject.MapObjectPopup;

public class PageObjectPopup extends MapObjectPopup {

	public PageObjectPopup(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void findAlerts (File rutaCarpeta) throws Exception {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		
		/*click(alertsframe, rutaCarpeta);
		tiempoEspera(2000);
		
		click(aletsPp, rutaCarpeta);
		tiempoEspera(2000);*/
		
		//click(recogerBarraWidged, rutaCarpeta);
		//driver.switchTo().alert().dismiss();
		//tiempoEspera(100);
		
		//click(botonFrame, rutaCarpeta);
		//driver.switchTo().alert().dismiss();
		//tiempoEspera(100);
		
		//click(botonAlerts, rutaCarpeta);
		//driver.switchTo().alert().dismiss();
		//tiempoEspera(100);
		
		/*click(botonClick1, rutaCarpeta);
		driver.switchTo().alert().dismiss();
		tiempoEspera(100);
		
		click(botonClick2, rutaCarpeta);
		tiempoEspera(7000);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		
		click(botonClick3, rutaCarpeta);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		tiempoEspera(500);
		click(botonClick3, rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(botonClick4, rutaCarpeta);
		tiempoEspera(500);*/
		
		
		
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
		
	}

}
