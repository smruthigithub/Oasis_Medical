package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OR_RequestPage {
	
	WebDriver driver;
	
	public OR_RequestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By status = By.xpath("(//span[text()='Pending'])[2]");
	By bookappt = By.xpath("//span[text()='Book Appt']");
	By clickORrequest = By.xpath("//span[text()='O.R. Request']");
	By addnewRequest = By.xpath("//span[text()='Add New Request']");
	By clickERradioBtn = By.xpath("//input[@value='0' and @id[contains(.,'pnd_req_dtl:oc4:oc6:req_inf_form:fi2:req_type_sor:_0')]]");
	By procedureIcon = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[2]");
	By selectfirstopt = By.xpath("//span[text()='1745']");
	By clickokay = By.xpath("//span[text()='Ok']");
	By clicksave = By.xpath("//span[text()='Save']");
	By duration = By.xpath("//input[@id[contains(.,'bok_reg:2:pnd_req_dtl:oc4:oc6:req_inf_form:fi7:dur_it::content')]]");
	By cancelrequest = By.xpath("//span[text()='Cancel Request']");
	By clickyesforCancel = By.xpath("(//span[text()='Yes'])[3]");
	
	
	public void clickOnStatus() {
		driver.findElement(status).click();
	}
	
	public void clickBookAppt() {
		driver.findElement(bookappt).click();
	}
	
	public void clickORRequest() {
		driver.findElement(clickORrequest).click();
	}
	
	public void addNewRequest() {
		driver.findElement(addnewRequest).click();
	}
	
	public void clickERRadioBtn() {
		driver.findElement(clickERradioBtn).click();
	}
	
	public void clickProcedureIcon() {
		driver.findElement(procedureIcon).click();
	}
	
	public void selectFirstOpt() {
		driver.findElement(selectfirstopt).click();
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();
	}
	
	public void selectOperationType() {
		WebElement selectOpType = driver.findElement(By.xpath("//select[@id[contains(.,'pnd_req_dtl:oc4:oc6:req_inf_form:fi13:oprt3d_osc:codesSelect::content')]]"));
		Select opptypedd = new Select(selectOpType);
		opptypedd.selectByVisibleText("Major");
	}
	
	public void clickSave() {
		driver.findElement(clicksave).click();
	}
	
	public void editDuration(String mins) {
		driver.findElement(duration).clear();
		driver.findElement(duration).sendKeys(mins);
	}
	
	public void cancelRequest() {
		driver.findElement(cancelrequest).click();
	}
	
	public void clickYesforCancel() {
		driver.findElement(clickyesforCancel).click();
	}

}
