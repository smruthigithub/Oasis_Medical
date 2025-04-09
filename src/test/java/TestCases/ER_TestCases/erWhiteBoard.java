package TestCases.ER_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class erWhiteBoard extends BaseTest {

	@Test
	public void whiteBoard() throws InterruptedException {

		// Three dot on left side of the page
		WebElement menu = driver.findElement(By.id("pt1:OasisHedarToolBar:hamburgerBtn"));
		menu.click();
		Thread.sleep(9000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Enter er white board in search field
		WebElement search = driver.findElement(By.id("search|input"));
		wait.until((ExpectedConditions.visibilityOf(search)));
		search.click();
		search.sendKeys("er white board");
		Thread.sleep(2000);
		
		// Select ER white board
		WebElement selectMod = driver.findElement(By.xpath("//span[@class='oj-treeview-item-text']"));
		selectMod.click();
		Thread.sleep(8000);

		// Change entity to ER Clinic
		WebElement entitySearch = driver.findElement(By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:dc_b1']//a[@role='button']"));
		entitySearch.click();
		Thread.sleep(2000);

		WebElement entity = driver.findElement(By.xpath("//span[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:fi1:wrk_ent_srch_it']/input"));
		entity.sendKeys("er clinic");
//		entity.sendKeys("Emergency Department");
		entity.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

		WebElement entitySel = driver.findElement(By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:wrk_ent_lst_fi:wrk_ent_lst::db']/span/div"));
		entitySel.click();
		Thread.sleep(5000);
		
		//click on In Treatment
		WebElement inTreatment = driver.findElement(By.xpath("//span[@class='xfv'][text()='In Treatment']"));
		inTreatment.click();
		Thread.sleep(8000);
		
		//enter patient Id
		WebElement patientId = driver.findElement(By.xpath("//input[@placeholder='Search patient ID, MR number , Pateint Name or ER id here...']"));
		patientId.sendKeys("60");
		patientId.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		
//		// ---------------------CTAS LEVEL-------------------------------------------
		// click an arrow
		WebElement arrow = driver.findElement(By.xpath("//a[@class='x23r x2bz x3nx xgn p_AFTextOnly']"));
		arrow.click();
		Thread.sleep(2000);

		// click on CTAS Level in the list
		WebElement ctasLevel = driver.findElement(By.xpath("//td[text()='Change CTAS Level']"));
		ctasLevel.click();
		Thread.sleep(3000);

		// Change Priority
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='x2h']"));
		dropdown.click();
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ARROW_UP);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Save the priority
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(9000);

		//---------------------------CHANGE LOCATION-----------------------------------
		// click an arrow
		arrow = driver.findElement(By.xpath("//a[@class='x23r x2bz x3nx xgn p_AFTextOnly']"));
		arrow.click();
		Thread.sleep(2000);

		// click on change location from the list
		WebElement changeLoc = driver.findElement(By.xpath("//td[text()='Change Location']"));
		changeLoc.click();
		Thread.sleep(2000);

		// Change to new location
		dropdown = driver.findElement(By.xpath("//select[@class='x2h']"));
		dropdown.click();
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ENTER);

		// save the new location
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(9000);

		// ------------------------------ASSIGN PHYSICIAN---------------------------------------
		// click an arrow
		arrow = driver.findElement(By.xpath("//a[@class='x23r x2bz x3nx xgn p_AFTextOnly']"));
		arrow.click();
		Thread.sleep(2000);

		// click on assign physician from the list
		WebElement assignPhysician = driver.findElement(By.xpath("//td[text()='Assign Physician']"));
		assignPhysician.click();
		Thread.sleep(2000);

		//enter user name
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		username.sendKeys("samina");
		Thread.sleep(2000);

		//enter password
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("samina");
		Thread.sleep(2000);

		//save physician
		WebElement phys = driver.findElement(By.xpath("//span[normalize-space()='Assign Physician']"));
		phys.click();
		String physDisp = phys.getText();
		System.out.println(physDisp);
		Thread.sleep(9000);

		// -----------------------------------ASSIGN NURSE----------------------------------------
		// click an arrow
		arrow = driver.findElement(By.xpath("//a[@class='x23r x2bz x3nx xgn p_AFTextOnly']"));
		arrow.click();
		Thread.sleep(2000);

		// click on assign nurse from the list
		WebElement assignNurse = driver.findElement(By.xpath("//td[text()='Assign Nurse']"));
		assignNurse.click();
		Thread.sleep(2000);

		username = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		username.sendKeys("nurse1");
		Thread.sleep(2000);

		password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("nurse1");
		Thread.sleep(2000);

		WebElement nurse = driver.findElement(By.xpath("//span[normalize-space()='Assign Nurse']"));
		nurse.click();
		System.out.println(nurse.getText());
		Thread.sleep(9000);
		
		//---------------------------------ENDORSE PHYSICIAN----------------------------------------------
		// click an arrow
		arrow = driver.findElement(By.xpath("//a[@class='x23r x2bz x3nx xgn p_AFTextOnly']"));
		arrow.click();
		Thread.sleep(2000);

		// Click on endorsement from the list
		WebElement endorsement = driver.findElement(By.xpath("//td[text()='Endorsement']"));
		endorsement.click();
		Thread.sleep(2000);
		
		//click on endorse
		WebElement endorse = driver.findElement(By.xpath("(//span[contains(text(),'Endorse')])[2]"));
		endorse.click();
		Thread.sleep(4000);
		
		//enter current user
//		WebElement currentUser = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[1]/span[2]/span[2]/span[1]/input[1]"));
		WebElement currentUser = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:main_pg:ff2:fg6:fi8:curr_user::content']"));
		currentUser.sendKeys("samina");
		Thread.sleep(2000);
		
		//enter currentPass
		WebElement currentPass = driver.findElement(By.xpath("(//input[@class='x25'])[4]"));
		currentPass.sendKeys("samina");
		Thread.sleep(2000);
		
		//enter newUser
		WebElement newUser = driver.findElement(By.xpath("(//input[@class='x25'])[5]"));
		newUser.sendKeys("adel123");
		Thread.sleep(2000);
		
		//enter newPass
		WebElement newPass = driver.findElement(By.xpath("(//input[@class='x25'])[6]"));
		newPass.sendKeys("adel123");
		Thread.sleep(2000);
		
		WebElement endorseOK = driver.findElement(By.xpath("//span[normalize-space()='Ok']"));
		endorseOK.click();
		Thread.sleep(8000);
		
		//---------------------------------ENDORSE NURSE----------------------------------------------
		// click an arrow
		arrow = driver.findElement(By.xpath("//a[@class='x23r x2bz x3nx xgn p_AFTextOnly']"));
		arrow.click();
		Thread.sleep(2000);

		// Click on endorsement from the list
		endorsement = driver.findElement(By.xpath("//td[text()='Endorsement']"));
		endorsement.click();
		Thread.sleep(3000);
		
		//click on nurse radio button
		WebElement nurseRadioButton = driver.findElement(By.xpath("(//input[@class='xu3'])[2]"));
		nurseRadioButton.click();
		Thread.sleep(5000);
		
		//click on endorse
		WebElement endorse1 = driver.findElement(By.xpath("//span[contains(text(),'Endorse')]"));
		endorse1.click();
		Thread.sleep(4000);
		
		//enter currentUser
		currentUser = driver.findElement(By.xpath("(//input[@class='x25'])[3]"));
		currentUser.sendKeys("nurse1");
		Thread.sleep(2000);
		
		//enter currentPass
		currentPass = driver.findElement(By.xpath("(//input[@class='x25'])[4]"));
		currentPass.sendKeys("nurse1");
		Thread.sleep(2000);
		
		//enter newUser
		newUser = driver.findElement(By.xpath("(//input[@class='x25'])[5]"));
		newUser.sendKeys("nurse");
		Thread.sleep(2000);
		
		//enter newPass
		newPass = driver.findElement(By.xpath("(//input[@class='x25'])[6]"));
		newPass.sendKeys("nurse");
		Thread.sleep(2000);
		
		endorseOK = driver.findElement(By.xpath("//span[normalize-space()='Ok']"));
		endorseOK.click();
		

	}

}
