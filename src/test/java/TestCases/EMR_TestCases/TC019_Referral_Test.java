package TestCases.EMR_TestCases;

import base.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.EMR_Pages.ClinicalNote_Page;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.Referrals_Page;
import Pages.PMI_Pages.RegistrationPage;

public class TC019_Referral_Test extends BaseTest {
    Referrals_Page referralobj;

    @Test
    public void Referral_Test() throws InterruptedException {
    	
        referralobj = new Referrals_Page(driver);
        clinicobj =new ClinicalNote_Page(driver);
        regobj = new RegistrationPage(driver);
        diagnsisobj = new DiagnosisPage(driver);

        referralobj.clickOnHamburgerMenu();

        referralobj.ClickOnPhysicianMenu();

        referralobj.ClickOnPhysicianWorkList();
        
        diagnsisobj.clickOnOpenRecord();

        WebElement popupMessage = driver.findElement(By.xpath("//h1[contains(text(),'OS-1150358 : This medical Record is closed, are you sure you want to proceed ?')]")); // Adjust XPath as needed

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement confirmationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'OS-1150358 : This medical Record is closed')]")));
        if (popupMessage.isDisplayed()) {
        	Thread.sleep(3000);
            clinicobj.clickonCancel(); // Assuming clinicobj is initialized
            clinicobj.ClickOnOpenRecord2(); // Assuming clinicobj is initialized
            clinicobj.ClicKOnpatientMenu(); 
        }else {
        clinicobj.ClicKOnpatientMenu();
        }

        referralobj.referral();
        Thread.sleep(1000);

        referralobj.ad();
        Thread.sleep(1000);

        referralobj.referralConsult();
        Thread.sleep(1000);

        referralobj.toSpeciality("c");
        Thread.sleep(1000);

        referralobj.team("c");
        referralobj.team("c");
        Thread.sleep(1000);

        referralobj.SearchPhy();
        Thread.sleep(1000);

        referralobj.GivPhy("Adel Barsoum Asaad Binyamin");
        Thread.sleep(1000);

        referralobj.Srch();
        Thread.sleep(1000);

        referralobj.Ok();
        Thread.sleep(1000);

        referralobj.refrralnote("Note for nurse");
        Thread.sleep(1000);

        referralobj.sav();
        Thread.sleep(1000);

        referralobj.close();
        Thread.sleep(1000);

        referralobj.ad2();
        Thread.sleep(1000);

        referralobj.Sec2();
        Thread.sleep(1000);

        referralobj.toSpeciality2("c");
        Thread.sleep(1000);

        referralobj.team2("c");
        referralobj.team2("c");
        Thread.sleep(1000);

        referralobj.SearchPhy2();
        Thread.sleep(1000);

        referralobj.GivPhy2("Adel Barsoum Asaad Binyamin");
        Thread.sleep(1000);

        referralobj.Srch2();
        Thread.sleep(1000);

        referralobj.Ok2();
        Thread.sleep(1000);

        referralobj.refrralnote2("Note for doctor");
        Thread.sleep(1000);

        referralobj.sav2();
        Thread.sleep(1000);

        referralobj.close2();
        Thread.sleep(1000);

        referralobj.ad3();
        Thread.sleep(1000);

        referralobj.Sec3();
        Thread.sleep(1000);

        referralobj.toSpeciality3("c");
        Thread.sleep(1000);

        referralobj.team3("c");
        referralobj.team3("c");
        Thread.sleep(1000);

        referralobj.SearchPhy3();
        Thread.sleep(1000);

        referralobj.GivPhy3("Adel Barsoum Asaad Binyamin");
        Thread.sleep(1000);

        referralobj.Srch3();
        Thread.sleep(1000);

        referralobj.Ok3();
        Thread.sleep(1000);

        referralobj.refrralnote3("Note");
        Thread.sleep(1000);

        referralobj.sav3();
        Thread.sleep(1000);

    }
}