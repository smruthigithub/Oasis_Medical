package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PharmacyBatchReorder_page {
    WebDriver driver;
    WebDriverWait wait;

    public PharmacyBatchReorder_page(WebDriver driver) {
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
    By PharmacyBatch=By.xpath("//span[text()='Pharmacy Batch Re-Order']");
    By order=By.xpath("(//span[text()='Order'])[2]");
    By route=By.xpath("(//select[@class='x2h'])[2]");
    By diagnosis=By.xpath("(//select[@class='x2h'])[4]");
    By add=By.xpath("//span[text()='Add to Draft']");
    By save=By.xpath("//span[text()='Save Drafts']");


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
    public void ClickOnPharmacyBatchReorder() throws InterruptedException {
        driver.findElement(PharmacyBatch).click();
        Thread.sleep(2000);
    }
    public void ClickOnOrder() throws InterruptedException {
        driver.findElement(order).click();
        Thread.sleep(2000);
    }
    public void ClickOnRoute( String re) throws InterruptedException {
        WebElement Route= driver.findElement(route);
        Route.sendKeys(re);
        Route.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnDiagnosis(String di) throws InterruptedException {
        WebElement dia= driver.findElement(diagnosis);
        dia.sendKeys(di);
        dia.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnAdd() throws InterruptedException {
        driver.findElement(add).click();
        Thread.sleep(2000);
    }
    public void ClickOnSave() throws InterruptedException {
        driver.findElement(save).click();
        Thread.sleep(2000);
    }
}
