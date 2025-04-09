package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab_page {
    WebDriver driver;
    WebDriverWait wait;

    public Lab_page(WebDriver driver) {
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
    By lab=By.xpath("(//input[@class='xu3'])[3]");
    By Search1 = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
    By LabName = By.xpath("//input[@name='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc5:oc6:srch_row:oc1:itmsrch:0:se_pt1:or1_srch:oc1:lb2_frm:slov_fi2:search_lov:dc_or2:dc_oc1:dc_ofi1:searchTxt']");
    By ClickSearch = By.xpath("//span[@class='xfv'][text()='Search']");
    By Ok = By.xpath("//span[@class='xfv'][text()='Ok']");
    By reason=By.xpath("(//textarea[@class='x25'])[1]");
    By Diagnosis=By.xpath("(//select[@class='x2h'])[2]");
    By AddToDrafts=By.xpath("//span[text()='Add to Drafts']");
    By SaveToDrafts=By.xpath("//span[text()='Save Drafts']");

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
    public void ClickLab() throws InterruptedException {
        driver.findElement(lab).click();
        Thread.sleep(2000);
    }
    public void SearchLab() throws InterruptedException {
        driver.findElement(Search1).click();
        Thread.sleep(2000);
    }

    public void GiveLab(String name) throws InterruptedException {
        WebElement Med = driver.findElement(LabName);
        Med.sendKeys(name);
        Thread.sleep(2000);
    }

    public void ClickOnSearch() throws InterruptedException {
        driver.findElement(ClickSearch).click();
        Thread.sleep(2000);
    }

    public void ClickOnOk() throws InterruptedException {
        driver.findElement(Ok).click();
        Thread.sleep(2000);
    }
    public void ClickOnReason(String re) throws InterruptedException {
        WebElement res= driver.findElement(reason);
        res.sendKeys(re);
        res.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnDia(String di) throws InterruptedException {
        WebElement Di= driver.findElement(Diagnosis);
        Di.sendKeys(di);
        Di.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnAdd() throws InterruptedException {
        driver.findElement(AddToDrafts).click();
        Thread.sleep(2000);
    }
    public void ClickSave() throws InterruptedException {
        driver.findElement(SaveToDrafts).click();
        Thread.sleep(2000);
    }

}
