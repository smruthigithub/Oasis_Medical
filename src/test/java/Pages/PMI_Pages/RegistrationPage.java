package Pages.PMI_Pages;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelUtility;

public class RegistrationPage {
		WebDriver driver;
		
		private static HashMap<String, String> testData;
			
		//ExcelUtility xlutil = new ExcelUtility(".\\testData\\\\Automation_Data.xlsx", "Registration");
						
		
	public RegistrationPage(WebDriver driver) {
		this.driver =driver;
	}
	
	By clickonmenu = By.id("pt1:OasisHedarToolBar:hamburgerBtn");
	By searchpatient = By.xpath("//input[@placeholder='Search...']");
	By clickonPMindex = By.xpath("//span[contains(text(),'Patient Master Index')]");
	By clickonPMIprocess = By.xpath("//span[contains(text(),'PMI Processing')]");
	By clickonpatientsearch = By.xpath("(//span[contains(text(),'Patient Search')])[1]");
	By clickonRegister = By.xpath("//span[contains(text(),'Register a New Patient')]");
	By clickonfirstname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi32:ptnm1en::content");
	By clickonarabicfname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:1:oc19:ff5:fi32:ptnm1ar::content");
	By clickonfamname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi35:nmfmen::content");
	By clickonarabicfam = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:1:oc19:ff5:fi35:nmfmar::content");
	By clickongender = By.xpath("(//span[@class='xk2'])[1]");
	By enterdob = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:ff1:greg_fi:greg_dob::content");
	By clicnationalitymenu = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:oasis_list_of_values_search_btn");
	By enternationalityname = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt::content");
	By clickonnationalitysearch = By.xpath("(//span[contains(text(), 'Search')])[2]");
	By clickonokay = By.xpath("//span[contains(text(), 'Ok')]");
	By enterguardianid = By.xpath("//input[@id[contains(.,'demo_pg:or7:bscOc:grdnff:grdidfi:grdidit::content')]]");
	By clickguardianMR = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:grdnff:grdmrnfi:grdmrnit::content']");
	By clickokonguardian = By.xpath("(//span[text()='OK'])[1]");

	By clickjobmenu = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:oasis_list_of_values_search_btn");
	By clickaccountant = By.xpath("//span[contains(text(), 'ACCOUNTANT')]");
	By clickjobokay = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:lov_search_diag_yes");
	By entermobileno = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:fg1:fi10:mobileIt::content");
	By clickonsave = By.xpath("//span[contains(text(), 'Save Changes')]");
	By clickonyes = By.xpath("(//span[contains(text(),'Yes')])[7]");
	By clickonno = By.xpath("(//div[@data-afr-pdo='no'])[7]");
	By cancelguardian = By.xpath("(//span[text()='Cancel'])[1]");
	By clickokNoInsure = By.xpath("//span[text()='OK']");
	
	
	public void clickonHamburgerMenu() {
		driver.findElement(clickonmenu).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search|input']")));
	}
	
	
	  public void enterpatientsearch() { 
		  driver.findElement(searchpatient).click();
	  }
	
