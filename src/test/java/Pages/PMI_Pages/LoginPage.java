package Pages.PMI_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class LoginPage extends BaseTest{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	By uName = By.id("it1::content");
	By pswd = By.id("it2::content");
	By lgnBtn = By.id("login");
	By alert = By.xpath("//span[contains(text(), 'Yes')]");
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	public void clickonLogin() {
		driver.findElement(lgnBtn).click();
	}
	
	public void clickonAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement confirmationDialog = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//table[@class='x1dk'])[1]")));

	    // Check if the message contains the expected text
	    String message = confirmationDialog.getText();
	    if (message.contains("OS-572 : Previous session(s) already found, Do you want to cancel it ?")) {
	    	
	      // Click "Yes" button
	      WebElement noButton = confirmationDialog.findElement(By.xpath("//span[contains(text(), 'No')]"));
	      noButton.click();
	    }
	}

}
