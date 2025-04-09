package Pages.Psychiatry_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReligiousActivities_Page {
	
	WebDriver driver;

	public  ReligiousActivities_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By religioussetup = By.xpath("//span[text()='Religious Activities Setup']");
	By addstaff = By.xpath("(//span[text()='Add'])[2]");
	By activitystatus = By.xpath("(//select[@class='x2h'])[3]");
	By activitydate = By.xpath("//td[@class='xo2 p_AFSelected']");
	By dateokay = By.xpath("//button[text()='OK']");
	By activityduration = By.xpath("(//input[@class='x25'])[2]");
	By activitylocation = By.xpath("(//input[@class='x25'])[3]");
	By enternotes = By.xpath("(//textarea[@class='x25'])[1]");
	By entervisitor = By.xpath("(//textarea[@class='x25'])[2]");
	By enterstaff1 = By.xpath("//span[contains(text(),'Shefaa')]");
	By enterstaff2 = By.xpath("//span[contains(text(),'Abeer')]");
	By enterstaffid = By.xpath("//input[@class='x2c']");
	By clickcalender = By.xpath("//a[@title='Select Date and Time']");
	By clickFilter = By.xpath("//span[text()='Filter']");
	
	
	public void clickReligiousSetup() {
		driver.findElement(religioussetup).click();		
	}
	
	public void selectActivityStatus1() {
		WebElement activitystatus = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select status = new Select(activitystatus);
		status.selectByValue("0");	
	}
	
	public void selectActivityStatus2() {
		WebElement activitystatus = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select status = new Select(activitystatus);
		status.selectByValue("1");	
	}
	
	public void clickCalender() {
		driver.findElement(clickcalender).click();	
		
	}
	
	public void selectActivityDate() {
		driver.findElement(activitydate).click();	
		driver.findElement(activitydate).sendKeys(Keys.ENTER);
	}
	
	public void clickDateOkay() {
		driver.findElement(dateokay).click();		
	}
	
	public void selectActivityType1() {
		WebElement activitytype = driver.findElement(By.xpath("(//select[@class='x2h'])[4]"));
		Select status = new Select(activitytype);
		status.selectByValue("0");	
	}
	
	public void selectActivityType2() {
		WebElement activitytype = driver.findElement(By.xpath("(//select[@class='x2h'])[4]"));
		Select status = new Select(activitytype);
		status.selectByValue("1");	
	}
	
	public void enterActivityDuration(String duration) {
		driver.findElement(activityduration).sendKeys(duration);
	}
	
	public void editActivityDuration() {
		driver.findElement(activityduration).clear();
	}
	
	public void enterActivityLocation(String location) {
		driver.findElement(activitylocation).sendKeys(location);
	}
	
	public void enterNotes(String notes) {
		driver.findElement(enternotes).sendKeys(notes);
	}
	
	public void enterVisitor(String visitor) {
		driver.findElement(entervisitor).sendKeys(visitor);
	}
	
	public void enterStaffId(String visitor) {
		driver.findElement(enterstaffid).sendKeys(visitor);
	}
	
	public void clickStaff1() {
		driver.findElement(enterstaff1).click();		
	}
	
	public void clickStaff2() {
		driver.findElement(enterstaff2).click();		
	}
	
	public void clickAddStaff() {
		driver.findElement(addstaff).click();		
	}
	
	public void filterActivityType1() {
		WebElement activitytype = driver.findElement(By.xpath("(//select[@class='x2h'])[1]"));
		Select type = new Select(activitytype);
		type.selectByValue("0");	
	}
	
	public void filterActivityStatus1() {
		WebElement activitytype = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select type = new Select(activitytype);
		type.selectByValue("0");	
	}
	
	public void clickFilter() {
		driver.findElement(clickFilter).click();		
	}
	
	public void filterActivityType2() {
		WebElement activitytype = driver.findElement(By.xpath("(//select[@class='x2h'])[1]"));
		Select type = new Select(activitytype);
		type.selectByValue("1");	
	}
	
	public void filterActivityStatus2() {
		WebElement activitytype = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select type = new Select(activitytype);
		type.selectByValue("1");	
	}

}
