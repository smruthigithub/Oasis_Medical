package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IVOrder_page {
    WebDriver driver;
    WebDriverWait wait;

    public IVOrder_page(WebDriver driver) {
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
    By Order = By.xpath("//span[@class='x17w'][text()='Order Management']");
    By Search1 = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
    By OrderName = By.xpath("//input[@name='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc5:oc6:srch_row:oc1:itmsrch:0:se_pt1:or1_srch:oc1:lb2_frm:slov_fi2:search_lov:dc_or2:dc_oc1:dc_ofi1:searchTxt']");
    By ClickSearch = By.xpath("//span[@class='xfv'][text()='Search']");
    By Iv=By.xpath("//span[contains(text(),'Iv')]");
    By Ok = By.xpath("//span[@class='xfv'][text()='Ok']");
    By Diluent=By.xpath("(//select[@class='x2h'])[6]");
    By Frequency=By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[2]");
    By GiveGFre=By.xpath("(//input[@class='x25'])[8]");
    By SearchFre=By.xpath("//span[text()='Search']");
    By repeat = By.xpath("//input[@id[contains(.,'iv_reg:0:pt1:or1:oc1:miv_frm:inf_sec:fi12:i_d_occ::content')]]");
    
    
    
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

    public void ClickOnOrderManagement() throws InterruptedException {
        driver.findElement(Order).click();
        Thread.sleep(2000);
    }
    public void ClkSearch() throws InterruptedException {
        driver.findElement(Search1).click();
        Thread.sleep(2000);
    }
    public void GiveOrderName(String or) throws InterruptedException {
        WebElement ord= driver.findElement(OrderName);
        ord.sendKeys(or);
        ord.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickSearch() throws InterruptedException {
        driver.findElement(ClickSearch).click();
        Thread.sleep(2000);
    }
    public void ClickIv() throws InterruptedException {
        driver.findElement(Iv).click();
        Thread.sleep(2000);
    }
    public void ClickOk() throws InterruptedException {
        driver.findElement(Ok).click();
        Thread.sleep(2000);
    }
    public void ClickDiluent() throws InterruptedException {
        WebElement Di= driver.findElement(Diluent);
     //   Di.sendKeys(dil);
        Di.sendKeys(Keys.ARROW_DOWN);
        Di.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    
    public void clickFrequIcon() throws InterruptedException {
        driver.findElement(Frequency).click();
        Thread.sleep(2000);
    }
    
    public void selectElectrolyte() {
		WebElement selecteloctrolyte = driver.findElement(By.xpath("//select[@id[contains(.,'iv_reg:0:pt1:or1:oc1:miv_frm:ivmainfg:elc_flex:soc3::content')]]"));
		Select allergy = new Select(selecteloctrolyte);
		allergy.selectByValue("0");
	}
    
    public void enterRepeat() throws InterruptedException {
        driver.findElement(repeat).sendKeys("3");
        Thread.sleep(2000);
    }

}
