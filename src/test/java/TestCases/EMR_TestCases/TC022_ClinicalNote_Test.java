package TestCases.EMR_TestCases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.EMR_Pages.ClinicalNote_Page;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;


public class TC022_ClinicalNote_Test extends BaseTest {
    public ClinicalNote_Page clinicobj;

    @Test
    public void clinicalNote() throws InterruptedException {
    	
        clinicobj =new ClinicalNote_Page(driver);
        regobj = new RegistrationPage(driver);
        diagnsisobj = new DiagnosisPage(driver);

        regobj.clickonHamburgerMenu();

        clinicobj.ClickOnPhysicianMenu();

        clinicobj.ClickOnPhysicianWorkList();

        diagnsisobj.clickOnOpenRecord();
        
        WebElement popupMessage = driver.findElement(By.xpath("//h1[contains(text(),'OS-1150358 : This medical Record is closed, are you sure you want to proceed ?')]")); // Adjust XPath as needed

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement confirmationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'OS-1150358 : This medical Record is closed')]")));
        
        if (popupMessage.isDisplayed()) {
        	Thread.sleep(2000);
            clinicobj.clickonCancel(); 
            clinicobj.ClickOnOpenRecord2(); 
            clinicobj.ClicKOnpatientMenu(); 
        }else {
        clinicobj.ClicKOnpatientMenu();
        }

        clinicobj.ClickOnClinicalNote();
        
        clinicobj.noteType();
        
        clinicobj.selectAll();

        clinicobj.speciality();

        clinicobj.All();

        clinicobj.NewNote();

        clinicobj.note2();

        clinicobj.Text("Admission");

        clinicobj.srch();
        Thread.sleep(1000);

        clinicobj.ok();
        Thread.sleep(1000);

        clinicobj.note("Patient has high BP");
        Thread.sleep(1000);

        clinicobj.sav();
        Thread.sleep(1000);

        clinicobj.ed();
        Thread.sleep(1000);

        clinicobj.editNotes("Shift bed");
        Thread.sleep(1000);

        clinicobj.sv();
        Thread.sleep(1000);

        clinicobj.del();
        Thread.sleep(1000);

        clinicobj.delreason("Wrong file");
        Thread.sleep(1000);

        clinicobj.okay();
        Thread.sleep(1000);

        clinicobj.Close();

    }
}