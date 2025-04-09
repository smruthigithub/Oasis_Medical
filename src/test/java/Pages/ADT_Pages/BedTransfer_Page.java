package Pages.ADT_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BedTransfer_Page {
WebDriver driver;
	
	public BedTransfer_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbedtrasfer = By.xpath("//input[@id='search|input']");
	By selectbedtrasfer = By.xpath("(//span[text()='Patient Bed Transfer'])[1]");
	By clickonbeds = By.xpath("//span[text()='On Beds']");
	By firstpatient = By.xpath("(//span[contains(text(), 'Admitted')])[1]");
	By clickbedtransfer = By.xpath("//span[text()='Bed Transfer']");
	By selectward = By.xpath("//li[text()='tee']");
	By selectbedclass = By.xpath("//li[text()='Icu']");
	By selectroombed = By.xpath("(//li[contains(text(), 'teeroom')])[1]");
	By clicksave = By.xpath("//span[text()='Save']");
	
	
	public void searchBedTransfer(String bed) {
		driver.findElement(searchbedtrasfer).sendKeys(bed);
	}
	
	public void selectBedTransfer() {
		driver.findElement(selectbedtrasfer).click();
	}
	
	public void clickOnBeds() {
		driver.findElement(clickonbeds).click();
	}
	
	public void clickFirstPatient() {
		driver.findElement(firstpatient).click();
	}
	
	public void clickBedTransfer() {
		driver.findElement(clickbedtransfer).click();
	}
	
	public void selectWard() {
		driver.findElement(selectward).click();
	}
	
	public void selectBedClass() {
		driver.findElement(selectbedclass).click();
	}
	
	public void selectRoomBed() {
		driver.findElement(selectroombed).click();
	}
	
	public void clickSave() {
		driver.findElement(clicksave).click();
	}

}
