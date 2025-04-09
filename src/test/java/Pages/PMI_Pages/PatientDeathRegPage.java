package Pages.PMI_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientDeathRegPage {

	WebDriver driver;

	public PatientDeathRegPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By meddropdown = By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:dc_b1']//a[@role='button']");
	By enterentity= By.xpath("//input[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:fi1:wrk_ent_srch_it::content']");
	By selectentity = By.xpath("//span[@class='labicon']");
	By enterPatient = By.xpath("//input[@id[contains(.,'ptidfi:PtnSrch::content')]]");
	By clickonadvanced = By.xpath("//span[text()='Advanced']");
	By clickonpatientdetails = By.xpath("//span[normalize-space()='Patient Details']");
	By clickonmedicalfile = By.xpath("//span[normalize-space()='Medical File']");
	By clickok = By.xpath("(//span[text()='OK'])[1]");
	By closewindow = By.xpath("//span[text()='Close']");	
	By selectcertifier = By.xpath("//span[text()=' Ali Abdullah Othman']");
	By enterstaff = By.xpath("(//input[@placeholder='Name '])[2]");
	By selectstaff = By.xpath("//span[text()='Esmaeel Ahmed Sediquee']");


	By clickonpdr = By.xpath("//span[text()='Patient Death Registration']");
	By enterpatiendid = By.xpath("//input[@id[contains(.,'ptdata:frstr:ptidc:dc_ff2:dc_fi2:ptidit::content')]]");
	By clickcertifysearchicon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
	By entercertifyname = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:5:dth_pg_tmplt:pt_dt_oc:main_or:oc1:main_ff:fi8:olov2:dc_or2:dc_oc1:dc_ofi1:searchTxt::content']");
	By clickcerifysearchbtn = By.xpath("//span[text()='Search']");
	By clickokay = By.xpath("//div[id=pt1:contrRg:0:CntRgn:1:dth_pg_tmplt:pt_dt_oc:main_or:oc1:main_ff:fi8:olov2:lov_search_diag_yes]");
	By clickqmraldinbakry = By.xpath("//td[@id='pt1:contrRg:0:CntRgn:5:dth_pg_tmplt:pt_dt_oc:main_or:oc1:main_ff:fi8:olov2:dc_or3:dc_oc2:t2:7:c2']");
	By clickokdate = By.xpath("//button[text()='OK']");
	By clickdateicon = By.xpath("//a[@title='Select Date and Time']");
	By enterdod = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:6:dth_pg_tmplt:pt_dt_oc:main_or:oc1:main_ff:fi2:dod_id::content']");
	By clickregister = By.xpath("//span[text()='Register Death']");
	
	By clickcanceldeath = By.xpath("//span[normalize-space()='Cancel Death Registration']");
	By entercanceldeathid = By.xpath("//input[@id[contains(.,'ptidfi:PatientId_InpTxt::content')]]");
	By clicksave = By.xpath("//span[text()='Save']");
	
	    
	
	public void entityDropDown() {
		driver.findElement(meddropdown).click();
	}
	
	public void enterEntity(String entity) {
		driver.findElement(enterentity).sendKeys(entity);
		driver.findElement(enterentity).sendKeys(Keys.ENTER);
	}
	
	public void selectEntity() {
		driver.findElement(selectentity).click();
	}
	
	public void clickOnAdvanced() {
		driver.findElement(clickonadvanced).click();
	}
	
	public void enterPatIDatSearch(String patid) {
		driver.findElement(enterPatient).sendKeys(patid);
		driver.findElement(enterPatient).sendKeys(Keys.ENTER);
	}
	
	public void clickOnPatientDetails() {
		driver.findElement(clickonpatientdetails).click();
	}
	
	public void clickonMedicalFile() {
		driver.findElement(clickonmedicalfile).click();
	}
	
	public void clickOK() {
		driver.findElement(clickok).click();
	}
	
	public void clickCloseBtn() {
		driver.findElement(closewindow).click();
	}

	public void clickOnPatDeathReg() {
		driver.findElement(clickonpdr).click();
	}

	public void enterPatientID(String patiendID) {
		driver.findElement(enterpatiendid).sendKeys(patiendID);
		driver.findElement(enterpatiendid).sendKeys(Keys.ENTER);
	}

	public void clickCertifySearchIcon() {
		driver.findElement(clickcertifysearchicon).click();
	}
	
	public void selectCertifier() {
		driver.findElement(selectcertifier).click();
	}
	
	public void enterStaff() {
		driver.findElement(enterstaff).sendKeys("Esmaeel Ahmed Sediquee");
	}
	
	public void selectStaff() {
		driver.findElement(selectstaff).click();
	}

	public void enterCertifierName(String certifierName) {
		driver.findElement(entercertifyname).sendKeys(certifierName);
	}

	public void clickCertifySearchBtn() {
		driver.findElement(clickcerifysearchbtn).click();
	}

	public void clickQmraldinBakry() {
			driver.findElement(clickqmraldinbakry).click();
		}
	
	public void clickDateIcon() {
		driver.findElement(clickdateicon).click();
	}
	
	public void scrollToBottom() {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

//		public void zoomOut() {
//			
//		  JavascriptExecutor zoomOut = (JavascriptExecutor)driver;
//	 	  zoomOut.executeScript("document.body.style.zoom = '0.9'");
////			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
//		}

	public void clickOkay() {
		driver.findElement(clickokdate).click();
	}

	public void enterDoDeath(String date) {
		driver.findElement(enterdod).sendKeys(date);
	}

	public void clickRegisterDeath() {
		driver.findElement(clickregister).click();
	}
	
	//Cancel Death Registration
	
	public void clickCancelDeath() {
		driver.findElement(clickcanceldeath).click();
	}
			
	public void enterCancelDeathID(String canceldeathID) {
		driver.findElement(entercanceldeathid).sendKeys(canceldeathID);
		driver.findElement(entercanceldeathid).sendKeys(Keys.ENTER);
	}
	
	public void clickSave() {
		driver.findElement(clicksave).click();
    }

}
