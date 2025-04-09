package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RiskPage {
	
WebDriver driver;
	
	public RiskPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By clickonphysicianmenu = By.xpath("//span[contains(text(),'Physician Menu')]");
	By clickonphysicianworklist = By.xpath("//span[contains(text(),'Physician Worklist')]");
	By clickonopenrecord = By.xpath("(//span[text()='Open Record'])[1]");	
	By clickonmenu = By.xpath("//div[@id[contains(.,'fs_pg:ot3:r1:bsc_inf:ot3:b1')]]");
	By clickonrisks = By.xpath("//span[text()='Risks']");
	By clickonrecordrisk = By.xpath("//span[text()='Record Risk']");
	By clickonother = By.id("pt1:contrRg:0:CntRgn:0:fs_pg:mfs_rg:0:MDTemp:pt_or1:pt_oc2:up_cnt:FoTemp:of2:smc1::content");
	By checkstealing = By.xpath("//label[contains(text(),'Stealing')]");
	By checkviolent = By.xpath("//label[contains(text(),'Violent')]");
	By clickadd = By.xpath("//span[text()='Add']");
	By savedrecords = By.xpath("//h1[text()='OS-1000075 : Record Saved Successfully']");
	By removeviolentrecord = By.xpath("(//span[text()='Remove'])");
	By clickokay = By.xpath("(//span[text()='OK'])[1]");	
	By enterusername = By.xpath("//input[@placeholder='User Name']");

	public void enterUserName() {
		driver.findElement(enterusername).sendKeys("grace");
	}
	
	public void clickOnPhysicianMenu() {
		driver.findElement(clickonphysicianmenu).click();
	}
	
	public void clickOnPhysicianWorkList() {
		driver.findElement(clickonphysicianworklist).click();
	}
	
	public void clickOnOpenRecord() {
		driver.findElement(clickonopenrecord).click();
	}
	

	public void clickOnMenu() {
		driver.findElement(clickonmenu).click();
	}
	
	public void clickOnRisks() {
		driver.findElement(clickonrisks).click();
	}
	
	
	public void clickOnRecordRisk() {
		driver.findElement(clickonrecordrisk).click();
	}
	
	public void clickAdd() {
		driver.findElement(clickadd).click();
	}
	
	public void checkStealing() {
		driver.findElement(checkstealing).click();
	}
		
	public void checkViolent() {
		driver.findElement(checkviolent).click();	
	}
	
	public void removeViolentRecord() {
		driver.findElement(removeviolentrecord).click();	
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();	
	}
	
	
	public void savedRecords() {
		driver.findElement(savedrecords);
	}
	

}
