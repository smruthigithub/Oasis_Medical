package Pages.Psychiatry_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReligiousSession_Page {
	WebDriver driver;

	public  ReligiousSession_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By psychiatricreferrals = By.xpath("//span[text()='Psychatric Referrals']");
	By enterpatientID = By.xpath("(//input[@class='x25'])[3]");
	By clickaction = By.xpath("//a[@title='Action']");
	By clickconsultant = By.xpath("//a[text()='Consultant Recommendation']");
	By religiousguidance = By.xpath("//a[text()='Religious Guidance']");
	By clickfromdate = By.xpath("(//a[@title='Select Date and Time'])[1]");	
	By selectfromdate = By.xpath("(//td[@tabindex='0'])[2]");
	By enterenddate = By.xpath("(//input[@child='dlg'])[2]");
	By enterresult = By.xpath("(//textarea[@class='x25'])[1]");
	By enterrecommendation = By.xpath("(//textarea[@class='x25'])[2]");
	By enternextrecommendation = By.xpath("(//textarea[@class='x25'])[3]");
	
	
	By stafficon1 = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
	By stafficon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[2]");
	By prayerstafficon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[3]");
	By clickaddbtn1 = By.xpath("(//div[@data-afr-pdo='ok'])[1]");
	By clickaddbtn2 = By.xpath("(//div[@data-afr-pdo='ok'])[2]");
	By createpayer = By.xpath("//a[text()='Create Prayer ']");
	By clickokay = By.xpath("(//span[text()='Ok'])[2]");
	By selectstaffname = By.xpath("(//span[contains(text(),'SARAH')])[3]");
	By clickfilterokay = By.xpath("(//span[text()='Ok'])[3]");

	
	
	public void clickPsychiatricReferrals() {
		driver.findElement(psychiatricreferrals).click();		
	}
	
	public void enterPatientID(String patid) {
		driver.findElement(enterpatientID).sendKeys(patid);
		driver.findElement(enterpatientID).sendKeys(Keys.ENTER);
	}
	
	public void clickAction() {
		driver.findElement(clickaction).click();		
	}
	
	public void clickConsultant() {
		driver.findElement(clickconsultant).click();		
	}
	
	public void religiousGuidance() {
		driver.findElement(religiousguidance).click();		
	}
	
	public void clickFromDate() {
		driver.findElement(clickfromdate).click();		
	}
	
	public void selectFromDate() {
		driver.findElement(selectfromdate).click();		
		driver.findElement(selectfromdate).sendKeys(Keys.ENTER);
	}
	
	public void enterEndDate(String date) {
		driver.findElement(enterenddate).sendKeys(date);
	}
	
	public void enterResult(String result) {
		driver.findElement(enterresult).sendKeys(result);
	}
	
	public void enterRecommendation(String result) {
		driver.findElement(enterrecommendation).sendKeys(result);
	}
	
	public void enterNextRecommendation(String result) {
		driver.findElement(enternextrecommendation).sendKeys(result);
	}
	
	public void selectResponse() {
		WebElement response = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select type = new Select(response);
		type.selectByValue("0");
	}
	

}
