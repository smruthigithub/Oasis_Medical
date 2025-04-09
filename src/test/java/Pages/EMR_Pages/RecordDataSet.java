package Pages.EMR_Pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecordDataSet {
	
WebDriver driver;
	
	public RecordDataSet(WebDriver driver) {
		this.driver = driver;
	}
	
	By clickok = By.xpath("(//span[text()='OK'])[1]");
	By recorddataset = By.xpath("//span[text()='Record DataSet']");
	By referraloutcome = By.xpath("(//textarea[@class='x25'])[2]");
	By saveandexit = By.xpath("//span[text()='Save and Exit']");
	By uncheckallergy = By.xpath("(//input[@type='checkbox'])[1]");
	By uncheckrisks = By.xpath("(//input[@type='checkbox'])[2]");
	By uncheckorders = By.xpath("(//input[@type='checkbox'])[4]");
	By cardioexam = By.xpath("(//a[@id[contains(.,'dspctmb:or2:oc1:ff1:fitm_dsItems:j_idt')]])[2]");
	By freetext = By.xpath("(//a[@id[contains(.,'dspctmb:or2:oc1:ff1:fitm_dsItems:j_idt')]])[2]");
	By startconsultation = By.xpath("//span[text()='Start Consultation']");	
	
	By entercomplaint = By.xpath("//div[@role='presentation']//div[@class='oj-text-field-middle']//textarea[@id='1111_1331_txtundefined|input']");
	
	By clicknext = By.xpath("(//span[contains(text(),'ext')])[1]");
	By clicknextlastpage = By.xpath("(//span[contains(text(),'ext')])[3]");
	By cardiacassess = By.xpath("//ul[@class='oj-select-choices']");
	By palpilations = By.xpath("//div[text()='palpitations']");
	By savetodrafts = By.xpath("//span[contains(text(),'Save to Draft')]");
	By clicksign = By.xpath("//span[text()='ign']");	
	
	public void recordDataSet() {
		driver.findElement(recorddataset).click();
	}
	
	public void uncheckAllergy() { 
		driver.findElement(uncheckallergy).click();
	}
	
	public void uncheckRisks() {
		driver.findElement(uncheckrisks).click();
	}
	
	public void uncheckOrders() {
		driver.findElement(uncheckorders).click();
	}
	
	public void cardioExam() {
		driver.findElement(cardioexam).click();
	}
	
	public void freeText() {
		driver.findElement(freetext).click();
	}
	
	public void startConsultation() throws InterruptedException {
		driver.findElement(startconsultation).click();
		Thread.sleep(5000);
	}
	
	public void switchToFrame1() {
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id[contains(.,'fs_pg:mfs_rg:2:dspctmb:r1:1:jwc1:dc_if1')]]"));
		driver.switchTo().frame(frame1);
	}
	
	public void enterComplaint() throws InterruptedException {
     	driver.findElement(entercomplaint).sendKeys("Fever");
	}
	
	public void clickNext() {
		driver.findElement(clicknext).click();
	}
	
	public void clickNextLastPage() {
		driver.findElement(clicknextlastpage).click();
	}
	
	public void cardiacAssess() {
		driver.findElement(cardiacassess).click();
	}
	
	public void switchToFrame2() {
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id[contains(.,'fs_pg:mfs_rg:2:dspctmb:r1:2:jwc1:dc_if1')]]"));
		driver.switchTo().frame(frame2);
	}
	
	public void selectPalpilations() {
		driver.findElement(palpilations).click();
	}
	
	public void saveToDrafts() {
		driver.findElement(savetodrafts).click();
	}
	
	public void clickSign() {
		driver.findElement(clicksign).click();
	}
	
	public void clickOkay() {
		driver.findElement(clickok).click();
	}

}
