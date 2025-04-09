package Pages.NurseDrugReceive_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NurseDrugReceive_Page {
	WebDriver driver;

	public  NurseDrugReceive_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By nursedrugreceive = By.xpath("//span[text()='Nurse Drug Receive']");
	By selectcode = By.xpath("(//div[@class='x3mh xfl p_AFTextOnly'])[1]");
	By wardicon = By.xpath("(//div[@_afrgrp='0'])[12]");
	By enterwardname = By.xpath("(//input[@class='x25'])[4]"); // also username
	By clicksearch = By.xpath("//span[text()='Search']");
	By clickreset = By.xpath("//span[text()='Reset']");
	By clickokay = By.xpath("//span[text()='Ok']");
	By entermrno = By.xpath("(//input[@class='x25'])[2]");
	By enterpatientID = By.xpath("(//input[@class='x25'])[3]");
	By enterfromdate = By.xpath("(//input[@child='dlg'])[1]");
	By entertodate = By.xpath("(//input[@child='dlg'])[2]");
	By clickreceived = By.xpath("//input[@value='t']");
	By clickreceivedbtn = By.xpath("//span[text()='Received ']");
	By selectcheckbox = By.xpath("(//input[@value='t'])[2]");
	By clickselectall = By.xpath("//span[text()='Select All']");
	By clickunselectall = By.xpath("//span[text()='Un Select All']");
	By selectfirstbox = By.xpath("(//input[@value='t'])[2]");
	By enterPassword = By.xpath("(//input[@class='x25'])[5]");
	By selecttocalender = By.xpath("(//a[@title='Select Date and Time'])[2]");
	By selecttoday = By.xpath("(//td[@tabindex='0'])[2]");
	
	
	public void clicknursedrugreceive() {
		driver.findElement(nursedrugreceive).click();		
	}
	
	public void clickWardIcon() {
		driver.findElement(wardicon).click();		
	}
	
	public void enterWardName(String wardname) {
		driver.findElement(enterwardname).sendKeys(wardname);
		driver.findElement(enterwardname).sendKeys(Keys.ENTER);
	}
	
	public void clickSearchBtn() {
		driver.findElement(clicksearch).click();		
	}
	
	public void clickResetBtn() {
		driver.findElement(clickreset).click();		
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();		
	}
	
	public void enterMRNo(String mrno) {
		driver.findElement(entermrno).sendKeys(mrno);
	}
	
	public void enterPatientID(String patid) {
		driver.findElement(enterpatientID).sendKeys(patid);
	}
	
	public void clearPatientID() {
		driver.findElement(enterpatientID).clear();
	}
	
	public void enterFromDate(String fromdate) {
		driver.findElement(enterfromdate).clear();
		driver.findElement(enterfromdate).sendKeys(fromdate);
	}
	
	public void selectToCalender() {
		driver.findElement(selecttocalender).click();		
	}
	
	public void selectToday() {
		driver.findElement(selecttoday).click();
		driver.findElement(selecttoday).sendKeys(Keys.ENTER);
	}
	
	public void enterToDate(String todate) {		
		driver.findElement(entertodate).sendKeys(todate);
	}

	public void clickReceivedBox() {
		driver.findElement(clickreceived).click();		
	}
	
	public void selectCheckBox() {
		driver.findElement(selectcheckbox).click();		
	}
	
	public void clickReceivedBtn() {
		driver.findElement(clickreceivedbtn).click();		
	}
	
	public void clickSelectAll() {
		driver.findElement(clickselectall).click();		
	}
	
	public void clickUnSelectAll() {
		driver.findElement(clickunselectall).click();		
	}
	
	public void selectFirstBox() {
		driver.findElement(selectfirstbox).click();		
	}
	
	public void enterUsername(String user) {		
		driver.findElement(enterwardname).sendKeys(user);
	}
	
	public void enterPassword(String pass) {		
		driver.findElement(enterPassword).sendKeys(pass);
	}
	
	
}
