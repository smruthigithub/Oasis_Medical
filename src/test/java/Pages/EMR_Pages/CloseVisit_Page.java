package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CloseVisit_Page {

	WebDriver driver;
	
	public CloseVisit_Page(WebDriver driver) {
		this.driver = driver;
	}

	By closevisit = By.xpath("//span[text()='Close Visit']");
	By referraloutcome = By.xpath("(//textarea[@class='x25'])[2]");
	By saveandexit = By.xpath("//span[text()='Save and Exit']");

	
	
	public void closeVisit() {
		driver.findElement(closevisit).click();
	}
	
	public void selectInPatient() throws InterruptedException {
		WebElement selectAttendance = driver.findElement(By.xpath("//select[@id[contains(.,'frm_phypatsearch:fi1:osc1:codesSelect::content')]]"));
		Select select = new Select(selectAttendance);
		select.selectByVisibleText("In-Patient");
		Thread.sleep(4000);
	}
	
	public void selectOutPatient() throws InterruptedException {
		WebElement selectAttendance = driver.findElement(By.xpath("//select[@id[contains(.,'frm_phypatsearch:fi1:osc1:codesSelect::content')]]"));
		Select select = new Select(selectAttendance);
		select.selectByVisibleText("Out-Patient");
		Thread.sleep(4000);
	}
	
	public void selectEmergency() throws InterruptedException {
		WebElement selectAttendance = driver.findElement(By.xpath("//select[@id[contains(.,'frm_phypatsearch:fi1:osc1:codesSelect::content')]]"));
		Select select = new Select(selectAttendance);
		select.selectByVisibleText("Emergency");
		Thread.sleep(4000);
	}
	
	public void dishargeCondition() throws InterruptedException {
		WebElement dishargecondition = driver.findElement(By.xpath("//select[@name='pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:r1:0:of2:or1:oc22:of12:soc6']"));
		Select select1 = new Select(dishargecondition);
		select1.selectByVisibleText("FIT TO WORK");
		Thread.sleep(2000);
	}
	
	public void dishargeTo() {
		WebElement dishargeto = driver.findElement(By.xpath("//select[@name='pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:r1:0:of2:or1:oc1:of132:smc1']"));	
		Select discharge = new Select(dishargeto);
		discharge.selectByVisibleText("Home");
	}
	
	public void referralOutcome() {
		driver.findElement(referraloutcome).sendKeys("Close Visit Notes");
	}
	
	public void saveAndExit() {
		driver.findElement(saveandexit).click();
	}
	
	

}
