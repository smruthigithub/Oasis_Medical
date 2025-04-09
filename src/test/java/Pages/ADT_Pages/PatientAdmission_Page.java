package Pages.ADT_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PatientAdmission_Page {
WebDriver driver;
	
	public PatientAdmission_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By selectpatientAdmi = By.xpath("//span[normalize-space()='Patient Admission']");
	By enterpatientID = By.xpath("//input[@id[contains(.,'ptdata:frstr:ptidc:dc_ff2:dc_fi2:ptidit::content')]]");
	By consultantdropdown = By.xpath("//div[@id[contains(.,'doc1lov:oasis_list_of_values_search_btn')]]");
	By enterphysician = By.xpath("//input[@id[contains(.,'searchTxt::content')]]");
	By clickokay = By.xpath("//span[text()='Ok']");
	By admissionreasonicon = By.xpath("//div[@id[contains(.,'resOlov:oasis_list_of_values_search_btn')]]"); 
	By clickokreason = By.xpath("(//span[text()='Ok'])[2]");
	By selectward = By.xpath("//li[@title='Nursery- Section']");
	By saveadmission = By.xpath("//span[text()='Save Admission']");
	By clickNoreports = By.xpath("(//span[text()='No'])[4]"); 
	By downpaymentOk = By.xpath("(//span[text()='OK'])[1]");
	By enteramount = By.xpath("//input[@name[contains(.,'pt1:dwnpyf1:amntfi:amntit')]]");
	By clicksave = By.xpath("//span[text()='Save']");

	
	public void selectPatientAdmisn() {
		driver.findElement(selectpatientAdmi).click();
	}
	
	public void enterPatientID(String patid) {
		driver.findElement(enterpatientID).sendKeys(patid);
		driver.findElement(enterpatientID).sendKeys(Keys.ENTER);
	}
	
	public void consultantDropDown() {
		driver.findElement(consultantdropdown).click();
	}
	
	public void enterPhysician(String physician) {
		driver.findElement(enterphysician).sendKeys(physician);
		driver.findElement(enterphysician).sendKeys(Keys.ENTER);
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();
	}
	
	public void admissionReasonIcon() {
		driver.findElement(admissionreasonicon).click();
	}
	
	public void clickOkReason() {
		driver.findElement(clickokreason).click();
	}
	
	public void selectWard() {
		driver.findElement(selectward).click();
	}
	
	public void saveAdmission() {
		driver.findElement(saveadmission).click();
	}
	
	public void clickNoReports() {
		driver.findElement(clickNoreports).click();
	}
	
	public void downPaymentOk() {
		driver.findElement(downpaymentOk).click();
	}
	
	public void transactionType() {
		WebElement transactiontype = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:ad_tmp:r1:0:pt1:dwnpyf1:trxtpfi:trxsoc::content']"));
		Select select = new Select(transactiontype);
		select.selectByVisibleText("Cash");
	}
	
	public void enterAmount(String amt) {
		driver.findElement(enteramount).sendKeys(amt);
	}
	
	public void clickSave() {
		driver.findElement(clicksave).click();
	}
	

}
