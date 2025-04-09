package TestCases.EMR_TestCases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.EMR_Pages.AllergiesPage;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.RiskPage;
import Pages.EMR_Pages.TeamCollaboration_Page;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;

public class TC033_TeamCollaboration_Test extends BaseTest {
	public TeamCollaboration_Page teamcollabobj;
	
	@Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void teamCollaboration(HashMap<String, String> testData) throws InterruptedException {
		
		extentlogger = extent.createTest("Team Collaboration Test Started");
		extentlogger.log(Status.PASS, "Team collaboration is successful is successful");
		//extentlogger.pass("Insurance Test case is Passed.");
		
		regobj = new RegistrationPage(driver);
		riskobj = new RiskPage(driver);
		diagnsisobj = new DiagnosisPage(driver);
		buildingobj = new BuildingPlans_Page(driver);
		allergyobj = new AllergiesPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		regobj.clickonHamburgerMenu();
		Thread.sleep(2000);
		
		diagnsisobj.clickOnPhysicianMenu();
		Thread.sleep(2000);
		
		diagnsisobj.clickOnPhysicianWorkList();
		Thread.sleep(2000);

		//Creating Team Collaboration 
		
		String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); // Now patientId is a String
	    Thread.sleep(2000);
		
		diagnsisobj.clickOnOpenRecord();
		Thread.sleep(2000);
		
		riskobj.clickOnMenu(); 
		Thread.sleep(2000);

		teamcollabobj.clickTeamCollaboration();
		Thread.sleep(2000);
		
		teamcollabobj.clickAddTask();
		Thread.sleep(2000);
		
		teamcollabobj.enterTextArea();
		
		regobj.clickSaveChanges();
		
		allergyobj.clickOkay();				
		
		//Team Collaboration Update

		teamcollabobj.clickPatient();
		
		diagnsisobj.clickOnEditBtn();
			
		teamcollabobj.clearText();
		
		teamcollabobj.editTextArea();
		
		regobj.clickSaveChanges();
		
		allergyobj.clickOkay();			
		
		//TeamCollaboration Cancel
		
		teamcollabobj.clickPatient();
		
		diagnsisobj.clickOnEditBtn();
		
		teamcollabobj.clickCancelled();
		
		regobj.clickSaveChanges();		
		Thread.sleep(2000);
		
		allergyobj.clickOkay();

	}
}
