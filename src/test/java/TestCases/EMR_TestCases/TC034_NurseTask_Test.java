package TestCases.EMR_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.EMR_Pages.ClinicalNote_Page;
import Pages.EMR_Pages.CloseVisit_Page;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.NurseTask_Page;
import Pages.EMR_Pages.RiskPage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;

public class TC034_NurseTask_Test extends BaseTest {
	
	@Test
	public void nurseTask() throws InterruptedException {
		
		regobj = new RegistrationPage(driver);
		riskobj =  new RiskPage(driver);
		diagnsisobj = new DiagnosisPage(driver);		
		nursetaskobj = new NurseTask_Page(driver);
		closevisitobj = new CloseVisit_Page(driver);
		clinicobj = new ClinicalNote_Page(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		//Creating Nurse Task 
		
		regobj.clickonHamburgerMenu();
		Thread.sleep(2000);
		diagnsisobj.clickOnPhysicianMenu();
		diagnsisobj.clickOnPhysicianWorkList();
		Thread.sleep(2000);
		closevisitobj.selectInPatient();
		//nursetaskobj.selectAttendance();
		nursetaskobj.clickonopenrecord();	
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
			
			 if (!popupMessageFound) {
			        Thread.sleep(3000);
			        riskobj.clickOnMenu();
			    }

			    Thread.sleep(2000);
		
		nursetaskobj.clickNurseTask();
		nursetaskobj.addNurseTask();
		nursetaskobj.searchTask();
		nursetaskobj.selectTask();
		nursetaskobj.enterFrequency();	
		nursetaskobj.enterEvery();
		nursetaskobj.enterRepeat();
		riskobj.clickAdd();
		
		
		//UPDATE
		nursetaskobj.clickStatus();
		diagnsisobj.clickOnEditBtn();
		nursetaskobj.editFrequency();
		nursetaskobj.editRepeat();
		regobj.clickSaveChanges();
		Thread.sleep(2000);
		
		
		//Canceling the task
		nursetaskobj.clickCancel();
		Thread.sleep(2000);
		riskobj.clickOkay();
		
	}		

}
