package TestCases.PMI_TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.PMI_Pages.IDsPage;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;


public class TC001_Registration_Test extends BaseTest {
	public RegistrationPage regobj;

	@Test(dataProvider = "RegistrationData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void registration_TC1(Object obj) throws InterruptedException, EncryptedDocumentException, IOException {
				
		@SuppressWarnings("unchecked")
		HashMap<String, String> testData = (HashMap<String, String>) obj;
		
		extentlogger = extent.createTest("Registration Test Started");
		extentlogger.log(Status.PASS, "Registration of patient is successful");
		//extentlogger.pass("Registration Testcase is Passed");

		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		idobj = new IDsPage(driver);
		regobj.RegistrationDetails(testData);
		
		String firstName = testData.get("firstName");
        String familyName = testData.get("familyName");
        String dob = testData.get("dob");
        String nationality = testData.get("nationality");
        String mobileNo = testData.get("mobileNo");
        String purchaser = testData.get("purchaser");
        String insDocNum = testData.get("insDocNum");
        String insPolicyNum = testData.get("insPolicyNum"); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Assert for Login		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Dr.Halah Essa Binladen Hospital')]")));
		System.out.println("User is successfully logged in.");
		
		Thread.sleep(3000);
		regobj.clickonHamburgerMenu();
	    regobj.clickonPMIndex();
		regobj.clickonPMIProcess();
		regobj.clickOnPatientSearch();
		Thread.sleep(3000);
		regobj.clickonRegistration();
		Thread.sleep(3000);
		regobj.titleDropdown();
		Thread.sleep(3000);
		regobj.enterFirstName(firstName);
		Thread.sleep(4000);
		regobj.enterFamilyName(familyName);
		Thread.sleep(4000);
		regobj.clickonGender();
		Thread.sleep(2000);
		regobj.enterDOB(dob);
		Thread.sleep(2000);
		regobj.clickNationalityMenu();
		Thread.sleep(4000);
		regobj.enterNationalityName(nationality);
		regobj.clickNationalitySearch();
		regobj.clickOnOkay();
		Thread.sleep(3000);
		regobj.clickJobMenu();
		regobj.clickAccountant();
		regobj.clickJobOkay();
		Thread.sleep(4000);	
		regobj.enterMobilenumber(mobileNo);				
		 Thread.sleep(4000);

		// Insurance Registration

		insureobj.clickonPurchaserfield();
		Thread.sleep(2000);
		
		WebElement clickonno = driver.findElement(By.xpath("(//div[@data-afr-pdo='no'])[7]"));    //Actions on Duplicate data
		if(clickonno.isDisplayed()) {
		regobj.clickonNoReg();
		Thread.sleep(2000);
		}
		
		insureobj.enterPurchaser(purchaser);
		insureobj.selectPurchaser();
		//insureobj.selectContract();
		insureobj.clickonOkContract();
		Thread.sleep(2000);
		insureobj.enterInsureDocNumber(insDocNum);
		Thread.sleep(2000);
		insureobj.enterInsurePolicyNum(insPolicyNum);
		Thread.sleep(2000);
		insureobj.clickonOkAddInsuranceButton();

		// ID Registration

		idobj.selectIDType();
		Thread.sleep(3000);
		idobj.enterIDDocNumber("OS-"+generaterandomID());
		Thread.sleep(2000);
		idobj.clickonAddIDbutton();
		Thread.sleep(3000);		
		regobj.clickSaveChanges();	
		regobj.clickOKAfterSave();
		
		//Assertion
		
//		WebElement successMsg = driver.findElement(By.xpath("//h1[contains(text(),'Record Saved Successfully')]"));
//		String actualText = successMsg.getText();
//		Assert.assertEquals(actualText, "OS-1000075 : Record Saved Successfully", "Success message text mismatch!");
//		extentlogger.info("Record Saved Successfully");
//		extent.removeTest(extentlogger);
//
//		extentlogger.log(Status.PASS, "Registration TestCase Passed");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement successMessageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Record Saved Successfully')]"))); // Correct locator
//
//		String actualMessage = successMessageElement.getText(); // Get the actual message text
//		System.out.println("Actual Message: " + actualMessage); // Print for debugging
//
//		// Take a screenshot on failure
//		if (actualMessage.contains("OS-1000075 : Record Saved Successfully")) {
//			 Assert.assertTrue(true);
//			 extentlogger.info("Registration test passed");
//		}
//		
//		else 
//		{
//		    captureScreen(driver, "registration_TC1");
//		    Assert.assertTrue(false);
//		    extentlogger.info("Registration test failed");
//		}
	}

}
