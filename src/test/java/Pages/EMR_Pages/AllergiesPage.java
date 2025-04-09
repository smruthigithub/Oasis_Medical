package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllergiesPage {
	WebDriver driver;
	
	public AllergiesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By clickonallergies = By.xpath("//span[contains(text(),'Allergies')]");
	By clickonrecordallergy = By.xpath("//span[contains(text(),'Record Allergy')]");
	By searchsubstanceicon = By.xpath("//a[@title='Search: Substance']");
	By entersubstance = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:s2:pt1:of1:substanceId_afrLovInternalQueryId:val00::content");
	By clickonsearchsubstance = By.xpath("//span[contains(text(),'Search')]");
	By selectsubstance = By.xpath("//tr[@_afrrk='2']");
	By clickoksubstance = By.xpath("(//span[contains(text(),'OK')])[1]");
	By selectreaction = By.xpath("//label[text()='Difficulty Swallowing']");
	By selectdiarrhea = By.xpath("//label[text()='Diarrhea']");
	By removeallergy = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc1:rd_cnt:pt1:t1:1:soc1::content");
	By clickonremovebtn = By.xpath("//span[contains(text(),'Remove')]");
	By recordnkda = By.xpath("//span[contains(text(),'Record NKDA')]");
	By clickokay = By.xpath("//span[text()='OK']");
	//Bed Transfer module
	//By firstPatient = By.xpath("(//span[contains(text(), 'Admitted')])[1]");

//	public void clickOnPatient() {
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement firstPatient = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(), 'Admitted')])[1]")));
//		firstPatient.click();		
//	}
	
	
	public void clickOnAllergies() {
		driver.findElement(clickonallergies).click();
	}
	
	public void clickOnRecordAllergies() {
		driver.findElement(clickonrecordallergy).click();
	}
	
	public void selectDrugAllergy() {
		WebElement selectcategry = driver.findElement(By.xpath("//select[@title='Select Allergy Category']"));
		Select allergy = new Select(selectcategry);
		allergy.selectByValue("1");
	}
	
	public void selectFoodAllergy() {
		WebElement selectcategry = driver.findElement(By.xpath("//select[@title='Select Allergy Category']"));
		Select allergy = new Select(selectcategry);
		allergy.selectByValue("2");
	}
	
	public void selectOtherAllergy() {
		WebElement selectcategry = driver.findElement(By.xpath("//select[@title='Select Allergy Category']"));
		Select allergy = new Select(selectcategry);
		allergy.selectByValue("3");
	}
	
	public void selectHighSeverity() {
		WebElement selectseverity = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select severity = new Select(selectseverity);
		severity.selectByVisibleText("High");
	}
	
	public void selectMildSeverity() {
		WebElement selectseverity = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select severity = new Select(selectseverity);
		severity.selectByVisibleText("Mild");
	}
	
	public void searchSubstanceIcon() {
		driver.findElement(searchsubstanceicon).click();
	}
	
	public void enterSubstance(String substance) {
		driver.findElement(entersubstance).sendKeys(substance);
	}

	public void clickOnSearchBtn() {
		driver.findElement(clickonsearchsubstance).click();
	}
	
	public void selectDrugSubstance() {
		driver.findElement(selectsubstance).click();
	}
	
	public void clickOnOkSubstance() {
		driver.findElement(clickoksubstance).click();
	}
	
	public void selectReaction() {
		driver.findElement(selectreaction).click();
	}
	
	//Food Allergy
	public void selectFoodSubstance() {
		WebElement foodsubs = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select food = new Select(foodsubs);
		food.selectByValue("3");
	}
	
	public void selectDiarrhea() {
		driver.findElement(selectdiarrhea).click();
	}
	
	public void selectOtherSubstance() {
		WebElement selectothersubs = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select othersubs = new Select(selectothersubs);
		othersubs.selectByValue("5");
	}
	
	public void removeAllergy() {
		driver.findElement(removeallergy).click();
	}
	
	public void clickOnRemoveBtn() {
		driver.findElement(clickonremovebtn).click();
	}
	
	public void clickOnRecordNKDA() {
		driver.findElement(recordnkda).click();
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();
	}
}

