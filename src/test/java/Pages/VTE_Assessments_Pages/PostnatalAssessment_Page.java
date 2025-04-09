package Pages.VTE_Assessments_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostnatalAssessment_Page {
	
WebDriver driver;
	
	public PostnatalAssessment_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By newvtepostnatal = By.xpath("//span[text()='New VTE postnatal assessment ']");
	By highriskcheckbox = By.xpath("(//input[@class='xu4'])[25]");
	
	
	public void clickNewVTEPostnatal() {
		driver.findElement(newvtepostnatal).click();
	}
	
	public void clickHighRiskBox() {
		driver.findElement(highriskcheckbox).click();
	}

}


