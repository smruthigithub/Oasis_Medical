package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LabFromPalette_page {
    WebDriver driver;
    WebDriverWait wait;

    public LabFromPalette_page(WebDriver driver) {
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
    By LabPalette=By.xpath("//span[text()='Lab Palette Orders']");
    By reason=By.xpath("(//textarea[@class='x25'])[1]");
    By Diagnosis=By.xpath("(//select[@class='x2h'])[2]");
    By Laboratory=By.xpath("//span[text()='Laboratory  -  المختبر']");
    By Chemistry=By.xpath("//span[text()='- Chemistry  -  الكيمياء']");
    By Electrolyte=By.xpath("(//a[@class='x23r x3nt x312 x3kp xgn p_AFTextOnly'])[53]");
    By Save=By.xpath("//span[text()='Save Drafts']");

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

    public void ClickOnLabPalette() throws InterruptedException {
        driver.findElement(LabPalette).click();
        Thread.sleep(2000);
    }
    public void ClickOnReason (String re) throws InterruptedException {
            WebElement res= driver.findElement(reason);
            res.sendKeys(re);
            res.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
    }
    public void ClickOndDia(String d) throws InterruptedException {
        WebElement di= driver.findElement(Diagnosis);
        di.sendKeys(d);
        di.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickOnLab() throws InterruptedException {
        driver.findElement(Laboratory).click();
        Thread.sleep(2000);
    }
    public void ClickOnChemistry() throws InterruptedException {
        driver.findElement(Chemistry).click();
        Thread.sleep(2000);
    }
    public void ClickOnElectrolyte() throws InterruptedException {
        driver.findElement(Electrolyte).click();
        Thread.sleep(2000);
    }
    public void ClickOnSave() throws InterruptedException {
        driver.findElement(Save).click();
        Thread.sleep(2000);
    }
}
