package Pages.NursingCarePlan_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BuildingCareOfPlan_Page {
	
WebDriver driver;
	
	public BuildingCareOfPlan_Page(WebDriver driver) {
			this.driver = driver;
		}
	
	By nursingcareplan = By.xpath("//span[text()='Nursing Care Plan']");
	By activefilter = By.xpath("(//span[text()='Active'])[1]");
	By inactivefilter = By.xpath("(//span[text()='Inactive'])[1]");
	By allfilter = By.xpath("(//span[text()='All'])[1]");
	By newcareplan = By.xpath("//div[@class='x3n0 xfl p_AFTextOnly']");
	By diagnosisstatement = By.xpath("(//textarea[@class='x25'])[1]");
	By enterrelatedto = By.xpath("(//textarea[@class='x25'])[2]");
	By evidencedby = By.xpath("(//textarea[@class='x25'])[3]");
	By enterrationale = By.xpath("(//textarea[@class='x25'])[4]");
	By clickactiveboxgoal = By.xpath("(//input[@class='xu4'])[2]");
	By clickaddgoal = By.xpath("(//span[text()='Add'])[1]");
	By selecttaskicon = By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
	By clickoktask = By.xpath("//span[text()='Ok']");
	By entertimes = By.xpath("(//input[@class='x25'])[4]");
	By enterevery = By.xpath("(//input[@class='x25'])[5]");
	By enterrepeat = By.xpath("(//input[@class='x25'])[6]");
	By enternotes = By.xpath("(//input[@class='x25'])[7]");
	By clickactiveboxinterv = By.xpath("(//input[@class='xu4'])[4]");
	By clickaddinterv = By.xpath("(//span[text()='Add'])[2]");
	By clickactiveboxgoal2 = By.xpath("(//input[@class='xu4'])[3]");
	By selectsecondgoal = By.xpath("(//span[@class='x1u p_AFReadOnly'])[3]");
	By selecttask2 = By.xpath("//tr[@_afrrk='3']");
	By clickactiveboxinterv2 = By.xpath("(//input[@class='xu4'])[5]");
	By clicksavebtn = By.xpath("//span[text()='Save']");
	By removegoal = By.xpath("(//span[text()='Remove'])[2]");
	By clickactivecheckbox = By.xpath("(//input[@class='xu4'])[1]");
	By clickdetails = By.xpath("(//span[text()='Details'])[5]");
	By removeinterv = By.xpath("(//span[text()='Remove'])[3]");
	
	
	public void clickNursingCarePlan() {
		driver.findElement(nursingcareplan).click();
	}
	
	public void clickActiveFilter() {
		driver.findElement(activefilter).click();
	}
	
	public void clickInactiveFilter() {
		driver.findElement(inactivefilter).click();
	}
	
	public void clickAllFilter() {
		driver.findElement(allfilter).click();
	}
	
	public void clickNewCarePlan() {
		driver.findElement(newcareplan).click();
	}
	
	public void enterDiagnosisStatement(String statement1) {
		driver.findElement(diagnosisstatement).sendKeys(statement1);
	}
	
	public void enterRelatedTo(String statement2) {
		driver.findElement(enterrelatedto).sendKeys(statement2);
	}
	
	public void enterEvidencedBy(String statement3) {
		driver.findElement(evidencedby).sendKeys(statement3);
	}
	
	public void enterRationale(String statement4) {
		driver.findElement(enterrationale).sendKeys(statement4);
	}
	
	public void selectPriority () {
		WebElement priority = driver.findElement(By.xpath("(//select[@class='x2h'])[1]"));
		Select selecthigh = new Select(priority);
		selecthigh.selectByValue("0");
	}
	
	public void clickActiveBoxGoal() {
		driver.findElement(clickactiveboxgoal).click();
	}
	
	public void clickAddGoal() {
		driver.findElement(clickaddgoal).click();
	}
	
	public void selectTaskIcon() {
		driver.findElement(selecttaskicon).click();
	}
	
	public void clickOkTask() {
		driver.findElement(clickoktask).click();
	}
	
	public void enterTimes(String times) {
		driver.findElement(entertimes).sendKeys(times);
	}
	
	public void enterEvery(String every) {
		driver.findElement(enterevery).sendKeys(every);
	}
	
	public void enterRepeat(String repeat) {
		driver.findElement(enterrepeat).sendKeys(repeat);
	}
	
	public void enterNotes(String notes) {
		driver.findElement(enternotes).sendKeys(notes);
	}
	
	public void clickActiveIntervention() {
		driver.findElement(clickactiveboxinterv).click();
	}
	
	public void clickAddIntervention() {
		driver.findElement(clickaddinterv).click();
	}
	
	public void clickActiveBoxGoal2() {
		driver.findElement(clickactiveboxgoal2).click();
	}
	
	public void selectSecondGoal() {
		driver.findElement(selectsecondgoal).click();
	}
	
	public void selectTask2() {
		driver.findElement(selecttask2).click();
	}
	
	public void clickActiveIntervention2() {
		driver.findElement(clickactiveboxinterv2).click();
	}
	
	public void clickSaveBtn() {
		driver.findElement(clicksavebtn).click();
	}
	
	public void clickRemoveGoal() {
		driver.findElement(removegoal).click();
	}
	
	public void clickActiveCheckBox() {
		driver.findElement(clickactivecheckbox).click();
	}
	
	public void clickDetails() {
		driver.findElement(clickdetails).click();
	}

	public void clickRemoveIntervention() {
		driver.findElement(removeinterv).click();
	}
}
