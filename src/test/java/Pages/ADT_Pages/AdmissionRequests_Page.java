package Pages.ADT_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdmissionRequests_Page {	
	WebDriver driver;
	
	public AdmissionRequests_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchAdmsn = By.xpath("//input[@id='search|input']");
	By selectPatientAdmi = By.xpath("//span[normalize-space()='Patient Admission']");
	By clickadrequests = By.xpath("//span[text()='Admission Requests']");
	By selectpatient = By.xpath("//tr[@_afrrk='5']");
	By clickokay = By.xpath("//span[text()='Ok']");
	By selectward = By.xpath("//li[@title='Belal Test Ward']");
	By selectward1 = By.xpath("//li[text()='tee']");
	By selectward2 = By.xpath("//li[text()='WARD 2- SEC. 109']");
	By selectward3 = By.xpath("//li[contains(text(),'Ward 3- Sec')]");
	By selectbed = By.xpath("(//li[contains(text(),'Belal Test Room')])[1]");
	By selectbedicu = By.xpath("//li[text()='Icu']");
	By selectbed1 = By.xpath("(//li[contains(text(), 'teeroom')])[1]");
	By selectbed2 = By.xpath("(//li[contains(text(), '207')])[1]");
	By selectbed3 = By.xpath("//li[contains(text(),'new room')]");
	By saveadmis = By.xpath("//span[text()='Save Admission']");
	By clicknoReports = By.xpath("(//span[text()='No'])[4]"); 
	By downpaymentOk = By.xpath("(//span[text()='OK'])[1]");
	By downpaymentcancel = By.xpath("(//span[text()='Cancel'])[1]");
	By clickokadmited = By.xpath("(//span[text()='OK'])[2]");
	By enteramount = By.xpath("//input[@name='pt1:contrRg:0:CntRgn:1:ad_tmp:r1:0:pt1:dwnpyf1:amntfi:amntit']");
	By clicksaveDownPayment = By.xpath("//span[text()='Save']");
	By forthpage = By.xpath("//a[@title='Go To Page 4']");
	By lastpage = By.xpath("//a[@title='Last Page']");	
	By consultantdropDown = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:ad_tmp:cntr_or:oc1:oc3:vst_tmp:oc1:vstff:admtfi:doc1lov:oasis_list_of_values_search_btn']"); 	  
	By admissionreasonIcon = By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:ad_tmp:cntr_or:oc1:oc3:vst_tmp:oc4:adrsnff:fi7:resOlov:oasis_list_of_values_search_btn']"); 	  
    By selectAdmisreason = By.xpath("//span[text()='Aneurysm']");	  
	By clickokReason = By.xpath("(//span[text()='Ok'])[2]");	
	By nextpage = By.xpath("//a[@aria-label='Next Page']");
	

	public void selectWardAndBed() {
        String[] wards = {"//li[@title='Belal Test Ward']", "//li[text()='tee']", "//li[text()='WARD 2- SEC. 109']", "//li[contains(text(),'Ward 3- Sec')]"};
        String[] beds = {"(//li[contains(text(),'Belal Test Room')])[1]", "//li[text()='Icu']", "(//li[contains(text(), 'teeroom')])[1]", "(//li[contains(text(), '207')])[1]", "//li[contains(text(),'new room')]"};

        for (int i = 0; i < wards.length; i++) {
            WebElement wardElement = driver.findElement(By.xpath(wards[i]));
            wardElement.click();

            WebElement bedElement = findBed(beds[i]);
            if (bedElement != null) {
                bedElement.click();
                break;
            }
        }
    }
	
	private WebElement findBed(String bedLocator) {
        try {
            return driver.findElement(By.xpath(bedLocator));
        } catch (Exception e) {
            return null;
        }
    }

	
	public void searchAdmission() {
		driver.findElement(searchAdmsn).sendKeys("Admission");
	}
	
	public void selectPatientAdmission() {
		driver.findElement(selectPatientAdmi).click();
	}
		
	public void clickAdmissionRequest() {
		driver.findElement(clickadrequests).click();
	}
	
	public void clickOkAdmitted() {
		driver.findElement(clickokadmited).click();
	}
	
	public void selectPatient(String patientXpath) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(patientXpath))).click();
	}
	
	public void clickNextPage() {
		driver.findElement(nextpage).click();
	}
	
	public void clickForthPage() {
		driver.findElement(forthpage).click();
	}
	
	public void clickLastPage() {
		driver.findElement(lastpage).click();
	}
	
	public void clickOkay() {
		driver.findElement(clickokay).click();
	}
	
	public void selectAdmisnReason() {
		driver.findElement(selectAdmisreason).click();
	}
	
	public void selectWard() {
		driver.findElement(selectward).click();
	}
	
	public void selectWard1() {
		driver.findElement(selectward1).click();
	}
	
	public void selectWard2() {
		driver.findElement(selectward2).click();
	}
	
	public void selectWard3() {
		driver.findElement(selectward3).click();
	}
	
	public void selectBed() {
		driver.findElement(selectbed).click();
	}
	
	public void selectBedICU() {
		driver.findElement(selectbedicu).click();
	}
	
	public void selectBed1() {
		driver.findElement(selectbed1).click();
	}
	
	public void selectBed2() {
		driver.findElement(selectbed2).click();
	}
	
	public void selectBed3() {
		driver.findElement(selectbed3).click();
	}
	
	public void saveAdmission() {
		driver.findElement(saveadmis).click();
	}
	
	public void clickNoReports() {
		driver.findElement(clicknoReports).click();
	}
	
	public void downPaymentOk() {
		driver.findElement(downpaymentOk).click();
	}
	
	
	public void downPaymentCancel() {
		driver.findElement(downpaymentcancel).click();
	}
	public void transactionType() {
		WebElement transactionType = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:1:ad_tmp:r1:0:pt1:dwnpyf1:trxtpfi:trxsoc::content']"));
		Select select = new Select(transactionType);
		select.selectByVisibleText("Cash");
	}
	
	public void enterAmount() {
		driver.findElement(enteramount).sendKeys("1000");
	}
	
	public void saveDownPayment() {
		driver.findElement(clicksaveDownPayment).click();
	}
	
	public void clickConsultantDropDown() {
		driver.findElement(consultantdropDown).click();
	}
	
	public void admissionReasonIcon() {
		driver.findElement(admissionreasonIcon).click();
	}
	
	public void clickOkReason() {
		driver.findElement(clickokReason).click();
	}

	public boolean isNextPageAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

}
