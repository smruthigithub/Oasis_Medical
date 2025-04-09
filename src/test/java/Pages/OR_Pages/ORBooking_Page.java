package Pages.OR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ORBooking_Page {
	WebDriver driver;
	
	public ORBooking_Page (WebDriver driver) {
		this.driver =driver;
	}
	
	
	By searchBox = By.xpath("//input[@id='search|input']");	
	By selectoroom = By.xpath("//span[text()='Operating Rooms Booking']");
	By selectpatient1 = By.xpath("(//span[text()='Select'])[1]");
	By pendingrequests = By.xpath("//span[text()='Pending Requests']");
	By selectpatient = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:or1:oc1:t1:0:obt1:b1']");
	By entermrn = By.xpath("//input[@name='pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:or1:oc4:ff2:fi4:pdr_mrn_flr']");
	By selectslot = By.xpath("//div[text()='01:30']");  //Change the id before running next day
	By clickbookappt = By.xpath("//span[text()='Book Appt']");
	By rescheduleappt = By.xpath("//oj-option[@value='RESCHEDULED']");
	By rescheduleslot = By.xpath("//div[text()='03:00']");  //Change the id before running next day
	By reschedulebyPatient = By.xpath("//label[text()='Rescheduled By Patient']");
	By cancelappt = By.xpath("//a[contains(text(),'Cancel')]");
	//By cancelbyPatient = By.xpath("//label[text()='Cancelled By Patient']");
	By cancelbyPatient = By.id("pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:ff1:fi1:orc1:codesSelect:_1");
	By requestedbyBtn = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:ff1:fi3:olov1:oasis_list_of_values_search_btn']");
	By selectstaff = By.xpath("//span[text()='MAGDY FATHEY SAYED AHMED']");
	By clickokcancel = By.xpath("//span[text()='Ok']");
	By clickyescancel = By.xpath("(//span[text()='Yes'])[2]");
	By username = By.xpath("(//input[@class='x25'])[4]");
	By password = By.xpath("(//input[@class='x25'])[5]");
	
	//span[text()='Ok']
	
	public void zoomOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.documentElement.style.zoom = '0.75'");
		
		}	
	
	public void zoomIn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.documentElement.style.zoom = '1.00'");
		
		}
	
	public void enterSearchField(String booking) {
		driver.findElement(searchBox).sendKeys(booking);
	}
	
	public void clickORBooking() {
		WebElement orbooking = driver.findElement(By.xpath("//span[text()='Operating Rooms Booking']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(orbooking).click().build().perform();		
	}
	
	public void selectOpeRoom() {
		WebElement selectoroom = driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:r1:0:r1:0:or1:oc1:ff2:fi1:soc1::content"));
		Select select = new Select(selectoroom);
		select.selectByVisibleText("OPERATING ROOM 1");					
	}
	
	public void pendingRequets() {
		driver.findElement(pendingrequests).click();
	}
	
	public void enterMRN(String mrn) throws InterruptedException {
		  WebElement mrnField = driver.findElement(By.xpath("//input[@name='pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:or1:oc4:ff2:fi4:pdr_mrn_flr']"));

		  // Check if element is visible before interacting
		  if (mrnField.isDisplayed()) {
		    mrnField.sendKeys(mrn);
		    mrnField.sendKeys(Keys.ENTER);
		  } else {
		    // Handle the case where the element is not visible (optional)
		    System.out.println("MRN field not visible. Add your handling logic here.");
		  }
		}
	
	public void selectPatient() {
		driver.findElement(selectpatient).click();
	}
	
	public void selectSlot() {
		driver.findElement(selectslot).click();		
	}
	
	public void bookAppointment() {
		driver.findElement(clickbookappt).click();		
	}
	
	public void reScheduleAppt() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement selectslot1 = driver.findElement(By.xpath("//div[text()='01:30']"));
		actions.contextClick(selectslot1).build().perform();
		Thread.sleep(3000);
		driver.findElement(rescheduleappt).click();
	}
	
	public void rescheduledSlot() {
		driver.findElement(rescheduleslot).click();		
	}
	
	public void rescheduleByPatient() {
		driver.findElement(reschedulebyPatient).click();		
	}

	
	public void rescheduledReason() {
		WebElement reason = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:sltDlt:2:r3:0:oc1:ff1:fi2:osc1:codesSelect::content']"));
		Select select = new Select(reason);
		select.selectByVisibleText("Unavailability Of Resources (Blood,Staff,..)");
	}
	
	//Canceling Appointment
	
	public void cancelAppt() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement selectslot1 = driver.findElement(By.xpath("//div[text()='03:00']"));
		actions.contextClick(selectslot1).build().perform();
		Thread.sleep(3000);
		driver.findElement(cancelappt).click();
	}
	
	public void cancelledByPatient() {
		driver.findElement(cancelbyPatient).click();		
	}
	
	public void cancelReason() {
		WebElement reason = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:r1:0:crslt_r:0:r1:0:ff1:fi2:osc1:codesSelect::content']"));
		Select select = new Select(reason);
		select.selectByVisibleText("Unavailability Of Resources (Blood,Staff,..)");
	}
	
	public void requestedBySearchBtn() {
		driver.findElement(requestedbyBtn).click();	
	}
	
	public void selectStaff() {
		driver.findElement(selectstaff).click();	
	}
	
	public void clickOkCancel() {
		driver.findElement(clickokcancel).click();	
	}
	
	public void clickYesCancel() {
		driver.findElement(clickyescancel).click();	
	}
	
	public void enterUserName(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	


	


	
}
