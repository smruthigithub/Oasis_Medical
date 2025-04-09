package TestCases.PMI_TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.PMI_Pages.IDsPage;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;


public class TC002_Registration_Guardian extends BaseTest {

	@Test(dataProvider = "RegistrationData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void regGuardian_TC2(Object obj) throws InterruptedException, EncryptedDocumentException, IOException {
		
		@SuppressWarnings("unchecked")
		HashMap<String, String> testData = (HashMap<String, String>) obj;
		
		extentlogger = extent.createTest("Registration Test Started");
		extentlogger.log(Status.PASS, "Registration of patient is successful");
		// extentlogger.pass("Registration Testcase is Passed");

		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		idobj = new IDsPage(driver);
		regobj.RegistrationDetails(testData);
		
		String firstName = testData.get("firstName");
        String dob = testData.get("dob");
        String guardianID = testData.get("guardianID");  

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Assert for Login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//span[contains(text(),'Dr.Halah Essa Binladen Hospital')]")));
		System.out.println("User is successfully logged in.");
		regobj.clickonHamburgerMenu();
	    regobj.clickonPMIndex();
		regobj.clickonPMIProcess();
		Thread.sleep(3000);
		regobj.clickOnPatientSearch();
		regobj.clickonRegistration();
		Thread.sleep(3000);
		regobj.titleDropdown();
//		WebElement titleDropdownWE = driver.findElement(By.xpath("//select[@id[contains(.,'demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content')]]"));
//		Select title = new Select(titleDropdownWE);
//		title.selectByVisibleText("Mr");
		Thread.sleep(3000);
		regobj.enterFirstName(firstName);
		Thread.sleep(4000);
		regobj.enterDOB(dob);
		Thread.sleep(4000);
		
		regobj.enterGuardianID(guardianID);
		Thread.sleep(5000);
		regobj.clickOkonGuardianInfo();
		Thread.sleep(4000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement docnum = driver.findElement(By.xpath("//input[@id[contains(.,'pt_ids_frg_ff:fg1:dc_fi1:docId4::content')]]"));
	    wait1.until(ExpectedConditions.elementToBeClickable(docnum));
		idobj.enterIDDocNumber("OS-"+generaterandomID());
		Thread.sleep(2000);
		idobj.clickonAddIDbutton();
		Thread.sleep(2000);
		regobj.clickSaveChanges();
		regobj.clickOKAfterSave();

	}

}
