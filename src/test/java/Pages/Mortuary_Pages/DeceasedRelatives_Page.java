package Pages.Mortuary_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeceasedRelatives_Page{
	
	WebDriver driver;

	public  DeceasedRelatives_Page(WebDriver driver) {
		this.driver = driver;
	}


	By deceasedrelatives = By.xpath("//span[text()='Deceased Relatives Notification']");
	By resetbtn = By.xpath("//span[text()='Reset']");
	By allTab = By.xpath("//span[text()='All']");
	By notifiedtab = By.xpath("//span[text()='Notified']");
	By notnotifiedtab = By.xpath("//span[text()='Not Notified']");
	By movetopage3 = By.xpath("//a[@title='Go To Page 3']");
	By clicknotify = By.xpath("(//span[text()='Notify'])[1]");
	By clickgetrelatives = By.xpath("//span[text()='Get Relatives']");
	By patientsearch = By.xpath("//span[text()='Patient Search']");
	By clickonadvanced = By.xpath("//span[text()='Advanced']");
	By clickonPatientDetails = By.xpath("//span[normalize-space()='Patient Details']");
	
	public void clickDeceasedRelatives() {
		driver.findElement(deceasedrelatives).click();		
	}
	
	public void clickResetBtn() {
		driver.findElement(resetbtn).click();		
	}
	
	public void clickAllTab() {
		driver.findElement(allTab).click();		
	}
	
	public void clickNotifiedTab() {
		driver.findElement(notifiedtab).click();		
	}
	
	public void clickNotNotifiedTab() {
		driver.findElement(notnotifiedtab).click();		
	}
	
	public void moveToPage3() {
		driver.findElement(movetopage3).click();		
	}
	
	public void clickNotify() {
		driver.findElement(clicknotify).click();		
	}
	
	public void clickGetRelatives() {
		driver.findElement(clickgetrelatives).click();		
	}
	
	public void clickPatientSearch() {
		driver.findElement(patientsearch).click();		
	}
	
	public void clickOnAdvanced() {
		driver.findElement(clickonadvanced).click();		
	}
	
	public void clickPatientDetails() {
		driver.findElement(clickonPatientDetails).click();		
	}
	
	public void titleDropdown() {
		WebElement titleDropdownWE = driver.findElement(By.xpath("//select[@id='pt2:r1:0:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content']"));
		Select title = new Select(titleDropdownWE);
		title.selectByVisibleText("Mr");
	}
	


}
