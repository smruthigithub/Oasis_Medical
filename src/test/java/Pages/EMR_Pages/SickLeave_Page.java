package Pages.EMR_Pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class SickLeave_Page {
    WebDriver driver;
    WebDriverWait wait;

    public SickLeave_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By clickOnMenu = By.id("pt1:OasisHedarToolBar:hamburgerBtn");
    By Physicianmenu = By.xpath("//*[@id=\"10024-E\"]/div/li/span[2]");
    By PhysicianWorklist = By.xpath("//*[@id=\"10025-T\"]/div/li/span[2]");
    By Search = By.xpath("//input[@placeholder='Search by Patient Id , MRN ,Name  ']");
    By ClickOnId = By.xpath("//span[@class='x41d oslistOfValuesUnComp x3zc'][text()='3692']");
    By OpenRecord = By.xpath("//span[@class='xfv'][text()='Open Record']");
    By PatientMenu = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:ot3:b1']");
    By SickLeave=By.xpath("//span[text()='Sick Leave']");
    By AddSickLeave=By.xpath("//span[text()='Add New Sick Leave ']");
    By SelLeaveType=By.xpath("//select[@class='x2h']");
    By FromDate =By.xpath("(//input[@class='x2b'])[1]");
    By selectcal=By.xpath("(//a[@title='Select Date'])[2]");
    By selectnextday=By.xpath("(//a[@title='Select Date'])[2]");
    By Add=By.xpath("//span[text()='Add']");
    By UserName=By.xpath("(//input[@class='x25'])[5]");
    By Password=By.xpath("(//input[@class='x25'])[6]");
    By sign=By.xpath("//span[text()='Sign ']");




    public void clickOnHamburgerMenu() throws InterruptedException {
        driver.findElement(clickOnMenu).click();
        Thread.sleep(2000);
    }

    public void ClickOnPhysicianMenu() throws InterruptedException {
        driver.findElement(Physicianmenu).click();
        Thread.sleep(2000);
    }

    public void ClickOnPhysicianWorkList() throws InterruptedException {
        driver.findElement(PhysicianWorklist).click();
        Thread.sleep(2000);
    }

    public void ClickOnSearch(String id) throws InterruptedException {
        WebElement IdNo = driver.findElement(Search);
        IdNo.sendKeys(id);
        IdNo.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void ClickOnPatientId() throws InterruptedException {
        driver.findElement(ClickOnId).click();
        Thread.sleep(2000);
    }

    public void ClickOnOpenRecord() throws InterruptedException {
        driver.findElement(OpenRecord).click();
        Thread.sleep(2000);
    }

    public void ClicKOnpatientMenu() throws InterruptedException {
        driver.findElement(PatientMenu).click();
        Thread.sleep(2000);
    }
    public void sickleave() throws InterruptedException {
        driver.findElement(SickLeave).click();
        Thread.sleep(2000);
    }
    public void adsickLeave() throws InterruptedException {
        driver.findElement(AddSickLeave).click();
        Thread.sleep(2000);
    }
    public void selLeave(String SL) throws InterruptedException {
        WebElement LeaveType = driver.findElement(SelLeaveType);
        LeaveType.sendKeys(SL);
        LeaveType.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    
    public void enterStartDate() {
		// Get current date
		Date date = new Date();
		// Format the date (optional)
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Adjust format as needed
		String formattedDate = formatter.format(date);

		WebElement startdate = driver.findElement(By.xpath("//input[@id[contains(.,'pt1-InSick:or6:pgl12_sick:or5:oc9:ff3:fi3:strt_id::content')]]"));
		startdate.clear();
		startdate.sendKeys(formattedDate);
		startdate.sendKeys(Keys.ENTER);
	}
    
    public void enterEndDate() {
		// Get current date
		Date date = new Date();
		// Format the date (optional)
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Adjust format as needed
		String formattedDate = formatter.format(date);

		WebElement enddate = driver.findElement(By.xpath("//input[@id[contains(.,'pt1-InSick:or6:pgl12_sick:or5:oc8:ff4:fi4:end_id::content')]]"));
		enddate.clear();
		enddate.sendKeys(formattedDate);
		enddate.sendKeys(Keys.ENTER);

	}
    public void FromDat(String FD) throws InterruptedException {
        WebElement FDate=driver.findElement(FromDate);
        FDate.clear();
        FDate.sendKeys(FD);
        Thread.sleep(2000);
    }
  
    public void add1() throws InterruptedException {
        driver.findElement(Add).click();
        Thread.sleep(2000);
    }
    public void userName(String Us) throws InterruptedException {
       WebElement User= driver.findElement(UserName);
       User.sendKeys(Us);
       Thread.sleep(2000);
    }
    public void password(String Ps) throws InterruptedException {
        WebElement pass= driver.findElement(Password);
        pass.sendKeys(Ps);
        Thread.sleep(2000);
    }
    public void Sign() throws InterruptedException {
        driver.findElement(sign).click();
        Thread.sleep(2000);
    }
}
