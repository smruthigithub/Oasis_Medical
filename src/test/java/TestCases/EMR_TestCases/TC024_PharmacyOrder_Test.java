package TestCases.EMR_TestCases;

import base.BaseTest;
import org.testng.annotations.Test;

import Pages.EMR_Pages.Pharmacyorder_page;

public class TC024_PharmacyOrder_Test extends BaseTest {
    public Pharmacyorder_page pharmorderobj;

    @Test
    public void PharmacyOrder_Test() throws InterruptedException {
        pharmorderobj = new Pharmacyorder_page(driver);

		pharmorderobj.clickOnHamburgerMenu();
		Thread.sleep(6000);

		pharmorderobj.ClickOnPhysicianMenu();
		Thread.sleep(5000);

		pharmorderobj.ClickOnPhysicianWorkList();
		Thread.sleep(2000);

		pharmorderobj.ClickOnSearch("443");
		Thread.sleep(2000);

		pharmorderobj.ClickOnOpenRecord();
		Thread.sleep(2000);

		pharmorderobj.ClicKOnpatientMenu();
		Thread.sleep(2000);

		pharmorderobj.ClickOnOrderManagement();
		Thread.sleep(2000);

		pharmorderobj.ClickOnMedication();
		Thread.sleep(2000);

		pharmorderobj.SearchMedication();
		Thread.sleep(2000);

		pharmorderobj.GiveMedication("KLAVOX 1GM TAB 14 TAB");
		Thread.sleep(2000);

		pharmorderobj.ClickOnSearch();
		Thread.sleep(2000);

		pharmorderobj.ClickOnOk();
		Thread.sleep(2000);

		pharmorderobj.GiveQuantity("2");
		Thread.sleep(2000);

		pharmorderobj.GiveUnit("U");
		Thread.sleep(2000);

		pharmorderobj.Searchfrequency();
		Thread.sleep(2000);

		pharmorderobj.GiveFrequency("TWO TIMES DAILY");
		Thread.sleep(2000);

		pharmorderobj.Search2();
		Thread.sleep(2000);

		pharmorderobj.Ok1();
		Thread.sleep(20000);

		pharmorderobj.GiveRepeat("1");
		Thread.sleep(2000);

		pharmorderobj.GiveDiagnosis("A");
		Thread.sleep(2000);

//        pharmorderobj.GiveFrom("A");
//        Thread.sleep(2000);
//
//        pharmorderobj.GiveRoute("O");
//        Thread.sleep(2000);

		pharmorderobj.ClickOnAddToDrafts();
		Thread.sleep(2000);

		pharmorderobj.ClickOnSave();
		Thread.sleep(2000);

		pharmorderobj.clickonMenu();
		Thread.sleep(2000);

		pharmorderobj.ClickOnCancel();
		Thread.sleep(2000);

		pharmorderobj.ClickOnYes();
		Thread.sleep(2000);

		pharmorderobj.CancelReason("Reason");
		Thread.sleep(2000);

		pharmorderobj.ClickSave();
		Thread.sleep(2000);
    }
}