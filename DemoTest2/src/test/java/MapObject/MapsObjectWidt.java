package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.ClaseBaseFinal;

public class MapsObjectWidt extends ClaseBaseFinal

{

	public MapsObjectWidt(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	protected By barraWidged = By.xpath("//*[@class='left-pannel']/div/div[4]");
	protected By datePiker = By.xpath("//*[@class='element-list collapse show']/ul/li[3]");
	protected By selectdate = By.xpath("//*[@id='datePickerMonthYearInput']");
	protected By BtnWidgets = By.xpath("//*[@class='left-pannel']/div/div[4]");
	protected By dateMonthDateHour = By.id("dateAndTimePickerInput");// input[@id='dateAndTimePickerInput']
}

