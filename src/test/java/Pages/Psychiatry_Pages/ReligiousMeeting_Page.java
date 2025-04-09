package Pages.Psychiatry_Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReligiousMeeting_Page {
	WebDriver driver;

	public  ReligiousMeeting_Page(WebDriver driver) {
		this.driver = driver;
	}

	By religiousmeet = By.xpath("//span[text()='Religious Meeting']");
	By clickoperation = By.xpath("//a[@title='Opration']");
	By addmeeting = By.xpath("//a[text()='Add meeting ']");
	By participants = By.xpath("(//input[@class='x25'])[2]");
	By stafficon1 = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
	By stafficon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[2]");
	By prayerstafficon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[3]");
	By clickaddbtn1 = By.xpath("(//div[@data-afr-pdo='ok'])[1]");
	By clickaddbtn2 = By.xpath("(//div[@data-afr-pdo='ok'])[2]");
	By createpayer = By.xpath("//a[text()='Create Prayer ']");
	By clickokay = By.xpath("(//span[text()='Ok'])[2]");
	By selectstaffname = By.xpath("(//span[contains(text(),'SARAH')])[3]");
	By clickfilterokay = By.xpath("(//span[text()='Ok'])[3]");

	
	
	public void clickReligiousMeeting() {
		driver.findElement(religiousmeet).click();		
	}
	
	public void clickOperation() {
		driver.findElement(clickoperation).click();		
	}
	
	public void clickAddMeeting() {
		driver.findElement(addmeeting).click();		
	}
	
	public void visitTypeDropdown() {
		
		try {
		    WebElement visittype = driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:MainCard:or1:oc2:ot1:or2:oc5:ff2:fi4:VisitTypeInput:codesSelect::content"));
		    Select type = new Select(visittype);
		    type.selectByVisibleText("Lecture");
		} catch (NoSuchElementException e) {
		    // Handle the exception, e.g., log an error message
		    System.out.println("Error: Visit type dropdown element not found.");
		}
			
	}
	
	public void enterParticipants(String number) {
		driver.findElement(participants).sendKeys(number);
	}
	
	public void clickStaffIcon() {
		driver.findElement(stafficon).click();		
	}
	
	public void clickStaffIcon1() {
		driver.findElement(stafficon1).click();		
	}
	
	public void clickAddBtn1() {
		driver.findElement(clickaddbtn1).click();		
	}
	
	public void clickAddBtn2() {
		driver.findElement(clickaddbtn2).click();		
	}
	
	public void clickCreatePrayer() {
		driver.findElement(createpayer).click();		
	}
	
	public void selectPrayerCode() {
		WebElement prayercode = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select type = new Select(prayercode);
		type.selectByVisibleText("Asr");	
	}
	
	public void clickPrayerStaff() {
		driver.findElement(prayerstafficon).click();		
	}

	public void clickOkay() {
		driver.findElement(clickokay).click();		
	}
	
	public void selectStaffName() {
		driver.findElement(selectstaffname).click();		
	}
	
	public void clickFilterOkay() {
		driver.findElement(clickfilterokay).click();		
	}
	
}
