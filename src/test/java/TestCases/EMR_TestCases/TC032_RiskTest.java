package TestCases.EMR_TestCases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EMR_Pages.AllergiesPage;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.RiskPage;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;

public class TC032_RiskTest extends BaseTest{
	
	@Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void riskTest(HashMap<String, String> testData) throws InterruptedException {
		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		diagnsisobj = new DiagnosisPage(driver);
		allergyobj = new AllergiesPage(driver);
		riskobj = new RiskPage(driver);
		buildingobj = new BuildingPlans_Page(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		regobj.clickonHamburgerMenu();
		Thread.sleep(2000);
		diagnsisobj.clickOnPhysicianMenu();
		Thread.sleep(2000);
		diagnsisobj.clickOnPhysicianWorkList();
		Thread.sleep(2000);
		
		String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); // Now patientId is a String
	    Thread.sleep(2000);
				
		riskobj.clickOnOpenRecord();
		Thread.sleep(2000);
		riskobj.clickOnMenu();
		Thread.sleep(3000);
		riskobj.clickOnRisks();
		riskobj.clickOnRecordRisk();
		riskobj.checkStealing();
		Thread.sleep(2000);
		riskobj.checkViolent();
		Thread.sleep(2000);
		riskobj.clickAdd();
		Thread.sleep(2000);		
			
		WebElement successMsg = driver.findElement(By.xpath("//h1[text()='OS-1000075 : Record Saved Successfully']"));
		String actualText = successMsg.getText();
		Assert.assertEquals(actualText, "OS-1000075 : Record Saved Successfully", "Success message text mismatch!");
		System.out.println("Record saved successfully");
		
		Thread.sleep(3000);
		riskobj.removeViolentRecord();
		Thread.sleep(2000);
		riskobj.clickOkay();
		
		/*
		 * WebElement successMsgVR = driver.findElement(By.
		 * xpath("//h1[text()='OS-1000076 : Record Deleted Successfully']")); String
		 * actualTextVR = successMsg.getText(); Assert.assertEquals(actualText,
		 * "OS-1000076 : Record Deleted Successfully",
		 * "Success message text mismatch!");
		 * System.out.println("Record saved successfully");
		 */
		
	}
	

}
