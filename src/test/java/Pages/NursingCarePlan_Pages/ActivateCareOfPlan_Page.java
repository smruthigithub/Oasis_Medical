package Pages.NursingCarePlan_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActivateCareOfPlan_Page {
	
WebDriver driver;
	
	public ActivateCareOfPlan_Page(WebDriver driver) {
			this.driver = driver;
		}
	
	By inpatientworklist = By.xpath("//span[text()='Inpatient Nursing WorkList']");
	By enterpatientID = By.xpath("//input[@placeholder='Search patient mrn , id or name here...']");
	By selectpatient = By.xpath("(//a[@title='Record'])[1]");
	By clickcareplan = By.xpath("(//a[text()='Care Plan'])[12]");
	By enterdiagnosis = By.xpath("(//input[@class='x25'])[2]");
	By clickselect = By.xpath("//span[text()='Select']");
	By clickactivate = By.xpath("(//span[text()='Activate'])[1]");
	By clickevaluate = By.xpath("(//span[text()='Evaluate'])[1]");
	By clickaddBtn = By.xpath("//span[text()='Add']");
	By discontinuetask = By.xpath("(//span[text()='Discontinue'])[3]");
	By expandplan = By.xpath("(//a[@class='x23r x30z x3nx xgn p_AFTextOnly'])[1]");
	By discontinueplan = By.xpath("(//span[text()='Discontinue'])[1]");
	
	
	
	public void inPatientWorklist() {
		driver.findElement(inpatientworklist).click();
	}
	
	public void enterPatientID(String patientid) {
		driver.findElement(enterpatientID).sendKeys(patientid);
	}
	
	public void selectPatient() {
		driver.findElement(selectpatient).click();
	}
	
	public void clickCarePlan() {
		driver.findElement(clickcareplan).click();
	}
	
	public void enterDiagnosis(String diagnosis) {
		driver.findElement(enterdiagnosis).sendKeys(diagnosis);
		driver.findElement(enterdiagnosis).sendKeys(Keys.ENTER);
	}
	
	public void clickSelect() {
		driver.findElement(clickselect).click();
	}
	
	public void clickActivatePlan() {
		driver.findElement(clickactivate).click();
	}
	
	public void clickEvaluate() {
		driver.findElement(clickevaluate).click();
	}
	
	public void selectEvaluation () {
		WebElement evaluate = driver.findElement(By.xpath("(//select[@class='x2h'])[1]"));
		Select progress = new Select(evaluate);
		progress.selectByValue("2");
	}
	
	public void enterEvaluateNotes(String notes) {
		driver.findElement(enterdiagnosis).sendKeys(notes);
	}
	
	public void clickAddBtn() {
		driver.findElement(clickaddBtn).click();
	}
	
	public void expandPlan() {
		driver.findElement(expandplan).click();
	}
	
	public void discontinueTask() {
		driver.findElement(discontinuetask).click();
	}
	
	public void discontinuePlan() {
		driver.findElement(discontinueplan).click();
	}

}
