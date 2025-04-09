package Pages.Psychiatry_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PsychiatrySessionsSetup_Page {
	
	WebDriver driver;

	public  PsychiatrySessionsSetup_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By sessionssetup = By.xpath("//span[text()='Sessions Setup']");
	By clickadd = By.xpath("//span[text()='Add']");
	By entersession = By.xpath("(//input[@placeholder=' '])[1]");
	By selectsessionrehab = By.xpath("//span[text()='Rehabilitation ']");
	By staffsearchicon = By.id("pt1:contrRg:0:CntRgn:1:MainCard:or1:DetailsColumn:oc4:or4:oc5:ff1:fi4:StaffLov:oasis_list_of_values_search_btn");
	By clickokay = By.xpath("(//span[text()='Ok'])");
	By enterstartdate = By.xpath("(//input[@class='x2b'])[1]");
	By enterenddate = By.xpath("(//input[@class='x2b'])[2]");
	By enterstarttime = By.xpath("(//input[@class='x25'])[3]");
	By enterendtime = By.xpath("(//input[@class='x25'])[4]");
	
	
	public void clickSessionsSetup() {
		driver.findElement(sessionssetup).click();		
	}
	
	public void clickAdd() {
		driver.findElement(clickadd).click();		
	}
	
	public void enterSession(String entersess) {
		driver.findElement(entersession).sendKeys(entersess);
	}
	
	public void selectSessionRehab() {
		driver.findElement(selectsessionrehab).click();		
	}
	
	public void clickStaffIcon() {
		driver.findElement(staffsearchicon).click();		
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();		
	}
	
	public void enterStartDate(String startdate) {
		driver.findElement(enterstartdate).sendKeys(startdate);
	}
	
	public void enterEndDate(String enddate) {
		driver.findElement(enterenddate).sendKeys(enddate);
	}
	
	public void enterStartTime(String starttime) {
		driver.findElement(enterstarttime).sendKeys(starttime);
	}
	
	public void enterEndTime(String endtime) {
		driver.findElement(enterendtime).sendKeys(endtime);
	}

}
