package Pages.VTE_Assessments_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdultAssessment_Page {
	
WebDriver driver;
	
	public AdultAssessment_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By clickvteassess = By.xpath("//span[text()='VTE Assessment']");
	By newvteadult = By.xpath("//span[text()='New VTE adult assessment']");
	By selectlowcheckbox = By.xpath("(//input[@class='xu4'])[3]");
	By clicknext = By.xpath("//span[text()='next']");
	By selectmoderatebox = By.xpath("(//input[@class='xu4'])[22]");
	By recommendation1 = By.xpath("(//input[@class='xu3'])[1]");
	By recommendation2 = By.xpath("(//input[@class='xu3'])[2]");
	By recommendation3 = By.xpath("(//input[@class='xu3'])[3]");
	By mechanicaldevice = By.xpath("(//input[@class='xu4'])[2]");
	By selecthighriskbox = By.xpath("(//input[@class='xu4'])[27]");
	By selecthighestbox = By.xpath("(//input[@class='xu4'])[35]");
	By clicksave = By.xpath("//span[text()='Save']");
	
	
	
	public void clickVTEAssessment() {
		driver.findElement(clickvteassess).click();
	}
	
	public void clickNewVTEAdult() {
		driver.findElement(newvteadult).click();
	}
	
	public void clickLowCheckBox() {
		driver.findElement(selectlowcheckbox).click();
	}
	
	public void clickNext() {
		driver.findElement(clicknext).click();
	}
	
	public void clickModerateCheckBox() {
		driver.findElement(selectmoderatebox).click();
	}
	
	public void selectProphylaxis() {
		driver.findElement(recommendation1).click();
	}
	
	public void selectProphylaxis2() {
		driver.findElement(recommendation2).click();
	}
	
	public void selectMechanicalDevice() {
		driver.findElement(mechanicaldevice).click();
	}
	
	public void selectContraindications() {
		driver.findElement(selectlowcheckbox).click();
	}
	
	public void clickHighCheckBox() {
		driver.findElement(selecthighriskbox).click();
	}
	
	public void clickHighestCheckBox() {
		driver.findElement(selecthighestbox).click();
	}
	
	public void clickSave() {
		driver.findElement(clicksave).click();
	}
	
	public void selectProphylaxis3() {
		driver.findElement(recommendation3).click();
	}
}
