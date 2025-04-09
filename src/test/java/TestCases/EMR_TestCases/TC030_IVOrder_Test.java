package TestCases.EMR_TestCases;

import base.BaseTest;
import utilities.DataProviders;

import java.util.HashMap;

import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.Ed25519;
import org.testng.annotations.Test;

import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.EditPharmacyOrderDraftArea_page;
import Pages.EMR_Pages.IVOrder_page;
import Pages.EMR_Pages.Lab_page;
import Pages.EMR_Pages.RiskPage;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;

public class TC030_IVOrder_Test extends BaseTest {
    public IVOrder_page ivorderobj;
    public Lab_page labobj;
    public EditPharmacyOrderDraftArea_page editpharmacyobj;

    @Test(dataProvider = "PatientData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
    public void IVOrder_Test(HashMap<String, String> testData) throws InterruptedException {
        ivorderobj = new IVOrder_page(driver);
        buildingobj = new BuildingPlans_Page(driver);
        labobj = new Lab_page(driver);
        riskobj = new RiskPage(driver);
        diagnsisobj = new DiagnosisPage(driver);
        editpharmacyobj = new EditPharmacyOrderDraftArea_page(driver);

        ivorderobj.clickOnHamburgerMenu();
        Thread.sleep(6000);

        ivorderobj.ClickOnPhysicianMenu();
        Thread.sleep(5000);

        ivorderobj.ClickOnPhysicianWorkList();
        Thread.sleep(2000);

        String patientId = testData.get("Patient ID"); // Get from HashMap, consistent key
		System.out.println("Patient ID retrieved: " + patientId); // Print the ID

	    if (patientId == null || patientId.isEmpty()) {
	        extentlogger.fail("Patient ID is missing or empty in Excel data. Check row.");
	        return;
	    }

	    buildingobj.enterPatientid(patientId); 
	    Thread.sleep(6000);	
		diagnsisobj.clickOnOpenRecord();
		Thread.sleep(3000);
		riskobj.clickOnMenu(); 
		Thread.sleep(2000);

        ivorderobj.ClickOnOrderManagement();
        Thread.sleep(2000);

        ivorderobj.ClkSearch();
        Thread.sleep(2000);

        ivorderobj.GiveOrderName("Amoclan 1.2 Gm Vial 1 Vial");
        Thread.sleep(3000);

//        ivorderobj.ClickSearch();
//        Thread.sleep(3000);

        ivorderobj.ClickIv();
        Thread.sleep(2000);

        ivorderobj.ClickOk();
        Thread.sleep(2000);

        ivorderobj.ClickDiluent();
        Thread.sleep(2000);
        
        ivorderobj.selectElectrolyte();
        Thread.sleep(2000);
        
        ivorderobj.clickFrequIcon();
        Thread.sleep(2000);
        
        buildingobj.clickOkay();
        Thread.sleep(2000);
        ivorderobj.enterRepeat();
        Thread.sleep(2000);
        editpharmacyobj.clickAddToDrafts();
        Thread.sleep(2000);
        
        labobj.ClickSave();

    }
}