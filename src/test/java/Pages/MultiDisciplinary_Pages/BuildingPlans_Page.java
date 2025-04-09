package Pages.MultiDisciplinary_Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BuildingPlans_Page {
	
	WebDriver driver;
	
	public BuildingPlans_Page(WebDriver driver) {
			this.driver = driver;
		}
		
	By searchPatient = By.xpath("//input[@placeholder='Search by Patient Id , MRN ,Name  ']");
	By clickpatient = By.xpath("//span[@class='x41c oslistOfValuesUnComp x3zb']");
	By OpenRecord = By.xpath("//span[text()='Open Record']");
	By AddNewGoal = By.xpath("//span[text()='Add New Goal']");
	By GoalName = By.xpath("(//input[@class='x25'])[2]");
	By Save = By.xpath("//span[text()='Save']");
	By AddIntervention = By.xpath("//span[text()='Add Item Intervension']");
	By SearchDrug = By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
	By enterdrug = By.xpath("(//input[@class='x25'])[4]");
	By selectdrug = By.xpath("//span[text()='Clara 10mg Tablet 10 Tab']");
	By selectOkay = By.xpath("//span[text()='Ok']");
	By Dose = By.xpath("(//input[@class='x25'])[2]");
	By enterrepeats =  By.xpath("(//input[@class='x25'])[3]");
	By searchfrequency = By.xpath("(//div[@class='x3i7 x346 xfl p_AFTextOnly'])[2]");
	By enterfrequency = By.xpath("(//input[@class='x25'])[4]");
	By medicalnotes = By.xpath("//textarea[@class='x25']");
	
	//Lab Order
	By enteritem = By.xpath("//input[@class='x2c']");
	By entereverylab = By.xpath("(//input[@class='x25'])[2]");
	
	// Radiology Order
	By searchitemradio = By.xpath("//div[@class='x3i7 x346 xfl p_AFTextOnly']");
	
	// Blood Bank Order
	By enterunits = By.xpath("(//input[@class='x25'])[2]");
	By entereveryblood = By.xpath("(//input[@class='x25'])[3]");
	By repeatsblood = By.xpath("(//input[@class='x25'])[4]");
	
	//Adding Second Goal
	By AddIntervention2 = By.xpath("(//span[text()='Add Item Intervension'])[1]");
	
	//Edit Intervention
	By createdbtn = By.xpath("(//span[text()='Created'])[1]");
	By editintervention = By.xpath("(//span[text()='Edit Item'])[1]");
	
	//Delete Intervention
	By deleteIntervention = By.xpath("(//span[text()='Delete Item'])[2]");
	By clickYestodelete = By.xpath("(//span[text()='Yes'])[3]");
	
	//Edit Goal
	By editgoal = By.xpath("(//span[text()='Edit Goal'])[2]");
	
	//Delete Goal
	By deletegoal = By.xpath("(//span[text()='Delete Goal'])[1]");
	
	//Activate Plan
	By activateplan = By.xpath("//span[text()='Activate Plan']");
	
	
	public void enterPatientID(Object[] patientData) {
	    String patientId = (String) patientData[0]; // Assuming the patient ID is in the first column
	    driver.findElement(searchPatient).clear();
	    driver.findElement(searchPatient).sendKeys(patientId);
	    driver.findElement(searchPatient).sendKeys(Keys.ENTER);
	}
	
//	public void enterPatientid(String patientids) {
//		driver.findElement(searchPatient).sendKeys(patientids);
//		driver.findElement(searchPatient).sendKeys(Keys.ENTER);
//	}
	
	public void enterPatientid(String patientids) throws InterruptedException { // Consistent naming: patientids
	    if (patientids != null && !patientids.isEmpty()) { // Defensive check
	        driver.findElement(searchPatient).sendKeys(patientids);
	        driver.findElement(searchPatient).sendKeys(Keys.ENTER);
	    } else {
	       // Handle null or empty input (e.g., log, throw exception)
	        System.out.println("Patient ID is null or empty. Not sending keys.");
	    }
	    Thread.sleep(5000);
	}
	
	public void clickPatient() {
		driver.findElement(clickpatient).click();
	}
	
	public void openRecord() {
		driver.findElement(OpenRecord).click();
	}
	
	public void clickMultidisciplinary() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("var MultiDisciplinary = document.evaluate(\"//span[text()='Multidisciplinary Plan of Care']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
	    		"if (MultiDisciplinary) {" +
	    	"  MultiDisciplinary.click();" +
	        "}"
	    );
	}
	
	//Adding New Goal
	
	public void clickAddNewGoal() {
		driver.findElement(AddNewGoal).click();
	}	
	
	public void enterGoalName(String goalvalue) {
		driver.findElement(GoalName).sendKeys(goalvalue);
	}
	
	public void clickSave() {
		driver.findElement(Save).click();
	}
	
	public void clickAddIntervention() {
		driver.findElement(AddIntervention).click();
	}
	
	
	//Adding Medical Order
	public void selectMedication () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Medication Order");
	}
	
	public void selectLabOrder () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Lab Order");
	}
	
	public void selectRadiologyOrder () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Radiology Order");
	}
	
	public void selectBloodBankOrder () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Blood Bank Order");
	}
	
	public void selectOtherOrders () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Other Orders");
	}
	
	public void selectNursingOrder () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Nursing Task/Order");
	}
	
	public void selectVisitNote () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Visit Note");
	}
	
	public void selectConsultation () {
		WebElement Intervndd = driver.findElement(By.xpath("//select[@class='x2h']"));
		Select goalType = new Select(Intervndd);
		goalType.selectByVisibleText("Consultation/Refferal");
	}	
	
	public void clickSearchDrug() {
		driver.findElement(SearchDrug).click();
	}
	
	public void enterDrug() {
		driver.findElement(enterdrug).sendKeys("clara");
		driver.findElement(enterdrug).sendKeys(Keys.ENTER);		
	}
	
	public void selectDrug() {
		driver.findElement(selectdrug).click();
	}	
	
	public void clickOkay() {
		driver.findElement(selectOkay).click();
	}
	
	public void doseInput(String dosevalue) {
		driver.findElement(Dose).sendKeys(dosevalue);
	}
	
	public void selectUOM() {
		WebElement selectUom = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select uom = new Select(selectUom);
		uom.selectByVisibleText("TAB");
	}
	
	public void selectRoute () {
		WebElement selectOral = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select route = new Select(selectOral);
		route.selectByVisibleText("Oral");
	}
	
	public void selectFrequency() {
		driver.findElement(enterfrequency).sendKeys("One time daily");
		driver.findElement(enterfrequency).sendKeys(Keys.ENTER);
	}
	
	public void searchFrequency() {
		driver.findElement(searchfrequency).click();		
	}
	
	public void enterRepeat() {
		driver.findElement(enterrepeats).sendKeys("2");		
	}	
	
	public void selectUrgencyMed() {
		WebElement selecturgency = driver.findElement(By.xpath("(//select[@class='x2h'])[4]"));
		Select urgency = new Select(selecturgency);
		urgency.selectByValue("2");
	}
	
	public void medicalNotes() {
		driver.findElement(medicalnotes).sendKeys("Medical Notes");		
	}
	
	//Adding Lab Order
	
	public void enterItemLab() {
		driver.findElement(enteritem).sendKeys("C3");		
	}
	
	public void enterEveryLab() {
		driver.findElement(entereverylab).sendKeys("2");	
	}
	
	public void selectMonth() {
		WebElement selectmonth = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select month = new Select(selectmonth);
		month.selectByValue("3");
	}
	
	public void selectUrgencyLab() {
		WebElement selecturgency = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select urgency = new Select(selecturgency);
		urgency.selectByValue("2");
	}
	
	public void labNotes() {
		driver.findElement(medicalnotes).sendKeys("Lab Notes");		
	}
	
	//Adding Radiology Order
	
	public void searchItemRadio() {
		driver.findElement(searchitemradio).click();
	}
	
	public void radiologyNotes() {
		driver.findElement(medicalnotes).sendKeys("Radiology Notes");		
	}
	
	//Adding Blood Bank Order
	
	public void enterUnits() {
		driver.findElement(enterunits).sendKeys("10");	
	}
	
	public void enterEveryBlood() {
		driver.findElement(entereveryblood).sendKeys("2");	
	}
	
	public void bloodBankNotes() {
		driver.findElement(medicalnotes).sendKeys("Blood Bank Notes");		
	}
	
	public void enterRepeatBlood() {
		driver.findElement(repeatsblood).sendKeys("2");		
	}
	
	//Adding Second Goal
	//Adding Nurse
	
	public void addIntervention2() {
		driver.findElement(AddIntervention2).click();	
	}
	
	public void searchItemNurse() {
		driver.findElement(searchitemradio).click();
	}
	
	public void enterEveryNurse() {
		driver.findElement(entereverylab).sendKeys("2");	
	}
	
	//Adding Visit Notes
	
	public void visitNotes() {
		driver.findElement(medicalnotes).sendKeys("Visit Notes");		
	}
	
	//Adding Consultation
	
	public void consultationInput(String consultation) {
		driver.findElement(Dose).sendKeys(consultation);
	}
	
	public void referToSpeciality() {
		WebElement speciality = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		Select refer = new Select(speciality);
		refer.selectByVisibleText("Cardiolgy Services");
	}
	
	public void selectTeam() {
		WebElement team = driver.findElement(By.xpath("(//select[@class='x2h'])[3]"));
		Select selectTeam = new Select(team);
		selectTeam.selectByVisibleText("Cardiology Team");
	}
	
	public void consultationNotes(String notes) {
		driver.findElement(medicalnotes).sendKeys(notes);		
	}
	
	
	@SuppressWarnings("unused")
	public boolean isConditionMet() {
	    // Your logic to check if the "Created" button is present
	    // ... (e.g., using Selenium WebDriver to interact with the web page)

	    // For example, you could check if a specific element is present:
	    // Your WebDriver instance
	    WebElement createdButton = driver.findElement(By.xpath("(//span[text()='Created'])[1]"));
	    return true;
	    
	}
	//Edit Intervention
	
	public void editIntervention() {
		driver.findElement(editintervention).click();
	}
	
	//Delete Intervention
	
	public void deleteIntervention() {
		driver.findElement(deleteIntervention).click();
	}
	
	public void clickYesToDelete() {
		driver.findElement(clickYestodelete).click();
	}
	
	public void editGoal() {
		driver.findElement(editgoal).click();
	}
	
	public void editGoalName(String goalvalue) {
		driver.findElement(GoalName).clear();
		driver.findElement(GoalName).sendKeys(goalvalue);
	}
	
	//Delete Goal
	
	public void deleteGoal() {
		driver.findElement(deletegoal).click();
	}
	
	//Activate Plan
	
	public void activatePlan() {
		driver.findElement(activateplan).click();
	}
	
	
}
