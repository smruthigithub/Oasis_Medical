package Pages.ADT_Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Discharge_Page {
WebDriver driver;
	
	public Discharge_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By patientdischarge = By.xpath("//span[text()='Patient Discharge']");
	By enterpatientID = By.xpath("//input[@placeholder='Search By Patient Name']");
	By clinicalDischarge = By.xpath("(//span[text()='Clinical Discharge'])[2]");
	By financialdischarge = By.xpath("//span[text()='Finacial Discharge']");
	By physicaldis = By.xpath("//span[text()='Physical Discharge']");
	By reversedischarge = By.xpath("//span[normalize-space()='Reverse Discharge']");
	By reverseclinical = By.xpath("(//span[text()='Reverse'])[3]");
	By reversefinancial = By.xpath("(//span[text()='Reverse'])[2]");
	By reversephysical = By.xpath("(//span[text()='Reverse'])[1]");
	By enterMRno = By.xpath("//input[@id[contains(.,'ptdata:frstr:mrnc:dc_ff1:dc_fi1:mrnit::content')]]");
	
	public void clickPatientDischarge() {
		driver.findElement(patientdischarge).click();
	}
	
	public void enterPatientID(String patid) {
		driver.findElement(enterpatientID).sendKeys(patid);
		driver.findElement(enterpatientID).sendKeys(Keys.ENTER);
	}
	
	public void clickClinicalDischarge() {
		driver.findElement(clinicalDischarge).click();
	}
	
	public void selectOutcome() {
		WebElement outCome = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:pt1_discharge:ff7:fi36:outcome_lov::content']"));
		Select ama = new Select(outCome);
		ama.selectByVisibleText("Normal Discharge");
	}
	
	public void selectDischargeCondition() {
		WebElement dischargeCondition = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:pt1_discharge:ff7:fi37:dis_cond_lov:codesSelect::content']"));
		Select cured = new Select(dischargeCondition);
		cured.selectByVisibleText("Cured");
	}
	
	public void selectDischargeType() {
		WebElement dischargeType = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:pt1_discharge:ff7:fi38:dis_type_lov:codesSelect::content']"));
		Select alive = new Select(dischargeType);
		alive.selectByVisibleText("Test");
	}
	
	public void selectDischargeTo() {
		WebElement dischargeTo = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:pt1_discharge:ff7:fi39:dis_to_lov:codesSelect::content']"));
		Select home = new Select(dischargeTo);
		home.selectByVisibleText("Home");
	}
	
	public void Financialdischarge() {
		driver.findElement(financialdischarge).click();
	}
	
	public void switchFrame() throws Throwable {
		
		String mainWindow = driver.getWindowHandle(); 		
		Set<String> allHandles = driver.getWindowHandles();

		  for (String handle : allHandles) {
		   
		    if (!handle.equals(mainWindow)) {
		    	Thread.sleep(2000);
		    	 driver.switchTo().window(mainWindow);
		    }
		  }
	}
	
	public void switchFrameFinanacial() throws InterruptedException {
		
		// Store the main window handle
		String mainWindowHandle = driver.getWindowHandle();

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Iterate through window handles and switch to the main window
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(mainWindowHandle)) {
		    	Thread.sleep(2000);
		    	 driver.switchTo().window(mainWindowHandle);
		  
//		    if (driver.getTitle().contains("Oasis+")) {
		        break; // Found the main window
		    }
		}
	}	
	
	public void clickPhysicalDischarge() {
		driver.findElement(physicaldis).click();
	}
	
	public void reverseDischarge() {
		driver.findElement(reversedischarge).click();
	}
	
	public void reverseClinicalDischarge() {
		driver.findElement(reverseclinical).click();
	}
	
	public void reverseFinanacialDischarge() {
		driver.findElement(reversefinancial).click();
	}
	
	public void reversePhysicalDischarge() {
		driver.findElement(reversephysical).click();
	}
	
	public void enterMRNo(String mrno) {
		driver.findElement(enterMRno).sendKeys(mrno);
		driver.findElement(enterMRno).sendKeys(Keys.ENTER);
	}

}
