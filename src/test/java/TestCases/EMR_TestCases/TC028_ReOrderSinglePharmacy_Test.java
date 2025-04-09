package TestCases.EMR_TestCases;

import base.BaseTest;
import org.testng.annotations.Test;

import Pages.EMR_Pages.ReOrderSinglePharmacy_page;

public class TC028_ReOrderSinglePharmacy_Test extends BaseTest {
    public ReOrderSinglePharmacy_page reordersingleobj;

    @Test
    public void ReOrderSinglePharmacy() throws InterruptedException {
        reordersingleobj = new ReOrderSinglePharmacy_page(driver);

        reordersingleobj.clickOnHamburgerMenu();
        Thread.sleep(6000);

        reordersingleobj.ClickOnPhysicianMenu();
        Thread.sleep(5000);

        reordersingleobj.ClickOnPhysicianWorkList();
        Thread.sleep(2000);

        reordersingleobj.ClickOnSearch("3692");
        Thread.sleep(2000);

        reordersingleobj.ClickOnPatientId();
        Thread.sleep(2000);

        reordersingleobj.ClickOnOpenRecord();
        Thread.sleep(2000);

        reordersingleobj.ClicKOnpatientMenu();
        Thread.sleep(2000);

        reordersingleobj.ClickOnOrderManagement();
        Thread.sleep(2000);

        reordersingleobj.ClickOnReorder();
        Thread.sleep(2000);

        reordersingleobj.ClickonDia("A");
        Thread.sleep(2000);

        reordersingleobj.ClickOnAdd();
        Thread.sleep(2000);

//        reordersingleobj.ClickOnSave();
//        Thread.sleep(2000);

        reordersingleobj.Overlap();
        Thread.sleep(2000);

        reordersingleobj.ClickOnReason("c");
        Thread.sleep(2000);

        reordersingleobj.ClickOnNote("Note");
        Thread.sleep(2000);

        reordersingleobj.ClickOk();
        Thread.sleep(2000);

        reordersingleobj.ClickSave();
        Thread.sleep(2000);
    }
}