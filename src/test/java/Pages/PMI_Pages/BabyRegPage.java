package Pages.PMI_Pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BabyRegPage {
	WebDriver driver;
	
	public BabyRegPage(WebDriver driver) {
		this.driver =driver;
	}
	
	By searchBox = By.xpath("//input[@id='search|input']");	
	By entermotherId = By.id("pt1:contrRg:0:CntRgn:5:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:ff2:mthr_id_fi:it10::content");
	By clickmotherMRN = By.id("pt1:contrRg:0:CntRgn:5:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:ff2:mthr_mrn_fi:it11::content");
	By clickcopydetails = By.xpath("//span[text()='Copy Details']");
	By clickoncancel = By.xpath("(//span[text()='Cancel'])[1]");
	By clickonclearID = By.xpath("(//span[text()='Clear'])[1]");
	By clickback = By.xpath("//span[text()='Back']");
	By clickok = By.xpath("//span[text()='Ok']");
	By clickphysican = By.xpath("//span[text()='Physician Worklist']");
	By babydob = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:5:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:ff1:greg_fi:greg_dob::content']");
	By defaulttaskFlow = By.xpath("//span[contains(text(),'Default task flow')]");
	
	
	public void enterSearchField(String booking) {
		driver.findElement(searchBox).sendKeys(booking);
	}
	
	public void enterMotherID(String motherId) {
		driver.findElement(entermotherId).sendKeys(motherId);
		driver.findElement(entermotherId).sendKeys(Keys.ENTER);
	}
	
	public void titleMiss() throws InterruptedException {
		WebElement titlemiss = driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content"));
		Select title = new Select(titlemiss);
		title.selectByVisibleText("Mrs");
		Thread.sleep(3000);
	}
	
	public void clickMotherMRN() {
		driver.findElement(entermotherId).click();
	}

	public void clickOnCopyDetails() {
		driver.findElement(clickcopydetails).click();
	}
	
	public void clickOnCancelBtn() {
		driver.findElement(clickoncancel).click();
	}
	
	public void clickOnClearID() {
		driver.findElement(clickonclearID).click();
	}
	
	public void clickBackBtn() {
		driver.findElement(clickback).click();
	}
	
	public void clickOkSaveBtn() {
		driver.findElement(clickok).click();
	}
	
	public void titleBaby() {
		WebElement titlebaby = driver.findElement(By.id("pt1:contrRg:0:CntRgn:5:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content"));
		Select title = new Select(titlebaby);
		title.selectByVisibleText("Mr");
	}
	
	public void clickPhysicianWL() {
		driver.findElement(clickphysican).click();
	}	
	
	public void selectBabyDOB() {
		// Get current date
		Date date = new Date();
		// Format the date (optional)
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Adjust format as needed
		String formattedDate = formatter.format(date);

		WebElement babydob = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:5:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:ff1:greg_fi:greg_dob::content']"));
		babydob.sendKeys(formattedDate);
		babydob.sendKeys(Keys.ENTER);

	}
	
	public void clickDefaultTaskFlow() {
		driver.findElement(defaulttaskFlow).click();
	}
	
}
