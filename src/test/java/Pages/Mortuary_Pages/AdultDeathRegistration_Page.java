package Pages.Mortuary_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdultDeathRegistration_Page {
	
	WebDriver driver;

	public  AdultDeathRegistration_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By adultdeathreg = By.xpath("//span[text()='Adult Death Registration']");
	By enterpatientid = By.id("pt1:contrRg:0:CntRgn:1:adultDthNotificationContentID:or1:oc1:adultDthRegContext:oscrd:ptinfc:ptdata:frstr:ptidc:dc_ff2:dc_fi2:ptidit::content");
	By placeofdeath = By.xpath("//input[@value='0']");
	By duetoreason1 = By.xpath("(//input[@class='x25'])[8]");
	By mannerofdeath = By.xpath("(//input[@class='xu3'])[3]");
	By historyofinjury = By.xpath("(//input[@class='xu3'])[9]");
	By clickregisterdeath = By.xpath("//span[text()='Register Death']");
	By clickokregister = By.xpath("(//span[text()='OK'])[1]");
	By enterusername = By.xpath("(//input[@class='x25' and @type='text'])[11]");
	By enterpassword = By.xpath("(//input[@class='x25' and @type='text'])[12]");
	By clickokauth = By.xpath("(//span[text()='OK'])[2]");
	
	By clickreset = By.xpath("//span[text()='Reset']");
	By newregister = By.xpath("//span[text()='Register']");
	By firstname = By.xpath("//input[@id='pt2:r1:0:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi32:ptnm1en::content']");
	By familyname = By.xpath("//input[@id='pt2:r1:0:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi35:nmfmen::content']");
	By enterdob = By.xpath("//input[@placeholder='Greg Date']");
	By enterguardianid = By.xpath("//input[@id='pt2:r1:0:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:grdnff:grdidfi:grdidit::content']");
	By clickokonguardian = By.xpath("//div[@id='pt2:r1:0:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:j_id49_ok']");
	By docnumber = By.xpath("//input[@id='pt2:r1:0:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg1:dc_fi1:docId4::content']");
	By clickback = By.xpath("//span[text()='Back']");
	
	By unknownpatient = By.xpath("//span[text()='Unknown Patient']");
	
	
	
	public void clickAdultDeathReg() {
		driver.findElement(adultdeathreg).click();		
	}
	
	public void enterPatientID(String patientid) {
		driver.findElement(enterpatientid).sendKeys(patientid);	
		driver.findElement(enterpatientid).sendKeys(Keys.ENTER);
	}
	
	public void clearPatientID() {
		driver.findElement(enterpatientid).clear();
	}
	
	public void placeOfDeath() {
		driver.findElement(placeofdeath).click();		
	}
	
	public void enterDueTo1(String reason1) {
		driver.findElement(duetoreason1).sendKeys(reason1);			
	}
	
	public void mannerOfDeath() {
		driver.findElement(mannerofdeath).click();		
	}
	
	public void historyOfInjury() {
		driver.findElement(historyofinjury).click();		
	}
	
	public void clickRegisterDeath() {
		driver.findElement(clickregisterdeath).click();		
	}
	
	public void clickOkRegister() {
		driver.findElement(clickokregister).click();		
	}
	
	public void enterUserName(String user) {
		driver.findElement(enterusername).sendKeys(user);			
	}
	
	public void enterPassword(String password) {
		driver.findElement(enterpassword).sendKeys(password);			
	}
	
	public void clickOkAuthentication() {
		driver.findElement(clickokauth).click();		
	}
	
	//Registering new Patient 
	
	public void clickReset() {
		driver.findElement(clickreset).click();		
	}
	
	public void clicknewRegister() {
		driver.findElement(newregister).click();		
	}
	
	public void titleDropdown() {
		WebElement titleDropdownWE = driver.findElement(By.xpath("//select[@id='pt2:r1:0:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:soc12::content']"));
		Select title = new Select(titleDropdownWE);
		title.selectByVisibleText("Mr");
	}
	
	public void enterFirstName(String fname) {
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(firstname).sendKeys(Keys.ENTER);
	}
	
	public void enterFamilyName(String famname) {
		driver.findElement(familyname).sendKeys(famname);
	}

	public void enterDOB(String dob) {
		driver.findElement(enterdob).sendKeys(dob);
	}
	
	public void enterGuardianID(String guardianId) {
		driver.findElement(enterguardianid).sendKeys(guardianId);
		driver.findElement(enterguardianid).sendKeys(Keys.ENTER);
		
    }
	
	public void clickOkonGuardianInfo() {
		driver.findElement(clickokonguardian).click();
	}
	
	public void selectIDType() {
		WebElement selecttype = driver.findElement(By.xpath("//select[@id='pt2:r1:0:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg1:fi1:docType2::content']"));
		Select select = new Select(selecttype);
		select.selectByValue("1");
	}
	
	public void enterIDDocNumber(String docNum) {
		driver.findElement(docnumber).sendKeys(docNum);
	}
	
	public void clickOKNoInsure() {
		driver.findElement(By.xpath("//div[@id='pt2:r1:0:pt1regi:osc1:ot1:d6_ok']")).click();
	}
	
	public void clickBack() {
		driver.findElement(clickback).click();
	}
	
	//Registering Unknown Patient
	
	public void clickUnknownPatient() {
		driver.findElement(unknownpatient).click();
	}
	
	public void clickOkUnknownReg() {
		driver.findElement(clickokregister).click();
	}
	
	
}
