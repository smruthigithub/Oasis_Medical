package Pages.EMR_Pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.domsnapshot.model.StringIndex;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pharmacyorder_page {
    WebDriver driver;
    WebDriverWait wait;

    public Pharmacyorder_page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By clickOnMenu = By.id("pt1:OasisHedarToolBar:hamburgerBtn");
    By Physicianmenu = By.xpath("//*[@id=\"10024-E\"]/div/li/span[2]");
    By PhysicianWorklist = By.xpath("//*[@id=\"10025-T\"]/div/li/span[2]");
    By Search = By.xpath("//input[@placeholder='Search by Patient Id , MRN ,Name  ']");
    By ClickOnId = By.xpath("//span[@class='x41d oslistOfValuesUnComp x3zc'][text()='3692']");
    By OpenRecord = By.xpath("(//span[@class='xfv'][text()='Open Record'])[1]");
    By PatientMenu = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:ot3:b1']");
    By Order = By.xpath("//span[@class='x17w'][text()='Order Management']");
    By Medication = By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc5:oc6:srch_row:oc1:itmsrch:0:se_pt1:or1_srch:oc1:lb2_frm:fi1:sor1:_3']");
    By Search1 = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[1]");
    By MedicineName = By.xpath("//input[@name='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc5:oc6:srch_row:oc1:itmsrch:0:se_pt1:or1_srch:oc1:lb2_frm:slov_fi2:search_lov:dc_or2:dc_oc1:dc_ofi1:searchTxt']");
    By ClickSearch = By.xpath("//span[@class='xfv'][text()='Search']");
    By Ok = By.xpath("//span[@class='xfv'][text()='Ok']");
    By Quantity1 = By.xpath("//input[@name='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc5:oc6:det_row:oc2:itm_det:0:rm_reg:0:med_pg:or1_data:oc1:dose_crd:ff1:fi1:it1']");
    By Unit = By.xpath("//select[@name='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc5:oc6:det_row:oc2:itm_det:0:rm_reg:0:med_pg:or1_data:oc1:dose_crd:ff1:fi2:soc1']");
   // By Add = By.xpath("//span[text()='Add to Drafts']");
    By Frequency = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[2]");
    By SearchFreq = By.xpath("(//input[@class='x25'])[4]");
    By Search3 = By.xpath("//span[text()='Search']");
    By ok = By.xpath("//span[text()='Ok']");
    By Repeat = By.xpath("(//input[@class='x25'])[3]");
    By TotalFre = By.xpath("(//input[@class='x25'])[4]");
    By diagnosis = By.xpath("(//select[@class='x2h'])[4]");
    By AddToDrafts = By.xpath("//span[text()='Add to Drafts']");
    By From = By.xpath("(//select[@class='x2h'])[1]");
    By Route = By.xpath("(//input[@class='x25'])[3]");
    By Save = By.xpath("//span[text()='Save Drafts']");
    By clickcncl = By.xpath("//div[@id[contains(.,'ord_hist:oc8:histrgn:2:omh_or1:oc1:oc3:or2:oc5:omh_tab:0:b5')]]");
                             //div[@id[contains(.,'ord_hist:oc8:histrgn:0:omh_or1:oc1:oc3:or2:oc5:omh_tab:0:b5')]]
    By Cancel = By.xpath("(//td[text()='Cancel Order'])[1]");
    By yes = By.xpath("(//span[text()='Yes'])[4]");
    By reason = By.xpath("//textarea[@id='pt1:contrRg:0:CntRgn:2:fs_pg:mfs_rg:1:or3:oc4:oc7:ord_hist:oc8:histrgn:2:omh_or1:oc2:or9:oc12:ff11:fi13:it4::content']");
    By save = By.xpath("//span[text()='Save']");



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

    public void SearchMedication() throws InterruptedException {
        driver.findElement(Search1).click();
        Thread.sleep(2000);
    }

    public void GiveMedication(String name) throws InterruptedException {
        WebElement Med = driver.findElement(MedicineName);
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

    public void GiveQuantity(String Qty) throws InterruptedException {
        WebElement Quantity = driver.findElement(Quantity1);
        Quantity.sendKeys(Qty);
        Quantity.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void GiveUnit(String Uni) throws InterruptedException {
        WebElement Un = driver.findElement(Unit);
        Un.sendKeys(Uni);
        Un.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void Searchfrequency() throws InterruptedException {
        driver.findElement(Frequency).click();
        Thread.sleep(2000);
    }

    public void GiveFrequency(String Fre) throws InterruptedException {
        WebElement Frq = driver.findElement(SearchFreq);
        Frq.sendKeys(Fre);
        Frq.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void Search2() throws InterruptedException {
        driver.findElement(Search3).click();
        Thread.sleep(2000);
    }

    public void Ok1() throws InterruptedException {
        driver.findElement(ok).click();
        Thread.sleep(2000);
    }

    public void GiveRepeat(String re) throws InterruptedException {
        WebElement Rep = driver.findElement(Repeat);
        Rep.sendKeys(re);
        Rep.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void GiveTotalFre(String ttl) throws InterruptedException {
        WebElement ttlFre = driver.findElement(TotalFre);
        ttlFre.sendKeys(ttl);
        ttlFre.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void GiveDiagnosis(String dia) throws InterruptedException {
        WebElement Dia = driver.findElement(diagnosis);
        Dia.sendKeys(dia);
        Dia.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

//    public void GiveFrom(String fr) throws InterruptedException {
//        WebElement frm= driver.findElement(From);
//        frm.sendKeys(fr);
//        frm.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//    }
//    public void GiveRoute(String Rte) throws InterruptedException {
//        WebElement route= driver.findElement(Route);
//        route.sendKeys(Rte);
//        route.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//    }
    public void ClickOnAddToDrafts() throws InterruptedException {
        driver.findElement(AddToDrafts).click();
        Thread.sleep(2000);
    }
    public void ClickOnSave() throws InterruptedException {
        driver.findElement(Save).click();
        Thread.sleep(2000);
    }
    public void clickonMenu() throws InterruptedException {
        driver.findElement(clickcncl).click();
        Thread.sleep(2000);
    }
    public void ClickOnCancel() throws InterruptedException {
        driver.findElement(Cancel).click();
        Thread.sleep(20000);
    }
    public void ClickOnYes() throws InterruptedException {
        driver.findElement(yes).click();
        Thread.sleep(2000);
    }
    public void CancelReason(String rea) throws InterruptedException {
        WebElement res= driver.findElement(reason);
        res.sendKeys(rea);
        res.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void ClickSave() throws InterruptedException {
        driver.findElement(save).click();
        Thread.sleep(2000);
    }
}