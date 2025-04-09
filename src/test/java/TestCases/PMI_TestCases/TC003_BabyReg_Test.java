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

import Pages.PMI_Pages.BabyRegPage;
import Pages.PMI_Pages.IDsPage;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;


public class TC003_BabyReg_Test extends BaseTest {

	@Test(dataProvider = "BabyRegistrationData", dataProviderClass = DataProviders.class, groups = {"smoke", "regression"})
	public void babyReg_TC2(HashMap<String, String> testData) throws InterruptedException, IOException {
		
		extentlogger = extent.createTest("Registration Test Started");
		extentlogger.log(Status.PASS, "Registration of patient is successful");
		// extentlogger.pass("Registration Testcase is Passed");
		
		 if (testData == null) { // Handle null data (from empty rows)
	            extentlogger.fail("Test data is null. Check the Excel file.");
	            return; // Stop the test if data is null
	        }

		regobj = new RegistrationPage(driver);
		insureobj = new InsurancePage(driver);
		idobj = new IDsPage(driver);
		babyobj = new BabyRegPage(driver);
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
		
		regobj.clickonHamburgerMenu();
	    regobj.clickonPMIndex();
		regobj.clickonPMIProcess();
		regobj.clickOnPatientSearch();
		regobj.clickonRegistration();
		Thread.sleep(3000);
		
		//Mother Registration
		
		babyobj.titleMiss();
		regobj.enterFirstName(firstName);
		Thread.sleep(4000);
		regobj.enterFamilyName(familyName);
		Thread.sleep(4000);
		
		WebElement element = driver.findElement(By.xpath("//label[text()='Patient Id']/parent::span/following-sibling::span"));   //Storing the Patientid
		String PatientID = element.getText();
		System.out.println("Mother ID is : "+PatientID);
		Thread.sleep(3000);
		
		regobj.enterDOB(dob);
		Thread.sleep(2000);
		regobj.clickNationalityMenu();
		Thread.sleep(4000);
		regobj.enterNationalityName(nationality);
		regobj.clickNationalitySearch();
		regobj.clickOnOkay();
		Thread.sleep(5000);
		regobj.enterMobilenumber(mobileNo);
		Thread.sleep(3000);
		
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
		
		//Baby Registration
		
		babyobj.clickDefaultTaskFlow();
		Thread.sleep(4000);
		regobj.clickonHamburgerMenu();
		babyobj.enterSearchField("Search");
		regobj.clickOnPatientSearch();
		Thread.sleep(2000);
		regobj.clickonRegistration();
		Thread.sleep(4000);
		babyobj.titleBaby();
		Thread.sleep(3000);
		regobj.clickonGender();
		Thread.sleep(4000);	
		babyobj.selectBabyDOB();
		Thread.sleep(3000);
		babyobj.enterMotherID(PatientID);
		Thread.sleep(4000);
		babyobj.clickOnCopyDetails();
		Thread.sleep(6000);
		regobj.clickSaveChanges();

	}
}
