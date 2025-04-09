package Pages.Psychiatry_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PsychiatryStagesSetup_Page {
	WebDriver driver;

	public  PsychiatryStagesSetup_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By stagessetup = By.xpath("//span[text()='Stages Setup']");
	By addnewstage = By.xpath("//span[text()='Add New Stage']");
	By entersession = By.xpath("//input[@placeholder=' ']");
	By selectsessionrehab = By.xpath("(//span[text()='Rehabilitation '])[2]");
	By selectsessionfollow = By.xpath("(//span[text()='Follow Up '])[1]");
	By enterdesc = By.xpath("(//textarea[@class='x25'])[1]");
	By enterfromage = By.xpath("(//input[@class='x25'])[2]");
	By entertoage = By.xpath("(//input[@class='x25'])[3]");
	By enterdays = By.xpath("(//input[@class='x25'])[4]");
	By enterweeks = By.xpath("(//input[@class='x25'])[5]");
	By selectday = By.xpath("(//input[@value='t'])[5]");
	By clicksave = By.xpath("//span[text()='Save']");
	By clickedit = By.xpath("(//span[text()='Edit'])[1]");
	By clickokay = By.xpath("(//span[text()='OK'])[1]");
	
	
	public void clickStagesSetup() {
		driver.findElement(stagessetup).click();		
	}
	
	public void clickAddNewStage() {
		driver.findElement(addnewstage).click();		
	}
	
	public void enterSession(String entersess) {
		driver.findElement(entersession).sendKeys(entersess);
	}
	
	public void selectSessionRehab() {
		driver.findElement(selectsessionrehab).click();		
	}
	
	public void selectSessionFollowup() {
		driver.findElement(selectsessionfollow).click();		
	}
	
	public void enterStageDesc(String desc) {
		driver.findElement(enterdesc).sendKeys(desc);
	}
	
	public void enterFromAge(String fromage) {
		driver.findElement(enterfromage).sendKeys(fromage);
	}
	
	public void enterToAge(String toage) {
		driver.findElement(entertoage).sendKeys(toage);
	}
	
	public void clearToAge() {
		driver.findElement(entertoage).clear();
	}
	
	public void enterDays(String days) {
		driver.findElement(enterdays).sendKeys(days);
	}
	
	public void enterWeeks(String weeks) {
		driver.findElement(enterweeks).sendKeys(weeks);
	}
	
	public void selectDay() {
		driver.findElement(selectday).click();		
	}
	
	public void clickSave() {
		driver.findElement(clicksave).click();		
	}
	
	public void clickEdit() {
		driver.findElement(clickedit).click();		
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();		
	}

}
