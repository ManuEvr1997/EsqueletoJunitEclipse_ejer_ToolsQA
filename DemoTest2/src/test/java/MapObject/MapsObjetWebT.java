package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.ClaseBaseFinal;

public class MapsObjetWebT extends ClaseBaseFinal {
	// CONSTRUCTOR DE LA CLASE
	public MapsObjetWebT(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	protected By firstName = By.xpath("//input[@placeholder='First Name']");
	protected By lastName = By.xpath("//input[@placeholder='Last Name']");
	protected By userEmail = By.xpath("//input[@id='userEmail']");
	protected By userEdad = By.xpath("//input[@id='age']");
	protected By userSalario = By.xpath("//input[@id='salary']");
	protected By userDepartment = By.xpath("//input[@id='department']");
	protected By sendInfo = By.xpath("//button[@id='submit']");

}
