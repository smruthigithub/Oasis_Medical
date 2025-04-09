package Pages.Mortuary_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SendToMortuary_Page {
	
WebDriver driver;
	
	public SendToMortuary_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox = By.xpath("//input[@id='search|input']");
	By sendToMortuary = By.xpath("//span[text()='Send To Mortuary']");
	By patientID = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:1:stmListContainer:or3:oc3:registerDeathPatInfContext:oscrd:ptinfc:ptdata:frstr:ptidc:dc_ff2:dc_fi2:ptidit::content']");
	By viewcheckbox = By.xpath("//input[@value='t']");
	By clicksendtoMortuary = By.xpath("(//span[text()='Send to Mortuary'])[1]");
	By userName = By.xpath("(//input[@class='x25'])[4]");
	By passWord = By.xpath("(//input[@class='x25'])[5]");
	By okay = By.xpath("//span[text()='OK']");
	
	public void enterSearchField(String mortuarySetup) {
		driver.findElement(searchBox).sendKeys(mortuarySetup);
	}
	
	public void clickSendToMortuary() {
		driver.findElement(sendToMortuary).click();		
	}
	
	public void enterPatientID(String pID) {
		driver.findElement(patientID).sendKeys(pID);
		driver.findElement(patientID).sendKeys(Keys.ENTER);
	}
	
	public void clearPatientID() {
		driver.findElement(patientID).clear();
		driver.findElement(patientID).sendKeys(Keys.ENTER);
	}
	
	public void clickViewCheckbox() {
		driver.findElement(viewcheckbox).click();
	}
	
	public void clickSendToMortuaryTab() {
		driver.findElement(clicksendtoMortuary).click();
	}
	
	public void enterUsername(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void enterPassword(String pWord) {
		driver.findElement(passWord).sendKeys(pWord);
	}
	
	public void clickOkay() {
		driver.findElement(okay).click();
	}


}
