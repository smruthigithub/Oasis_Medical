package TestCases.EMR_TestCases;

import Pages.EMR_Pages.Lab_page;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import base.BaseTest;
import utilities.DataProviders;

import java.util.HashMap;

import org.testng.annotations.Test;

public class TC025_Lab_Test extends BaseTest {
    public Lab_page labobj;

    @Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
    public void LabTest(HashMap<String, String> testData) throws InterruptedException {
        labobj = new Lab_page(driver);
        buildingobj = new BuildingPlans_Page(driver);

        labobj.clickOnHamburgerMenu();
        Thread.sleep(6000);

        labobj.ClickOnPhysicianMenu();
        Thread.sleep(5000);

        labobj.ClickOnPhysicianWorkList();
        Thread.sleep(2000);

        String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); // Now patientId is a String
	    Thread.sleep(3000);	

        labobj.ClickOnOpenRecord();
        Thread.sleep(2000);

        labobj.ClicKOnpatientMenu();
        Thread.sleep(2000);

        labobj.ClickOnOrderManagement();
        Thread.sleep(2000);

        labobj.ClickLab();
        Thread.sleep(2000);

        labobj.SearchLab();
        Thread.sleep(2000);

        labobj.GiveLab("Check Up For Iqama/Men");
        Thread.sleep(2000);

        labobj.ClickOnSearch();
        Thread.sleep(2000);

        labobj.ClickOnOk();
        Thread.sleep(2000);

        labobj.ClickOnReason("Medication");
        Thread.sleep(2000);

        labobj.ClickOnDia("A");
        Thread.sleep(2000);

        labobj.ClickOnAdd();
        Thread.sleep(2000);

        labobj.ClickSave();
        Thread.sleep(2000);

    }
}