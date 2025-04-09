package TestCases.EMR_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.EMR_Pages.AllergiesPage;
import Pages.EMR_Pages.ClinicalNote_Page;
import Pages.EMR_Pages.CloseVisit_Page;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.RecordDataSet;
import Pages.EMR_Pages.RiskPage;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import freemarker.template.DefaultIterableAdapter;

public class TC039_Close_OutPatient_Visit extends BaseTest{

@Test
public void CloseOutPatientVisit() throws InterruptedException {
		
		regobj = new RegistrationPage(driver);
		diagnsisobj = new DiagnosisPage(driver);
		riskobj = new RiskPage(driver);
		closevisitobj = new CloseVisit_Page(driver);
		recordobj = new RecordDataSet(driver);
		clinicobj = new ClinicalNote_Page(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		regobj.clickonHamburgerMenu();
		Thread.sleep(2000);
		diagnsisobj.clickOnPhysicianMenu();
		Thread.sleep(2000);
		diagnsisobj.clickOnPhysicianWorkList();
		Thread.sleep(2000);
	
		closevisitobj.selectOutPatient();
		
		diagnsisobj.clickOnOpenRecord();
		
        boolean popupMessageFound = false; // Flag to track if the popup was found
		
		try {
		
        WebElement popupMessage = driver.findElement(By.xpath("//h1[contains(text(),'OS-1150358 : This medical Record is closed, are you sure you want to proceed ?')]")); // Adjust XPath as needed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement confirmationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'OS-1150358 : This medical Record is closed')]")));
        
        if (popupMessage.isDisplayed()) {
            popupMessageFound = true; // Set the flag to true
            Thread.sleep(2000);
            clinicobj.clickonCancel();
            clinicobj.ClickOnOpenRecord2();
            clinicobj.ClicKOnpatientMenu();
        }
        
		} catch (org.openqa.selenium.NoSuchElementException e) {
	
	    }
		
		 if (!popupMessageFound) {
		        Thread.sleep(3000);
		        clinicobj.ClicKOnpatientMenu();
		    }

		    Thread.sleep(2000);
		    closevisitobj.closeVisit();
		    Thread.sleep(2000);
		
		try {
		
        WebElement error = driver.findElement(By.xpath("//div[text()='OS-11573 : Patient diagnosis must be recorded before starting an order.']"));
		
		if(error.isDisplayed()) {
			recordobj.clickOkay();
			Thread.sleep(3000);
			riskobj.clickOnMenu();
			Thread.sleep(2000);
			recordobj.recordDataSet();
			Thread.sleep(2000);
			recordobj.uncheckAllergy();
			Thread.sleep(2000);
			recordobj.uncheckRisks();
			Thread.sleep(2000);
			recordobj.uncheckOrders();
			Thread.sleep(2000);
			//recordobj.uncheckAllergy();
			Thread.sleep(2000);
			recordobj.cardioExam();
			Thread.sleep(2000);
			recordobj.freeText();
			Thread.sleep(2000);
			recordobj.startConsultation();
			Thread.sleep(5000);		
			recordobj.switchToFrame1();
			Thread.sleep(2000);
			recordobj.enterComplaint();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			recordobj.clickNext();
			Thread.sleep(3000);
			recordobj.switchToFrame2();
			recordobj.cardiacAssess();
			Thread.sleep(3000);
			recordobj.selectPalpilations();
			driver.switchTo().defaultContent();
			recordobj.clickNext();
			diagnsisobj.searchDiagOnFavorites("Typhoid Fever");
			diagnsisobj.selectDiagnosis();
			diagnsisobj.clickOnAddDiagnosis();
			Thread.sleep(4000);
			recordobj.clickNextLastPage();
			Thread.sleep(3000);
			recordobj.clickSign();
			Thread.sleep(4000);
			clinicobj.ClicKOnpatientMenu();
			Thread.sleep(2000);
			closevisitobj.closeVisit();
			Thread.sleep(2000);
			
		}
						
		}	catch (org.openqa.selenium.NoSuchElementException e) {
		    // Error message not found, proceed without handling it
		    System.out.println("Error message not found. Proceeding with the rest of the test.");
		}
		
		closevisitobj.saveAndExit();
		
    }	
}


