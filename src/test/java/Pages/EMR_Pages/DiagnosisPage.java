package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DiagnosisPage {
	WebDriver driver;
	
	public DiagnosisPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By clickonphysicianmenu = By.xpath("//span[contains(text(),'Physician Menu')]");
	By clickonphysicianworklist = By.xpath("//span[contains(text(),'Physician Worklist')]");
	By clickonopenrecord = By.xpath("(//span[text()='Open Record'])[1]");
	By clickonmenu = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:ot3:b1");
	By clickondiagnosis = By.xpath("(//span[contains(text(),'Diagnosis')])[1]");
	By clickonadddiag = By.xpath("//span[contains(text(),'Add')]");
	By searchdiagnonFavrts = By.xpath("//input[@id[contains(.,'dtl_cnt:of1:or1:oc1:ff1:fi1:os_lst_diag:listOfValueTxt::content')]]");
	By selectdiagnosis = By.xpath("(//li[@value='2'])[2]");
	By selectpreliminary = By.xpath("//label[text()='Preliminary' and @class='x2l']");
	By writecommentondiag = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:up_cnt:dtl_cnt:of1:or3:oc4:ofi7:it1::content");
	By rewritecomment = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:s1:diag_Insert:or2:oc14:or9:oc7:of5:it3::content");                      
	By clickonaddtosave = By.xpath("//span[contains(text(),'Add ')]");
	By clickonsavebtn = By.xpath("//span[contains(text(),'Save')]");
	By clickonsaveddiag = By.xpath("//span[text()='A01 Typhoid And Paratyphoid Fevers']");
	By clickoneditbtn = By.xpath("//span[text()='Edit']");
	By clickoncancelled = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:s1:diag_Insert:or2:oc14:or4:oc9:of2:sor4:_2");
	By clickdate = By.xpath("//span[@class='x43k']");
	
	public void clickDate() {
		driver.findElement(clickdate).click();
	}
	
	public void clickOnPhysicianMenu() {
		driver.findElement(clickonphysicianmenu).click();
	}
	
	public void clickOnPhysicianWorkList() {
		driver.findElement(clickonphysicianworklist).click();
	}
	
	public void clickOnOpenRecord() {
		driver.findElement(clickonopenrecord).click();
	}
	
	public void clickOnMenu() {
		driver.findElement(clickonmenu).click();
	}
	
	public void clickOnDiagnosis() {
		driver.findElement(clickondiagnosis).click();
	}
	
	public void clickOnAddDiagnosis() {
		driver.findElement(clickonadddiag).click();
	}
	
	public void searchDiagOnFavorites(String diag) {
		driver.findElement(searchdiagnonFavrts).sendKeys(diag);;
	}
	
	public void selectDiagnosis() {
		driver.findElement(selectdiagnosis).click();
	}

	public void selectPreliminary() {
		driver.findElement(selectpreliminary).click();
	}
	
	public void writeCommentsOnDiagnosis(String commentsfordiag) {
		driver.findElement(writecommentondiag).sendKeys(commentsfordiag);
	}
	
	public void clickOnAddtoSave() {
		driver.findElement(clickonaddtosave).click();
	}
	
	public void clickOnSaveBtn() {
		driver.findElement(clickonsavebtn).click();
	}
	
	public void clickOnEditBtn() {
		driver.findElement(clickoneditbtn).click();
	}
	
	public void clickOnSavedDiagnosis() {
		driver.findElement(clickonsaveddiag).click();
	}
	
	public void clearComments() {
		WebElement clearcomment = driver.findElement(By.xpath("//textarea[text()='Patient has active record' and @class='x25']"));
		clearcomment.sendKeys(Keys.chord(Keys.CONTROL, "a"));  // Select all text
		clearcomment.sendKeys(Keys.DELETE);  
		clearcomment.sendKeys("Patient Discharged");// Delete selected text
	}
	
	public void reWriteComments(String rewrite) {
		driver.findElement(rewritecomment).sendKeys(rewrite);
	}
	
	public void selectCancelledBtn() {
		driver.findElement(clickoncancelled).click();
	}
	
	public void selectCancelledDropdown() {
		WebElement cancelled = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select cancelleddrop = new Select(cancelled);
		cancelleddrop.selectByValue("1");
	}

}
