package Pages.Mortuary_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MortuaryWorklist_Page {
	WebDriver driver;

	public  MortuaryWorklist_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By morturayWorklist = By.xpath("//span[text()='Mortuary Worklist']");
	By btnAction = By.xpath("(//a[@title='Action'])[1]");
	By btnAdd = By.xpath("(//a[text()='Add'])[1]");
	By selectcode = By.xpath("(//div[@class='x3mh xfl p_AFTextOnly'])[1]");
	By btnOkay = By.xpath("(//span[text()='OK'])[1]");
	
	//External Facility
	By externalfacility = By.xpath("//a[text()='External Facility']");
	
	//Added to Morgue
	By addedtomorgue = By.xpath("//span[text()='Added to morgue']");
	By delivercorps = By.xpath("(//a[text()='Deliver Corps'])[1]");   //element index needs to be changed
	By multiplenote = By.xpath("(//span[text()='Multiple Note'])[1]"); 
	By addnewnote = By.xpath("//span[text()='Add New Note']");
	By entersubject = By.xpath("(//input[@class='x25'])[3]");
	By savechanges = By.xpath("//span[text()='Save Changes']");
	By clickcancel = By.xpath("//span[text()='Cancel']");
	By enterkinname = By.xpath("(//input[@class='x25'])[3]");
	By enterkinid = By.xpath("(//input[@class='x25'])[4]");
	By enterusername = By.xpath("(//input[@class='x25'])[5]");
	By enterpassword = By.xpath("(//input[@class='x25'])[6]");
	By clickforensics = By.xpath("(//a[text()='Forensics'])[1]");    //element index needs to be changed
	
	By clickforensictab = By.xpath("//span[text()='Forensic']");
	By returnfromforensic = By.xpath("(//a[text()='Return from Forensic'])[1]");   //element index needs to be changed
	By embalmingandship = By.xpath("(//a[text()='Embalming and Ship'])[1]");
	By entercoffinno = By.xpath("(//input[@class='x25'])[3]");
	By airlinename = By.xpath("(//input[@class='x25'])[4]");
	By entertripno = By.xpath("(//input[@class='x25'])[5]");
	By shippolicyno = By.xpath("(//input[@class='x25'])[6]");
	By shippolicydate = By.xpath("//a[@title='Select Date']");
	By entershipusername = By.xpath("(//input[@class='x25'])[7]");
	By entershippassword = By.xpath("(//input[@class='x25'])[8]");
	By selectnextdate = By.xpath("//td[@class='xo2 p_AFSelected']/following-sibling::*");
	By entershipsubject = By.xpath("(//input[@class='x25'])[9]");
	By clickshipcancel = By.xpath("(//span[text()='Cancel'])[2]");
	By shipmultiplenote = By.xpath("(//span[text()='Multiple Note'])[2]");
	
	
	public void clickmorturayWorklist() {
		driver.findElement(morturayWorklist).click();		
	}
	
	public void clickAction() {
		driver.findElement(btnAction).click();		
	}
	
	public void clickAdd() {
		driver.findElement(btnAdd).click();		
	}
	
	public void selectFreezerCode() {
		driver.findElement(selectcode).click();		
	}
	
	public void clickOkay() {
		driver.findElement(btnOkay).click();		
	}
	
	public void clickExternalFacility() {
		driver.findElement(externalfacility).click();		
	}
	
	public void enterExternalFacilityName(String name) {
		driver.findElement(entersubject).sendKeys(name);
	}
	
	public void clickAddedToMorgue() {
		driver.findElement(addedtomorgue).click();		
	}
	
	public void clickDeliverCorps() {
		driver.findElement(delivercorps).click();		
	}
	
	public void clickMultipleNote() {
		driver.findElement(multiplenote).click();		
	}
	
	public void clickAddNewNote() {
		driver.findElement(addnewnote).click();		
	}
	
	public void enterSubject(String subject) {
		driver.findElement(entersubject).sendKeys(subject);
	}
	
	public void clickSaveChanges() {
		driver.findElement(savechanges).click();
	}
	
	public void clickCancel() {
		driver.findElement(clickcancel).click();
	}
	
	public void enterKinName(String kinname) {
		driver.findElement(enterkinname).sendKeys(kinname);
	}
	
	public void enterKinID(String kinid) {
		driver.findElement(enterkinid).sendKeys(kinid);
	}
	
	public void enterUserName(String user) {
		driver.findElement(enterusername).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(enterpassword).sendKeys(pass);
	}
	
	public void clickForensics() {
		driver.findElement(clickforensics).click();
	}
	
	public void enterForensicName(String forensic) {
		driver.findElement(enterkinname).sendKeys(forensic);
	}
	
	public void enterForensicUsername(String user) {
		driver.findElement(enterkinid).sendKeys(user);
	}
	
	public void enterForensicPassword(String pass) {
		driver.findElement(enterusername).sendKeys(pass);
	}
	
	//Forensic
	
	public void clickForensicTab() {
		driver.findElement(clickforensictab).click();
	}
	
	public void returnFromForensic() {
		driver.findElement(returnfromforensic).click();
	}

	//Embalming And Ship
	
	public void clickEmbalmAndShip() {
		driver.findElement(embalmingandship).click();
	}
	
	public void enterCoffinNo(String coffin) {
		driver.findElement(entercoffinno).sendKeys(coffin);
	}
	
	public void enterAirLineName(String airline) {
		driver.findElement(airlinename).sendKeys(airline);
	}
	
	public void enterTripNo(String trip) {
		driver.findElement(entertripno).sendKeys(trip);
	}
	
	public void enterPolicyNo(String policyno) {
		driver.findElement(shippolicyno).sendKeys(policyno);
	}
	
	public void enterShipUserName(String user) {
		driver.findElement(entershipusername).sendKeys(user);
	}
	
	public void enterShipPassword(String pass) {
		driver.findElement(entershippassword).sendKeys(pass);
	}
	
	public void clickShipPolicyDate() {
		driver.findElement(shippolicydate).click();
	}
	
	public void selectNextDate() {
		driver.findElement(selectnextdate).click();
	}
	
	public void enterShipSubject(String subject) {
		driver.findElement(entershipsubject).sendKeys(subject);
	}
	
	public void clickShipMultipleNote() {
		driver.findElement(shipmultiplenote).click();		
	}
	
	
	public void clickShipCancel() {
		driver.findElement(clickshipcancel).click();
	}
	

}
