package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TeamCollaboration_Page {
WebDriver driver;
	
	public TeamCollaboration_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By teamCollaboration = By.xpath("//span[text()='Team Collaboration']");
	By addTask = By.xpath("//span[text()='Add Task']");
	By clickpatient = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:tts_cnt:pt_or1:pt_oc1:rd_cnt:pt1:t1:0:c2");
	By cleartext = By.xpath("//textarea[@id='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:tts_cnt:pt_or1:pt_oc2:up_cnt:pt1:of1:it15::content']");
	By textAreaEdit = By.xpath("//textarea[@id[contains(.,'pt_or1:pt_oc2:up_cnt:pt1:of1:it15::content')]]");
	By clickcancelled = By.xpath("//label[text()='Cancelled']");
	
	
	public void clickTeamCollaboration() {
		driver.findElement(teamCollaboration).click();
	}
	
	public void clickAddTask() {
		driver.findElement(addTask).click();
	}
	
	public void enterTextArea() throws InterruptedException {
		WebElement textArea = driver.findElement(By.xpath("//textarea[@id[contains(.,'pt_or1:pt_oc2:up_cnt:pt1:of1:it1::content')]]"));
		textArea.sendKeys("First Patient");
		Thread.sleep(2000);
	}
	
	public void clickPatient() {
		driver.findElement(clickpatient).click();
	}
	
	public void clearText() {
		driver.findElement(cleartext).clear();
	}
	
	public void editTextArea() {
		driver.findElement(textAreaEdit).sendKeys("Second Patient");
	}
	
	public void clickCancelled() {
		driver.findElement(clickcancelled).click();
	}

}
