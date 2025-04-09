package TestCases.EMR_TestCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.RiskPage;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;

public class TC020_Diagnosis_Test extends BaseTest {
	public DiagnosisPage diagnsisobj;
	public RegistrationPage regobj;

	@Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void diagnosis(HashMap<String, String> testData) throws InterruptedException {
		// extentlogger = extent.createTest("Insurance Test Started");
		// extentlogger.log(Status.PASS, "Insurance of patient is successful");
		// extentlogger.pass("Insurance Test case is Passed.");

		regobj = new RegistrationPage(driver);
		diagnsisobj = new DiagnosisPage(driver);
		riskobj = new RiskPage(driver);
		buildingobj = new BuildingPlans_Page(driver);

		regobj.clickonHamburgerMenu();
		diagnsisobj.clickOnPhysicianMenu();
		diagnsisobj.clickOnPhysicianWorkList();
		
		String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); // Now patientId is a String
	    Thread.sleep(2000);
		diagnsisobj.clickOnOpenRecord();
		riskobj.clickOnMenu();
		Thread.sleep(2000);

		diagnsisobj.clickOnDiagnosis();
		Thread.sleep(2000);
		diagnsisobj.clickOnAddDiagnosis();
		diagnsisobj.searchDiagOnFavorites("Typhoid Fever");
		diagnsisobj.selectDiagnosis();
		diagnsisobj.selectPreliminary();
		diagnsisobj.writeCommentsOnDiagnosis("Patient has active record");
		diagnsisobj.clickOnAddtoSave();
		diagnsisobj.clickOnSaveBtn();

		// Edit the Comments
		Thread.sleep(2000);
		diagnsisobj.clickOnSavedDiagnosis();
		diagnsisobj.clickOnEditBtn();
		diagnsisobj.clearComments();
		diagnsisobj.clickOnSaveBtn();

		// Cancel Diagnosis
		diagnsisobj.clickOnEditBtn();
		diagnsisobj.selectCancelledBtn();
		Thread.sleep(2000);
		diagnsisobj.selectCancelledDropdown();
		diagnsisobj.clickOnSaveBtn();
		Thread.sleep(2000);
		diagnsisobj.selectCancelledBtn();
		Thread.sleep(2000);
		diagnsisobj.selectCancelledDropdown();
		diagnsisobj.clickOnSaveBtn();

	}

}
