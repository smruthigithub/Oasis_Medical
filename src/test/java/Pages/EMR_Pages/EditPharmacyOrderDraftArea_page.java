package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditPharmacyOrderDraftArea_page {
    WebDriver driver;
    WebDriverWait wait;

    public EditPharmacyOrderDraftArea_page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By clickOnMenu = By.id("pt1:OasisHedarToolBar:hamburgerBtn");
    By Physicianmenu = By.xpath("//*[@id=\"10024-E\"]/div/li/span[2]");
    By PhysicianWorklist = By.xpath("//*[@id=\"10025-T\"]/div/li/span[2]");
    By Search = By.xpath("//input[@placeholder='Search by Patient Id , MRN ,Name  ']");
    By ClickOnId = By.xpath("//span[@class='x41d oslistOfValuesUnComp x3zc'][text()='1001']");
    By OpenRecord = By.xpath("//span[@class='xfv'][text()='Open Record']");
    By PatientMenu = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:ot3:b1']");
    By Order = By.xpath("//span[@class='x17w'][text()='Order Management']");
    By Medication=By.xpath("(//input[@clASS='xu3'])[4]");
    By ClickSearch=By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
    By searchMed=By.xpath("(//input[@class='x25'])[2]");
    By ClickSrch=By.xpath("//span[text()='Search']");
    By Ok=By.xpath("//span[text()='Ok']");
    By Repeat=By.xpath("(//input[@class='x25'])[3]");
    By addToDrafts=By.xpath("//span[text()='Add to Drafts']");




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
    public void ClickOnMedication() throws InterruptedException {
        driver.findElement(Medication).click();
        Thread.sleep(2000);
    }
    public void ClicksSearchIcon() throws InterruptedException {
        driver.findElement(ClickSearch).click();
        Thread.sleep(2000);
    }
    public void enterItem() throws InterruptedException {
        driver.findElement(searchMed).sendKeys("FEVADOL 100MG SUPPOSITORY");
        driver.findElement(searchMed).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    
    public void clickOkay() throws InterruptedException {
        driver.findElement(Ok).click();
        Thread.sleep(2000);
    }
    
    public void enterRepeat() throws InterruptedException {
        driver.findElement(Repeat).sendKeys("3");
        Thread.sleep(2000);
    }
    
    public void clickAddToDrafts() throws InterruptedException {
        driver.findElement(addToDrafts).click();
        Thread.sleep(2000);
    }
}
