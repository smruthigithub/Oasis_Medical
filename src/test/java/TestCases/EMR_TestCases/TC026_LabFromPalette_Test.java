package TestCases.EMR_TestCases;

import base.BaseTest;
import utilities.DataProviders;

import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.EMR_Pages.LabFromPalette_page;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;

public class TC026_LabFromPalette_Test extends BaseTest {
    public LabFromPalette_page labpaletobj;

    @Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
    public void LabFromPalette_Test(HashMap<String, String> testData) throws InterruptedException {
    	
        labpaletobj = new LabFromPalette_page(driver);
        buildingobj = new BuildingPlans_Page(driver);

        labpaletobj.clickOnHamburgerMenu();
        Thread.sleep(6000);

        labpaletobj.ClickOnPhysicianMenu();
        Thread.sleep(5000);

        labpaletobj.ClickOnPhysicianWorkList();
        Thread.sleep(2000);

        String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); // Now patientId is a String
	    Thread.sleep(3000);	

        labpaletobj.ClickOnOpenRecord();
        Thread.sleep(2000);

        labpaletobj.ClicKOnpatientMenu();
        Thread.sleep(2000);

        labpaletobj.ClickOnOrderManagement();
        Thread.sleep(2000);

        labpaletobj.ClickOnLabPalette();
        Thread.sleep(2000);

        labpaletobj.ClickOnReason("Medication");
        Thread.sleep(2000);

        labpaletobj.ClickOndDia("A");
        Thread.sleep(2000);

        labpaletobj.ClickOnLab();
        Thread.sleep(2000);

        labpaletobj.ClickOnChemistry();
        Thread.sleep(2000);

        labpaletobj.ClickOnElectrolyte();
        Thread.sleep(2000);

        labpaletobj.ClickOnSave();
        Thread.sleep(2000);
    }
}