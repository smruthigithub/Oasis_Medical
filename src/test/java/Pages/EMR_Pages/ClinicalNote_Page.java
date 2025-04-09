package Pages.EMR_Pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClinicalNote_Page {
    WebDriver driver;
    WebDriverWait wait;

    public ClinicalNote_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By clickOnMenu = By.id("pt1:OasisHedarToolBar:hamburgerBtn");
    By Physicianmenu = By.xpath("//*[@id=\"10024-E\"]/div/li/span[2]");
    By PhysicianWorklist = By.xpath("//*[@id=\"10025-T\"]/div/li/span[2]");
    By Search = By.xpath("//input[@placeholder='Search by Patient Id , MRN ,Name  ']");
    By ClickOnId = By.xpath("//span[@class='x41d oslistOfValuesUnComp x3zc'][text()='3692']");
    By clickcancel = By.xpath("(//span[text()='Cancel'])[1]");
    By OpenRecord = By.xpath("//span[@class='xfv'][text()='Open Record']");
    By openRecord2 = By.xpath("(//span[@class='xfv'][text()='Open Record'])[2]");
    By PatientMenu = By.xpath("//div[@id[contains(.,'fs_pg:ot3:r1:bsc_inf:ot3:b1')]]");
    By ClinicalNote = By.xpath("//span[text()='Clinical Notes']");
    By NoteType = By.xpath("(//a[@class='x18j'])[1]");
    By SelectAll = By.xpath("(//input[@class='x18r'])[3]");
    By Speciality = By.xpath("(//a[@class='x18j'])[2]");
    By allSelect = By.xpath("(//input[@class='x18r'])[28]");
    By AddNewNote = By.xpath("//span[text()='Add New Note']");
    By NoteType2 = By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
    By TextBox = By.xpath("(//input[@class='x25'])[2]");
    By Search2 = By.xpath("//span[text()='Search']");
    By Ok = By.xpath("//span[text()='Ok']");
    By Note = By.xpath("//textarea[@class='x25']");
    By Save = By.xpath("//span[text()='Save Changes']");
    By Edit = By.xpath("//span[text()='Edit']");
    By Note2 = By.xpath("//textarea[@class='x25']");
    By Save2 = By.xpath("//span[text()='Save Changes']");
    By Delete = By.xpath("//span[text()='Delete']");
    By DeleteReason = By.xpath("(//textarea[@class='x25'])[2]");
    By ok = By.xpath("(//span[text()='OK'])[1]");
    By Close = By.xpath("//span[text()='Close']");

    // SICK LEAVE
    By PatientMenu2 = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:fs_pg:ot3:r1:bsc_inf:ot3:b1']");


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
    
    public void ClickOnOpenRecord2() throws InterruptedException {
        driver.findElement(openRecord2).click();
        Thread.sleep(2000);
    }
    
    public void clickonCancel() throws InterruptedException {
        driver.findElement(clickcancel).click();
        Thread.sleep(2000);        
    }


    public void ClicKOnpatientMenu() throws InterruptedException {
        driver.findElement(PatientMenu).click();
        Thread.sleep(2000);
    }

    public void ClickOnClinicalNote() throws InterruptedException {
        driver.findElement(ClinicalNote).click();
        Thread.sleep(2000);
    }

    public void noteType() throws InterruptedException {
        driver.findElement(NoteType).click();
        Thread.sleep(2000);
    }

    public void selectAll() throws InterruptedException {
        driver.findElement(SelectAll).click();
        Thread.sleep(2000);
    }

    public void speciality() throws InterruptedException {
        driver.findElement(Speciality).click();
        Thread.sleep(3000);
    }

    public void All() throws InterruptedException {
        driver.findElement(allSelect).click();
        Thread.sleep(2000);
    }

    public void NewNote() throws InterruptedException {
        driver.findElement(AddNewNote).click();
        Thread.sleep(2000);
    }

    public void note2() throws InterruptedException {
        driver.findElement(NoteType2).click();
        Thread.sleep(2000);
    }

    public void Text(String t) throws InterruptedException {
        WebElement tx = driver.findElement(TextBox);
        tx.sendKeys(t);
        Thread.sleep(2000);
    }

    public void srch() throws InterruptedException {
        driver.findElement(Search2).click();
        Thread.sleep(2000);
    }

    public void ok() throws InterruptedException {
        driver.findElement(Ok).click();
        Thread.sleep(2000);
    }

    public void note(String n) throws InterruptedException {
        WebElement nt = driver.findElement(Note);
        nt.sendKeys(n);
        Thread.sleep(2000);
    }

    public void sav() throws InterruptedException {
        driver.findElement(Save).click();

    }

    public void ed() throws InterruptedException {
        driver.findElement(Edit).click();
        Thread.sleep(2000);
    }

    public void editNotes(String nt) throws InterruptedException {
        WebElement n = driver.findElement(Note2);
        n.clear();
        n.sendKeys(nt);
        Thread.sleep(2000);
    }

    public void sv() throws InterruptedException {
        driver.findElement(Save2).click();
        Thread.sleep(2000);
    }

    public void del() throws InterruptedException {
        driver.findElement(Delete).click();
        Thread.sleep(2000);
    }

    public void delreason(String del) throws InterruptedException {
        WebElement delete = driver.findElement(DeleteReason);
        delete.sendKeys(del);
        Thread.sleep(2000);
    }

    public void okay() throws InterruptedException {
        driver.findElement(ok).click();
        Thread.sleep(2000);

    }
    public void Close() throws InterruptedException{
        driver.findElement(Close).click();
    }
}