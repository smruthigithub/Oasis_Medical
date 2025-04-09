package TestCases.PMI_TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.ADT_Pages.Discharge_Page;
import Pages.PMI_Pages.BabyRegPage;
import Pages.PMI_Pages.IDsPage;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.PatientDeathRegPage;
import Pages.PMI_Pages.RegistrationPage;
import base.BaseTest;
import utilities.DataProviders;


public class TC004_MRN_PDR_Test extends BaseTest {
	
	 public PatientDeathRegPage patdeathobj;
	 String mainWindow;
	 String patientID;
	
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
			patdeathobj = new PatientDeathRegPage(driver);
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
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions
//				.presenceOfElementLocated(By.xpath("//span[contains(text(),'Dr.Halah Essa Binladen Hospital')]")));
//		System.out.println("User is successfully logged in.");
		
		regobj.clickonHamburgerMenu();
	    regobj.clickonPMIndex();
		regobj.clickonPMIProcess();
		Thread.sleep(3000);
		regobj.clickOnPatientSearch();
		regobj.clickonRegistration();
		Thread.sleep(3000);
		
		//Patient Registration
		
		babyobj.titleMiss();
		regobj.enterFirstName(firstName);
		regobj.clickonArabicfName();
		Thread.sleep(3000);
		regobj.enterFamilyName(familyName);
		regobj.clickonArabicfamName();
		Thread.sleep(3000);
		
		//Saving the Patient ID 		
		WebElement element = driver.findElement(By.xpath("//label[text()='Patient Id']/parent::span/following-sibling::span")); 
		patientID = element.getText();
		System.out.println("Patient ID is : "+patientID);
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
	}
	
	@Test(priority = 1)
	public void save_MedicalFile() throws Throwable {
		
		//Changing to Med Record Library
		
		Thread.sleep(3000);		
		patdeathobj.entityDropDown();
		patdeathobj.enterEntity("Record");		
		Thread.sleep(2000);
		patdeathobj.selectEntity();
		Thread.sleep(4000);
		patdeathobj.clickOnAdvanced();
		Thread.sleep(4000);
		
		//Entering Patient ID
		
		patdeathobj.enterPatIDatSearch(patientID);
		Thread.sleep(2000);
		patdeathobj.clickOnPatientDetails();
		Thread.sleep(3000);
		patdeathobj.clickonMedicalFile();
		Thread.sleep(3000);
		patdeathobj.clickSave();
		Thread.sleep(2000);
		
		//Clicking OK 
		patdeathobj.clickOK();
						
		//Closing Medical File window
		patdeathobj.clickCloseBtn();
		
		//Moving to the main window
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='AFMaskingFrame'][1]"));
		driver.switchTo().frame(frame1);
		
		String mainWindow = driver.getWindowHandle();
		
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String windowHandle : windowHandles) {
			 if (!windowHandle.equalsIgnoreCase(mainWindow)) {
			    	Thread.sleep(3000);
			    	 driver.switchTo().window(mainWindow);
		     }
		}
	}
	
	@Test(priority = 2)
	public void patient_Death_Reg() throws Throwable {
		//Changing Entity to Hospital
		
		Thread.sleep(2000);
		patdeathobj.entityDropDown();
		patdeathobj.enterEntity("Hospital");
		Thread.sleep(2000);
		patdeathobj.selectEntity();
		Thread.sleep(5000);		
		
		//Patient Death Registration
		
		regobj.clickonHamburgerMenu();
		Thread.sleep(5000);
		babyobj.enterSearchField("Death");
		patdeathobj.clickOnPatDeathReg();
		Thread.sleep(4000);	
		patdeathobj.enterPatientID(patientID);
		Thread.sleep(6000);

		// Selecting the Certifier

		patdeathobj.clickCertifySearchIcon();
		Thread.sleep(2000);
		patdeathobj.selectCertifier();
		regobj.clickOnOkay();
		Thread.sleep(6000);

		// Selecting staff

		patdeathobj.enterStaff();
		Thread.sleep(2000);
		patdeathobj.selectStaff();
		Thread.sleep(3000);
		patdeathobj.clickDateIcon();
		Thread.sleep(2000);
		patdeathobj.clickOkay();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Register Death']")).click();
		patdeathobj.clickRegisterDeath();
		Thread.sleep(3000);		
	}
	
	
	@Test(priority = 3)
	public void cancel_Patient_Death() throws Throwable {

		// Canceling death Registration

		regobj.clickonHamburgerMenu();
		Thread.sleep(5000);
		babyobj.enterSearchField("Cancel");
		patdeathobj.clickCancelDeath();
		Thread.sleep(3000);
		patdeathobj.enterCancelDeathID(patientID);
		Thread.sleep(3000);
		patdeathobj.clickSave();
		
	}	

}
