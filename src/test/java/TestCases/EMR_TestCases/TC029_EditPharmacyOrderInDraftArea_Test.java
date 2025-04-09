package TestCases.EMR_TestCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.EMR_Pages.EditPharmacyOrderDraftArea_page;
import Pages.EMR_Pages.Lab_page;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import base.BaseTest;
import utilities.DataProviders;

public class TC029_EditPharmacyOrderInDraftArea_Test extends BaseTest {
    public EditPharmacyOrderDraftArea_page editpharmacyobj;
    public Lab_page labobj;

    @Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
    public void EditPharmacyOrderInDraftArea_Test(HashMap<String, String> testData) throws InterruptedException {
    	
        editpharmacyobj = new EditPharmacyOrderDraftArea_page(driver);
        buildingobj = new BuildingPlans_Page(driver);
        labobj = new Lab_page(driver);

        editpharmacyobj.clickOnHamburgerMenu();
        Thread.sleep(6000);

        editpharmacyobj.ClickOnPhysicianMenu();
        Thread.sleep(5000);

        editpharmacyobj.ClickOnPhysicianWorkList();
        Thread.sleep(2000);

        String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId);
	    Thread.sleep(3000);	

        editpharmacyobj.ClickOnOpenRecord();
        Thread.sleep(2000);

        editpharmacyobj.ClicKOnpatientMenu();
        Thread.sleep(2000);

        editpharmacyobj.ClickOnOrderManagement();
        Thread.sleep(2000);

        editpharmacyobj.ClickOnMedication();
        Thread.sleep(2000);

        editpharmacyobj.ClicksSearchIcon();
        Thread.sleep(3000);

        editpharmacyobj.enterItem();
        Thread.sleep(2000);
        
        editpharmacyobj.clickOkay();
        Thread.sleep(3000);
        
        editpharmacyobj.enterRepeat();
        Thread.sleep(2000);
        
        editpharmacyobj.clickAddToDrafts();
        Thread.sleep(2000);
        
        labobj.ClickSave();
        
    }
}