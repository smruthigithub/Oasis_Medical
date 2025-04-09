package Pages.Mortuary_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PerinatalDeathReg_Page {
	WebDriver driver;

	public  PerinatalDeathReg_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By perinataldeathreg = By.xpath("//span[text()='Perinatal Death Registration']");
	By enterpatientid = By.xpath("(//input[@class='x25'])[3]");
	By clickbornliveon = By.xpath("(//a[@title='Select Date and Time'])[1]");
	By clickokbornliveon = By.xpath("(//button[text()='OK'])[3]");
	By selectbabysex = By.xpath("(//input[@value='2'])[4]");
	By childweight = By.xpath("(//input[@class='x25'])[7]");
	By selectattendant = By.xpath("(//input[@value='t'])[6]");
	By maindisease = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
	By okdisease = By.xpath("//span[text()='Ok']");
	By clickdeadon = By.xpath("(//a[@title='Select Date and Time'])[3]");
	
	
	public void clickPerinatalDeathReg() {
		driver.findElement(perinataldeathreg).click();		
	}
	
	public void enterPatientID(String patid) {
		driver.findElement(enterpatientid).sendKeys(patid);
		driver.findElement(enterpatientid).sendKeys(Keys.ENTER);
	}
	
	public void clearPatientID() {
		driver.findElement(enterpatientid).clear();
		driver.findElement(enterpatientid).sendKeys(Keys.ENTER);
	}
	
	public void clickBornLiveOn() {
		driver.findElement(clickbornliveon).click();		
	}
	
	public void clickDeadOn() {
		driver.findElement(clickdeadon).click();		
	}
	
	public void clickOKBornLiveOn() {
		driver.findElement(clickokbornliveon).click();		
	}
	
	public void selectBabySex() {
		driver.findElement(selectbabysex).click();		
	}
	
	public void enterChildWeight(String weight) {
		driver.findElement(childweight).sendKeys(weight);
	}
	
	public void selectAttendant() {
		driver.findElement(selectattendant).click();		
	}
	
	public void clickMainDiseaseIcon() {
		driver.findElement(maindisease).click();		
	}
	
	public void clickOKDisease() {
		driver.findElement(okdisease).click();		
	}
	
	

}
