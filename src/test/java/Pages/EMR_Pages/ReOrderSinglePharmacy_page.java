package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReOrderSinglePharmacy_page {
    WebDriver driver;
    WebDriverWait wait;

    public ReOrderSinglePharmacy_page(WebDriver driver) {
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
    By reOrder= By.xpath("(//span[text()='Reorder'])[1]");
    By diagnosis = By.xpath("(//select[@class='x2h'])[4]");
    By add=By.xpath("//span[text()='Add to Drafts']");
   // By save=By.xpath("//span[text()='Save Drafts']");
    By OverLap=By.xpath("//span[text()='Overlap']");
    By reason=By.xpath("(//select[@class='x2h'])[6]");
    By note=By.xpath("(//textarea[@class='x25'])[3]");
    By Ok=By.xpath("(//span[text()='OK'])[1]");
    By save1=By.xpath("//span[text()='Save Drafts']");


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
    public void ClickOnReorder() throws InterruptedException {
        driver.findElement(reOrder).click();
        Thread.sleep(2000);
    }
    public void ClickonDia(String di) throws InterruptedException {
        WebElement Dia= driver.findElement(diagnosis);
        Dia.sendKeys(di);
        Dia.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnAdd() throws InterruptedException {
        driver.findElement(add).click();
        Thread.sleep(2000);
    }
//    public void ClickOnSave() throws InterruptedException {
//        driver.findElement(save).click();
//        Thread.sleep(2000);
//    }
    public void Overlap() throws InterruptedException {
        driver.findElement(OverLap).click();
        Thread.sleep(2000);
    }
    public void ClickOnReason(String r) throws InterruptedException {
        WebElement re= driver.findElement(reason);
        re.sendKeys(r);
        re.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnNote(String no) throws InterruptedException {
        WebElement not= driver.findElement(note);
        not.sendKeys(no);
        not.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOk() throws InterruptedException {
        driver.findElement(Ok).click();
        Thread.sleep(2000);
    }
    public void ClickSave() throws InterruptedException {
        driver.findElement(save1).click();
        Thread.sleep(2000);
    }

}
