package Pages.PMI_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IDsPage {	
	WebDriver driver;
	
	public IDsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By docnumber = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg1:dc_fi1:docId4::content");
	By issuedondate = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg12:dc_fi5:issdOnDt::content");
	By expiredondate = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg12:dc_fi4:exprOnDt::content");
	By clickdefaultcheckbox = By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg12:dc_fi3:defIdSbc::content");
	By clickonAddID = By.xpath("(//span[contains(text(),'Add')])[2]");
	
	public void selectIDType() {
		WebElement selecttype = driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:ids_reg:0:patientidspt1:add_pat_id_dc:pt_ids_frg_ff:fg1:fi1:docType2::content"));
		Select select = new Select(selecttype);
		select.selectByVisibleText("Iqama");
	}
	
	public void enterIDDocNumber(String docNum) {
		driver.findElement(docnumber).sendKeys(docNum);
	}
	
	public void enterIssuedDateofID(String issuedDate) {
		driver.findElement(issuedondate).sendKeys(issuedDate);
	}
	
	public void enterExpiryDateofID(String expiryDate) {
		driver.findElement(expiredondate).sendKeys(expiryDate);
	}
	
	public void clickonDefaultCheckbox() {
		driver.findElement(clickdefaultcheckbox).click();
	}
	
	public void clickonAddIDbutton() {
		driver.findElement(clickonAddID).click();
	}

}
