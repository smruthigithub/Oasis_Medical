package TestCases.EMR_TestCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.EMR_Pages.AllergiesPage;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.RiskPage;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;

public class TC021_Allergies_Test extends BaseTest{
//	public AllergiesPage allergyobj;
//	public RegistrationPage regobj;
//	public DiagnosisPage diagnsisobj;
	
	@Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void allergies(HashMap<String, String> testData) throws InterruptedException { 
		
		extentlogger = extent.createTest("Allergies Test Started");
		extentlogger.log(Status.PASS, "Allergies Test is successful");
		//extentlogger.pass("Insurance Test case is Passed.");

		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		diagnsisobj = new DiagnosisPage(driver);
		allergyobj = new AllergiesPage(driver);
		riskobj = new RiskPage(driver);
		buildingobj = new BuildingPlans_Page(driver);
		
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
	    Thread.sleep(3000);	
		diagnsisobj.clickOnOpenRecord();
		Thread.sleep(2000);
		riskobj.clickOnMenu(); 
		Thread.sleep(2000);
		
		//Drug Allergy
		allergyobj.clickOnAllergies();
		Thread.sleep(2000);
		allergyobj.clickOnRecordAllergies();
		Thread.sleep(4000);
		allergyobj.selectDrugAllergy();
		Thread.sleep(3000);
		allergyobj.selectHighSeverity();
		Thread.sleep(2000);
		allergyobj.searchSubstanceIcon();
		Thread.sleep(2000);
		allergyobj.selectDrugSubstance();
		allergyobj.clickOnOkSubstance();
		allergyobj.selectReaction();
		diagnsisobj.clickOnSaveBtn();
		
		//Food Allergy
		Thread.sleep(2000);
		allergyobj.clickOkay();
		allergyobj.clickOnRecordAllergies();
		allergyobj.selectFoodAllergy();
		Thread.sleep(3000);
		allergyobj.selectMildSeverity();
		Thread.sleep(3000);
		allergyobj.selectFoodSubstance();
		allergyobj.selectDiarrhea();
		diagnsisobj.clickOnSaveBtn();
		
		//Other Allergies
		Thread.sleep(2000);
		allergyobj.clickOkay();
		allergyobj.clickOnRecordAllergies();
		allergyobj.selectOtherAllergy();
		Thread.sleep(2000);
		allergyobj.selectMildSeverity();
		Thread.sleep(2000);
		allergyobj.selectOtherSubstance();
		Thread.sleep(2000);
		allergyobj.selectReaction();
		diagnsisobj.clickOnSaveBtn();
		
		//Remove record
		allergyobj.clickOnRemoveBtn();

	}

}
