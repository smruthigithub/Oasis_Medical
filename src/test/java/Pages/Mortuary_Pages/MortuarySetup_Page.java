package Pages.Mortuary_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MortuarySetup_Page {
	
	WebDriver driver;

	public  MortuarySetup_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox = By.xpath("//input[@id='search|input']");
	By morturaySetup = By.xpath("//span[text()='Mortuary Setup']");
	By freeTab = By.xpath("//span[text()='Free']");
	By occupiedTab = By.xpath("//span[text()='Occupied']");
	By inActiveTab = By.xpath("//span[text()='In active']");
	By allTab = By.xpath("//span[text()='All']");
	By inputsessionCode = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:1:oc2:or2:oc4:ot5:ff2:fi1:FilterPatInfo:listOfValueTxt::content']");
	By actionFreezerCode = By.xpath("//span[text()='Freezer Code [Sessioncode] - Description [Mortuary Session ] ']");
	//Add New Freezer
	By addNewFreezer = By.xpath("//span[text()='Add New Freezer']");
	By inputFreezerCode = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:1:oc2:ff1:fi1:freezerCodeID::content']");
	By inputFreezerDescrp = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:1:oc2:ff1:fi2:freezerDescriptionID::content']");
	By okNewFreezer = By.xpath("//span[text()='OK'][1]");
	//Edit Freezer
	By editFreezer = By.xpath("//span[text()='Edit'][1]");
	By editFrzerCode = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:1:oc2:ff1:fi1:freezerCodeID::content']");
	By editFrzerDescrp = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:1:oc2:ff1:fi2:freezerDescriptionID::content']");
	By editOk = By.xpath("//span[text()='OK'][1]");
	
	
	public void enterSearchField(String setup) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(setup);
		//driver.findElement(searchBox).sendKeys(mortuarySetup);
	}
	public void clickMorturaySetup() {
		driver.findElement(morturaySetup).click();		
	}
	public void clickFreeTab() {
		driver.findElement(freeTab).click();		
	}
	public void clickOccupiedTab() {
		driver.findElement(occupiedTab).click();		
	}
	public void clickinActiveTab() {
		driver.findElement(inActiveTab).click();		
	}
	public void clickAllTab() {
		driver.findElement(allTab).click();		
	}
	public void entersessionCode(String sCode) {
		driver.findElement(inputsessionCode).sendKeys(sCode);
	}
	public void clickFreezerCode() {
		driver.findElement(actionFreezerCode).click();		
	}
	public void clearSessionCode() {
		driver.findElement(inputsessionCode).clear();	
	}
	public void clickAddNewFreezer() {
		driver.findElement(addNewFreezer).click();		
	}
	public void clearFreezerCode() {
		driver.findElement(inputFreezerCode).clear();	
	}
	public void enterFreezerCode(String freezeCode) {
		driver.findElement(inputFreezerCode).sendKeys(freezeCode);	
	}
	public void enterFreezerDescrp(String freezeDescrp) {
		driver.findElement(inputFreezerDescrp).sendKeys(freezeDescrp);
	}
	public void clickOkNewFreezer() {
		driver.findElement(okNewFreezer).click();		
	}
	public void clickEditFreezer() {
		driver.findElement(editFreezer).click();		
	}
	public void clearEditFreezer() {
		driver.findElement(editFrzerCode).clear();	
	}
	public void editFreezerCode(String edtFrzrCde) {
		driver.findElement(editFrzerCode).sendKeys(edtFrzrCde);
	}
	public void clearFreezerDescrp(String edtFrzrDsrp) {
		driver.findElement(editFrzerDescrp).clear();
	}
	public void editFreezerDescrp(String edtFrzrDsrp) {
		driver.findElement(editFrzerDescrp).sendKeys(edtFrzrDsrp);
	}
	public void clickOkay() {
		driver.findElement(editOk).click();		
	}


}
