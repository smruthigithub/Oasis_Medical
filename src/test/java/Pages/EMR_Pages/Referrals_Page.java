package Pages.EMR_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Referrals_Page {
    WebDriver driver;
    WebDriverWait wait;

    public Referrals_Page(WebDriver driver) {
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
    By Referral=By.xpath("//span[text()='Referrals']");
    By Add=By.xpath("//span[text()='Add']");
    By ReferralConsult=By.xpath("(//input[@class='xu3'])[1]");
    By ToSpeciality=By.xpath("(//select[@class='x2h'])[1]");
    By ToTeam=By.xpath("(//select[@class='x2h'])[2]");
    By ClickSearchPhy=By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
    By GivePhys=By.xpath("(//input[@class='x25'])[3]");
    By search=By.xpath("//span[text()='Search']");
    By ok=By.xpath("//span[text()='Ok']");
    By referralNote=By.xpath("(//textarea[@class='x25'])[1]");
    By Save=By.xpath("//span[text()='Save']");
    By Close=By.xpath("//span[text()='Close']");
    By Add2=By.xpath("//div[@class='x3n1 xfl p_AFTextOnly']");
    By SecondRef=By.xpath("(//input[@class='xu3'])[2]");
    By ToSpeciality2=By.xpath("(//select[@class='x2h'])[1]");
    By ToTeam2=By.xpath("(//select[@class='x2h'])[2]");
    By ClickSearchPhy2=By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
    By GivePhys2=By.xpath("(//input[@class='x25'])[3]");
    By search2=By.xpath("//span[text()='Search']");
    By ok2=By.xpath("//span[text()='Ok']");
    By referralNote2=By.xpath("(//textarea[@class='x25'])[1]");
    By Save2=By.xpath("//span[text()='Save']");
    By Close2=By.xpath("//span[text()='Close']");
    By Add3=By.xpath("//div[@class='x3n1 xfl p_AFTextOnly']");
    By transferRef=By.xpath("(//input[@class='xu3'])[3]");
    By ToSpeciality3=By.xpath("(//select[@class='x2h'])[1]");
    By ToTeam3=By.xpath("(//select[@class='x2h'])[2]");
    By ClickSearchPhy3=By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
    By GivePhys3=By.xpath("(//input[@class='x25'])[3]");
    By search3=By.xpath("//span[text()='Search']");
    By ok3=By.xpath("//span[text()='Ok']");
    By referralNote3=By.xpath("(//textarea[@class='x25'])[1]");
    By Save3=By.xpath("//span[text()='Save']");




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
    public void referral() throws InterruptedException {
        driver.findElement(Referral).click();
        Thread.sleep(2000);
    }
    public void ad() throws InterruptedException {
        driver.findElement(Add).click();
        Thread.sleep(2000);
    }
    public void referralConsult() throws InterruptedException {
        driver.findElement(ReferralConsult).click();
        Thread.sleep(2000);
    }
    public void toSpeciality(String ts) throws InterruptedException {
        WebElement ToSpec= driver.findElement(ToSpeciality);
        ToSpec.sendKeys(ts);
        ToSpec.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void team(String tm) throws InterruptedException {
        WebElement tot= driver.findElement(ToTeam);
        tot.sendKeys(tm);
        tot.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void SearchPhy() throws InterruptedException {
        driver.findElement(ClickSearchPhy).click();
        Thread.sleep(2000);
    }
    public void GivPhy(String GP) throws InterruptedException {
        WebElement Givephys= driver.findElement(GivePhys);
        Givephys.sendKeys(GP);
        Thread.sleep(2000);
    }
    public void Srch() throws InterruptedException {
        driver.findElement(search).click();
        Thread.sleep(2000);
    }
    public void Ok() throws InterruptedException {
        driver.findElement(ok).click();
        Thread.sleep(2000);
    }
    public void refrralnote(String RN) throws InterruptedException {
        WebElement RefNot= driver.findElement(referralNote);
        RefNot.sendKeys(RN);
        Thread.sleep(2000);
    }
    public void sav() throws InterruptedException {
        driver.findElement(Save).click();
        Thread.sleep(2000);
    }
    public void close() throws InterruptedException {
        driver.findElement(Close).click();
        Thread.sleep(2000);
    }

    public void ad2() throws InterruptedException {
        driver.findElement(Add2).click();
        Thread.sleep(2000);
    }
    public void Sec2() throws InterruptedException {
        driver.findElement(SecondRef).click();
        Thread.sleep(2000);
    }
    public void toSpeciality2(String ts) throws InterruptedException {
        WebElement ToSpec= driver.findElement(ToSpeciality2);
        ToSpec.sendKeys(ts);
        ToSpec.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void team2(String tm) throws InterruptedException {
        WebElement tot= driver.findElement(ToTeam2);
        tot.sendKeys(tm);
        tot.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void SearchPhy2() throws InterruptedException {
        driver.findElement(ClickSearchPhy2).click();
        Thread.sleep(2000);
    }
    public void GivPhy2(String GP2) throws InterruptedException {
        WebElement Givephys= driver.findElement(GivePhys2);
        Givephys.sendKeys(GP2);
        Thread.sleep(2000);
    }
    public void Srch2() throws InterruptedException {
        driver.findElement(search2).click();
        Thread.sleep(2000);
    }
    public void Ok2() throws InterruptedException {
        driver.findElement(ok2).click();
        Thread.sleep(2000);
    }
    public void refrralnote2(String RN) throws InterruptedException {
        WebElement RefNot= driver.findElement(referralNote2);
        RefNot.sendKeys(RN);
        Thread.sleep(2000);
    }
    public void sav2() throws InterruptedException {
        driver.findElement(Save2).click();
        Thread.sleep(2000);
    }
    public void close2() throws InterruptedException {
        driver.findElement(Close2).click();
        Thread.sleep(2000);
    }
    public void ad3() throws InterruptedException {
        driver.findElement(Add3).click();
        Thread.sleep(2000);
    }
    public void Sec3() throws InterruptedException {
        driver.findElement(transferRef).click();
        Thread.sleep(2000);
    }
    public void toSpeciality3(String ts) throws InterruptedException {
        WebElement ToSpec= driver.findElement(ToSpeciality3);
        ToSpec.sendKeys(ts);
        ToSpec.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void team3(String tm) throws InterruptedException {
        WebElement tot= driver.findElement(ToTeam3);
        tot.sendKeys(tm);
        tot.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void SearchPhy3() throws InterruptedException {
        driver.findElement(ClickSearchPhy3).click();
        Thread.sleep(2000);
    }
    public void GivPhy3(String GP3) throws InterruptedException {
        WebElement Givephys= driver.findElement(GivePhys3);
        Givephys.sendKeys(GP3);
        Thread.sleep(2000);
    }
    public void Srch3() throws InterruptedException {
        driver.findElement(search3).click();
        Thread.sleep(2000);
    }
    public void Ok3() throws InterruptedException {
        driver.findElement(ok3).click();
        Thread.sleep(2000);
    }
    public void refrralnote3(String RN) throws InterruptedException {
        WebElement RefNot= driver.findElement(referralNote3);
        RefNot.sendKeys(RN);
        Thread.sleep(2000);
    }
    public void sav3() throws InterruptedException {
        driver.findElement(Save3).click();
        Thread.sleep(2000);
    }

}
