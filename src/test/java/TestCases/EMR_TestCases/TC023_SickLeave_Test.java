package TestCases.EMR_TestCases;
import Pages.EMR_Pages.SickLeave_Page;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import base.BaseTest;
import utilities.DataProviders;

import java.util.HashMap;

import org.testng.annotations.Test;

public class TC023_SickLeave_Test extends BaseTest {
    SickLeave_Page sickobj;

    @Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
    public void sickLeave_Test(HashMap<String, String> testData) throws InterruptedException {
    	
    	sickobj = new SickLeave_Page(driver);
    	buildingobj = new BuildingPlans_Page(driver);

    	sickobj.clickOnHamburgerMenu();
        Thread.sleep(1000);

        sickobj.ClickOnPhysicianMenu();
        Thread.sleep(1000);

        sickobj.ClickOnPhysicianWorkList();
        Thread.sleep(1000);

        String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); // Now patientId is a String
	    Thread.sleep(2000);

        sickobj.ClickOnOpenRecord();
        Thread.sleep(1000);

        sickobj.ClicKOnpatientMenu();
        Thread.sleep(1000);

        sickobj.sickleave();
        Thread.sleep(1000);

        sickobj.adsickLeave();
        Thread.sleep(1000);

        sickobj.selLeave("l");
        Thread.sleep(1000);

        sickobj.enterStartDate();
        Thread.sleep(1000);

        sickobj.enterEndDate();
        sickobj.enterEndDate();
        Thread.sleep(1000);

        sickobj.add1();
        Thread.sleep(1000);

        sickobj.userName(p.getProperty("username"));
        Thread.sleep(1000);

        sickobj.password(p.getProperty("password"));
        Thread.sleep(1000);

        sickobj.Sign();
        Thread.sleep(1000);
    }
}

