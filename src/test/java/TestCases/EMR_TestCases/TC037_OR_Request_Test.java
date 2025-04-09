package TestCases.EMR_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.OR_RequestPage;
import Pages.EMR_Pages.RiskPage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;

public class TC037_OR_Request_Test extends BaseTest {
	
	@Test
	public void OrRequest() throws InterruptedException {
		
		regobj = new RegistrationPage(driver);
		diagnsisobj = new DiagnosisPage(driver);
		riskobj = new RiskPage(driver);
		orrequestobj = new OR_RequestPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		regobj.clickonHamburgerMenu();
		diagnsisobj.clickOnPhysicianMenu();
		diagnsisobj.clickOnPhysicianWorkList();
		Thread.sleep(3000);
		
		riskobj.clickOnOpenRecord();
		Thread.sleep(2000);
		boolean popupMessageFound = false; // Flag to track if the popup was found
		
		try {
		
        WebElement popupMessage = driver.findElement(By.xpath("//h1[contains(text(),'OS-1150358 : This medical Record is closed, are you sure you want to proceed ?')]")); // Adjust XPath as needed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement confirmationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'OS-1150358 : This medical Record is closed')]")));
        
        if (popupMessage.isDisplayed()) {
            popupMessageFound = true; // Set the flag to true
            Thread.sleep(5000);
            clinicobj.clickonCancel();
            clinicobj.ClickOnOpenRecord2();
            clinicobj.ClicKOnpatientMenu();
        }
        
		} catch (org.openqa.selenium.NoSuchElementException e) {
	
	    }
		Thread.sleep(3000);
		riskobj.clickOnMenu();                           
		orrequestobj.clickORRequest();
		Thread.sleep(2000);
		orrequestobj.addNewRequest();
		orrequestobj.clickERRadioBtn();
		orrequestobj.clickProcedureIcon();
		orrequestobj.selectFirstOpt();
		orrequestobj.clickOkay();	       
		Thread.sleep(2000);
		orrequestobj.selectOperationType();
		Thread.sleep(2000);
		orrequestobj.clickSave();
		orrequestobj.clickOnStatus();
		
		
		//Edit OR-Request
		diagnsisobj.clickOnEditBtn();
		Thread.sleep(3000);
		orrequestobj.editDuration("50");
		orrequestobj.clickSave();
		
		// Canceling the Request
		Thread.sleep(2000);
		orrequestobj.clickOnStatus();
		orrequestobj.cancelRequest();
		orrequestobj.clickYesforCancel();	

	}

}
