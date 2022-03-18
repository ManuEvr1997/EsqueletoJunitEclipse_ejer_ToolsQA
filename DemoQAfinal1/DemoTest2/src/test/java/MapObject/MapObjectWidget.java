package MapObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoNav.DemoBaseFinal;

public class MapObjectWidget extends DemoBaseFinal 

{

	public MapObjectWidget(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	protected By barraWidged = By.xpath("//*[@class='left-pannel']/div/div[4]");
	protected By datePiker = By.xpath("//*[@class='element-list collapse show']/ul/li[3]");
	protected By textFieldDate = By.xpath("//*[@id='datePickerMonthYearInput']");
	protected By dateMonth = By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
	protected By BtnWidgets = By.xpath("//*[@class='left-pannel']/div/div[4]");
	//protected By BtnDataPicker = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]\r\n");
	protected By BtnFecha = By.xpath("//input[@id='datePickerMonthYearInput']");
	protected By BtnAño = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]");
	//protected By monthDate = By.xpath("//div[contains(text(),'January')])");
	protected By dateMonthDateHour = By.xpath("//*[@id='dateAndTimePickerInput']");
	protected By mesCuarto = By.xpath("//option[@value='4']");
	//protected By selectMonthDate = By.xpath("//div[contains(text(),'January')])");
	//SELECCIONAR AÑO = //div[contains(text(),'2022')]
	//"//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"

	//"//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"
}