	public void clickonPMIndex() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Patient Master Index')]")));
	    driver.findElement(By.xpath("//span[contains(text(),'Patient Master Index')]")).click();
	    System.out.println("Clicked on 'Patient Master Index' after waiting for its presence.");
		  }
	
	
	public void clickonPMIProcess() {
		driver.findElement(clickonPMIprocess).click();
	}
	
	public void clickOnPatientSearch() {
		driver.findElement(clickonpatientsearch).click();;
}
	
	public void clickonRegistration() {
		driver.findElement(clickonRegister).click();
	}
	
	public void titleDropdown() {
		WebElement titleDropdownWE = driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content"));
		Select title = new Select(titleDropdownWE);
		title.selectByVisibleText("Mr");
	}
	
	public void RegistrationDetails(HashMap<String, String> testData) throws EncryptedDocumentException, IOException {
		if (testData == null) {
			testData = new HashMap<>(); 
           // testData = xlutil.getTestDataInMap(1);
            
            String firstName = testData.get("firstName");
            String familyName = testData.get("familyName");
            String dob = testData.get("dob");
            String nationality = testData.get("nationality");
            String mobileNo = testData.get("mobileNo");
            String purchaser = testData.get("purchaser");
            String insDocNum = testData.get("insDocNum");
            String insPolicyNum = testData.get("insPolicyNum");
            String docIssuedDate = testData.get("docIssuedDate");
            String docExpiryDate = testData.get("docExpiryDate");
            String guardianID = testData.get("guardianID");            
        }
		
	}
	
	public void enterFirstName(String firstname) {
		driver.findElement(clickonfirstname).sendKeys(firstname);
		driver.findElement(clickonfirstname).sendKeys(Keys.ENTER);
		
	}
	
	public void clickonArabicfName() {
		driver.findElement(clickonarabicfname).click();
	}
	
	public void enterFamilyName(String famname) {
		driver.findElement(clickonfamname).sendKeys(famname);
		driver.findElement(clickonfamname).sendKeys(Keys.ENTER);
	}
	
	public void clickonArabicfamName() {
		driver.findElement(clickonarabicfam).click();
	}
	
	public void clickonGender() {
		driver.findElement(clickongender).click();
	}
	
	public void enterDOB(String dob) {
		driver.findElement(enterdob).sendKeys(dob);
	}
	
	//Guardian
	public void enterGuardianID(String guardianId) {
			driver.findElement(enterguardianid).sendKeys(guardianId);
			driver.findElement(enterguardianid).sendKeys(Keys.ENTER);
	}
	
	public void clickGuardianMR() {
		driver.findElement(clickguardianMR).click();
	}
	
	public void clickOkonGuardianInfo() {
		driver.findElement(clickokonguardian).click();
	}	
		
	public void maritalDropdown() {
		WebElement maritalDropdownWE = driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi2122:soc11:codesSelect::content"));
		Select marital = new Select(maritalDropdownWE);
		marital.selectByVisibleText("Married");
	}
	
	public void clickNationalityMenu() {
		driver.findElement(clicnationalitymenu).click();
	}
	
	public void enterNationalityName(String nationalityname) {
		driver.findElement(enternationalityname).sendKeys(nationalityname);
	}
	
	public void clickNationalitySearch(){
		driver.findElement(clickonnationalitysearch).click();
	}
	
	public void clickOnOkay() {
		driver.findElement(clickonokay).click();
	}
	
//	public void clickJobMenu() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	    wait.until(ExpectedConditions.presenceOfElementLocated(clickjobmenu));
//		driver.findElement(clickjobmenu).click();
//	}
	
	public void clickJobMenu() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement jobMenuElement = wait.until(ExpectedConditions.elementToBeClickable(clickjobmenu));

	    // Handle StaleElementReferenceException
	    try {
	        jobMenuElement.click();
	    } catch (StaleElementReferenceException e) {
	        // Element might have changed, try locating it again
	        jobMenuElement = wait.until(ExpectedConditions.elementToBeClickable(clickjobmenu));
	        jobMenuElement.click();
	    }
	}
	
	public void clickAccountant() {
		driver.findElement(clickaccountant).click();
		
	}
	
	public void clickJobOkay() {
		driver.findElement(clickjobokay).click();
	}
	
	
	public void enterMobilenumber(String mobileno) {
		driver.findElement(entermobileno).sendKeys("0"+mobileno);
	}
	
	
	public void clickSaveChanges() {
		driver.findElement(clickonsave).click();
	}
	
	public void clickonYesReg() {
		driver.findElement(clickonyes).click();
	}
	
	public void clickonNoReg() {
		driver.findElement(clickonno).click();
	}
	
	public void cancelGuardian() {
		driver.findElement(cancelguardian).click();
	}
	
	public void clickOKNoInsure() {
		driver.findElement(By.xpath("//span[text()='OK']")).click();
	}
	
	public void clickOKAfterSave() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement clickOKafterSave = driver.findElement(By.xpath("//div[@id[contains(.,'pt1regi:osc1:ot1:d6_ok')]]"));
	    wait.until(ExpectedConditions.elementToBeClickable(clickOKafterSave));
	    clickOKafterSave.click();
		Thread.sleep(2000);
	
	}	


}
