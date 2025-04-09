package Pages.PMI_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class InsurancePage {
	WebDriver driver;
	
	public InsurancePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By purchasersearchfield = By.name("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:new_ins_or:oc122:or4:oc1:ff2:fi23:prchsr_olov:listOfValueTxt");
	By enterpurchaser = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:new_ins_or:oc122:or4:oc1:ff2:fi23:prchsr_olov:listOfValueTxt::content");
	By selectpurchaser = By.xpath("//span[contains(text(),'Arabian')]");
	By selectallied = By.xpath("//span[contains(text(), ' Allied Cooperative Insurance Company     Vat_R_No_#300007361200003')]");
	By clickonokpurchaser = By.xpath("//span[contains(text(),'Ok')]");
	By selectcontract = By.xpath("//span[contains(text(),'amer')]");
	By clickokcontract = By.xpath("//span[contains(text(),'Ok')]");
	By insuredocNum = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:new_ins_or:oc122:or1:oc4:ff21:fi233122:docNo_it::content");
	By insurepolicynum = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:new_ins_or:oc122:or4:oc1:ff2:fi21:plcnoad::content");
	By clickonAddInsurance = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r7:0:ins_tmp:ot7:b3']");
	By clickonsavebutton = By.xpath("//span[contains(text(),'Save Changes')]");
	By clickonlogout = By.xpath("//span[contains(text(),'Logout')]");
	
	public void clickonPurchaserfield() {
		driver.findElement(purchasersearchfield).click();
		
	}
	
	public void enterPurchaser(String purchasername) {
		driver.findElement(enterpurchaser).sendKeys(purchasername);
		
	}
		
	public void selectPurchaser() {
		driver.findElement(selectpurchaser).click();		
	}
	
	
	  public void clickonPurchaserName() { 
		  driver.findElement(selectallied).click();
	  }
	
	  public void clickonOkPurchaser() {
	  driver.findElement(clickonokpurchaser).click(); }
	 
	
	public void selectContract() {
		driver.findElement(selectcontract).click();
	}
	
	public void clickonOkContract() {
		driver.findElement(clickokcontract).click();
	}
	
	public void enterInsurePolicyNum(String insPolicyNum) {
		driver.findElement(insurepolicynum).sendKeys(insPolicyNum);
	}
	
	public void enterInsureDocNumber(String insdocNum) {
		driver.findElement(insuredocNum).sendKeys(insdocNum);
	}
	
	public void clickonOkAddInsuranceButton() {
		//driver.findElement(clickonAddInsurance).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Add')])[3]")));
		driver.findElement(By.xpath("(//span[contains(text(),'Add')])[3]")).click();
		System.out.println("Clicked on 'Add Insurance' button after waiting for it to be clickable.");

	}
	
	public void clickonSaveButton() {
		driver.findElement(clickonsavebutton);			
	}
	
	public void clickonLogout() {
		driver.findElement(clickonlogout);
	}
	

}
