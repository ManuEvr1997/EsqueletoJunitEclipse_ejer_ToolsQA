package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBaseFinal;

public class MapObjectElementsFinal extends DemoBaseFinal 
{
	
	public MapObjectElementsFinal(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	//METODO PARA DARLE CLICK AL BOTON REGISTRO
	
	protected By Elements = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]");
	protected By Table = By.xpath("//span[contains(text(),'Web Tables')]");
	protected By Add = By.xpath("//button[@id='addNewRecordButton']");
	protected By Delete = By.xpath("//*[@id=\"delete-record-2\"]");
	
	
	

}
 