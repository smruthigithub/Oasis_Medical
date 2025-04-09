package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NurseTask_Page {
WebDriver driver;
	
	public NurseTask_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By clickonopenrecord = By.xpath("(//span[text()='Open Record'])[1]");
	By clickonmenu = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:ot3:b1");
	By nurseTask = By.xpath("(//span[text()='Nurse Tasks'])");
	By addnurseTask = By.xpath("//span[text()='Add Nurse Task']");
	By searchtask = By.xpath("//input[@id[contains(.,'pt_oc2:up_cnt:ntm_cnt:or3:oc1:of3:olov2:listOfValueTxt::content')]]");
	By selecttask = By.xpath("//span[text()='Elevate Bed']"); 
	By frequency = By.xpath("//input[@id[contains(.,'up_cnt:ntm_cnt:or2:oc2:of4:it11::content')]]");
	By enterevery = By.xpath("//input[@id[contains(.,'ntm_cnt:or2:oc3:of6:it12::content')]]");
	By repeat = By.xpath("//input[@id[contains(.,'ntm_cnt:or2:oc4:of7:it13::content')]]");
	By status = By.xpath("(//span[text()='Pending'])[2]");
	By editfrequency = By.xpath("//input[@id[contains(.,'up_cnt:ntm_cnt:of1:it3::content')]]");
	By editrepeat = By.xpath("//input[@id[contains(.,'up_cnt:ntm_cnt:of1:it6::content')]]");
	By clickcancel = By.xpath("//span[text()='Cancel/Discontinue ']");
	
	
	By clickondiagnosis = By.xpath("(//span[contains(text(),'Diagnosis')])[1]");
	By clickonadddiag = By.xpath("//span[contains(text(),'Add')]");
	By searchdiagnonFavrts = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:up_cnt:dtl_cnt:of1:or1:oc1:ff1:fi1:os_lst_diag:listOfValueTxt::content");
	By selectdiagnosis = By.xpath("(//li[@value='2'])[2]");
	By selectpreliminary = By.xpath("//label[text()='Preliminary' and @class='x2l']");
	By writecommentondiag = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:up_cnt:dtl_cnt:of1:or3:oc4:ofi7:it1::content");
	By rewritecomment = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:s1:diag_Insert:or2:oc14:or9:oc7:of5:it3::content");                      
	By clickonaddtosave = By.xpath("//span[contains(text(),'Add ')]");
	By clickonsavebtn = By.xpath("//span[contains(text(),'Save')]");
	By clickonsaveddiag = By.xpath("//span[text()='A01 Typhoid And Paratyphoid Fevers']");
	By clickoneditbtn = By.xpath("//span[text()='Edit']");
	By clickoncancelled = By.id("pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:cnt:pt_or1:pt_oc2:s1:diag_Insert:or2:oc14:or4:oc9:of2:sor4:_2");
	By clickdate = By.xpath("//span[@class='x43k']");
	
	
	
	public void selectAttendance() throws InterruptedException {
		WebElement selectattendance = driver.findElement(By.xpath("//select[@title='Select_All' and @class='x2h']"));		
		Select select = new Select(selectattendance);
		select.selectByVisibleText("In-Patient");
		Thread.sleep(3000);
	}
	
	public void clickonopenrecord() {
		driver.findElement(clickonopenrecord).click();
	}
	
	public void clickNurseTask() {
		driver.findElement(nurseTask).click();
	}
	
	public void addNurseTask() {
		driver.findElement(addnurseTask).click();
	}
	
	public void searchTask() {
		driver.findElement(searchtask).click();
	}
	
	public void selectTask() {
		driver.findElement(selecttask).click();
	}
	
	public void enterFrequency() {
		driver.findElement(frequency).sendKeys("1");
	}
	
	public void enterEvery() {
		driver.findElement(enterevery).sendKeys("2");
	}
	
	public void enterRepeat() {
		driver.findElement(repeat).sendKeys("3");
	}
	
	public void clickStatus() {
		driver.findElement(status).click();
	}
	
	public void editFrequency() {
		driver.findElement(editfrequency).clear();
		driver.findElement(editfrequency).sendKeys("2");
	}
	
	public void editRepeat() {
		driver.findElement(editrepeat).clear();
		driver.findElement(editrepeat).sendKeys("2");
	}
	
	public void clickCancel() {
		driver.findElement(clickcancel).click();
	}
	
	
	

}
