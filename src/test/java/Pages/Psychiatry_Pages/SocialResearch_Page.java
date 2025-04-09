package Pages.Psychiatry_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SocialResearch_Page {

	WebDriver driver;

	public  SocialResearch_Page(WebDriver driver) {
		this.driver = driver;
	}

	By socialresearch = By.xpath("//a[text()='Social Research']");
	By socialworklist = By.xpath("//span[text()='Social Worklist']");
	By clicksearch = By.xpath("//span[text()='Search']");
	By patientresearch = By.xpath("//a[text()='Patient Research']");
	By stafficon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[4]");
	By clickokay = By.xpath("(//span[text()='Ok'])[1]");
	By enterdirections = By.xpath("(//textarea[@class='x25'])[2]");
	By familyresearch = By.xpath("//a[text()='Family Research']");
	By specialisticon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[3]");
	
	
	public void clickSocialResearch() {
		driver.findElement(socialresearch).click();		
	}
	
	public void clickSocialWorklist() {
		driver.findElement(socialworklist).click();		
	}
	
	public void clickSearch() {
		driver.findElement(clicksearch).click();		
	}
	
	public void clickPatientResearch() {
		driver.findElement(patientresearch).click();		
	}
	
	public void clickStaffIcon() {
		driver.findElement(stafficon).click();		
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();		
	}
	
	public void selectStatus() {
		WebElement status = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select type = new Select(status);
		type.selectByValue("A");
	}
	
	public void enterDirections(String result) {
		driver.findElement(enterdirections).sendKeys(result);
	}
	
	public void clickFamilyResearch() {
		driver.findElement(familyresearch).click();		
	}
	
	public void selectAidRequester() {
		WebElement housing = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select type = new Select(housing);
		type.selectByValue("1");
	}
	
	public void selectCurrentHousing() {
		WebElement housing = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select type = new Select(housing);
		type.selectByValue("1");
	}
	
	public void selectHousingProperty() {
		WebElement housing = driver.findElement(By.xpath("(//select[@class='x2h'])[4]"));
		Select type = new Select(housing);
		type.selectByValue("1");
	}
	
	public void selectHousingType() {
		WebElement housing = driver.findElement(By.xpath("(//select[@class='x2h'])[5]"));
		Select type = new Select(housing);
		type.selectByValue("2");
	}
	
	public void selectSource() {
		WebElement housing = driver.findElement(By.xpath("(//select[@class='x2h'])[6]"));
		Select type = new Select(housing);
		type.selectByValue("3");
	}
	
	public void selectUrgentAid() {
		WebElement housing = driver.findElement(By.xpath("(//select[@class='x2h'])[7]"));
		Select type = new Select(housing);
		type.selectByValue("1");
	}
	
	public void clickSpecialistIcon() {
		driver.findElement(specialisticon).click();		
	}
}
