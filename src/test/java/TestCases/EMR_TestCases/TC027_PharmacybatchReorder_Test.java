package TestCases.EMR_TestCases;

import base.BaseTest;
import org.testng.annotations.Test;

import Pages.EMR_Pages.PharmacyBatchReorder_page;

public class TC027_PharmacybatchReorder_Test extends BaseTest {
    public PharmacyBatchReorder_page pharmreorderobj;

    @Test
    public void PharmacybatchReorder_Test() throws InterruptedException {
    	
        pharmreorderobj = new PharmacyBatchReorder_page(driver);

        pharmreorderobj.clickOnHamburgerMenu();
        Thread.sleep(6000);

        pharmreorderobj.ClickOnPhysicianMenu();
        Thread.sleep(5000);

        pharmreorderobj.ClickOnPhysicianWorkList();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnSearch("3692");
        Thread.sleep(2000);

        pharmreorderobj.ClickOnPatientId();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnOpenRecord();
        Thread.sleep(2000);

        pharmreorderobj.ClicKOnpatientMenu();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnOrderManagement();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnPharmacyBatchReorder();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnOrder();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnRoute("I");
        Thread.sleep(2000);

        pharmreorderobj.ClickOnDiagnosis("A");
        Thread.sleep(2000);

        pharmreorderobj.ClickOnAdd();
        Thread.sleep(2000);

        pharmreorderobj.ClickOnSave();
        Thread.sleep(2000);

    }
}