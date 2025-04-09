package Pages.VTE_Assessments_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


//*************** Line no. 15 needs to be changed if needed.***************


public class AntenatalAssessment_Page {
	
WebDriver driver;
	
	public AntenatalAssessment_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchPatient = By.xpath("//input[@placeholder='Search by Patient Id , MRN ,Name  ']");
	By newvteantenatal = By.xpath("//span[text()='New VTE antenatal assessment']");
	By clickpatient = By.xpath("(//span[contains(text(),'Lubna')])[1]");
	By selectlowcheckbox1 = By.xpath("(//input[@class='xu4'])[6]");
	By selectlowcheckbox2 = By.xpath("(//input[@class='xu4'])[9]");
	By selectlowcheckbox3 = By.xpath("(//input[@class='xu4'])[10]");
	By mechanicaldevice = By.xpath("(//input[@class='xu4'])[1]");
	By selectintermediatebox = By.xpath("(//input[@class='xu4'])[18]");
	By selecthighcheckbox = By.xpath("(//input[@class='xu4'])[21]");
	
	
	
	public void enterPatientID(String patient) {
	    driver.findElement(searchPatient).sendKeys(patient);
	    driver.findElement(searchPatient).sendKeys(Keys.ENTER);
	}
	public void clickNewVTEAntenatal() {
		driver.findElement(newvteantenatal).click();
	}
	
	public void clickPatient() {
		driver.findElement(clickpatient).click();
	}
	
	public void clickLowCheckBox1() {
		driver.findElement(selectlowcheckbox1).click();
	}
	
	public void clickLowCheckBox2() {
		driver.findElement(selectlowcheckbox2).click();
	}
	
	public void clickLowCheckBox3() {
		driver.findElement(selectlowcheckbox3).click();
	}
	
	public void selectMechanicalDevice() {
		driver.findElement(mechanicaldevice).click();
	}
	
	public void selectIndications() {
		driver.findElement(selectlowcheckbox2).click();
	}
	
	public void clickIntermediateCheckBox() {
		driver.findElement(selectintermediatebox).click();
	}
	
	public void clickHighCheckBox() {
		driver.findElement(selecthighcheckbox).click();
	}
	
	

}
