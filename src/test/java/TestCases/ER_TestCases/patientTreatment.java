package TestCases.ER_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class patientTreatment extends BaseTest {

	@Test
	public void treatment() throws InterruptedException {

		//Three dot on left side of the page
		WebElement menu = driver.findElement(By.id("pt1:OasisHedarToolBar:hamburgerBtn"));
		menu.click();
		Thread.sleep(9000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Enter patient treatment in search field
		WebElement search = driver.findElement(By.id("search|input"));
		wait.until((ExpectedConditions.visibilityOf(search)));
		search.click();
		search.sendKeys("patient treatment");
		Thread.sleep(2000);

		//Select patient treatment 
		WebElement treat = driver.findElement(By.xpath("//span[@class='oj-treeview-item-text']"));
		treat.click();
		Thread.sleep(4000);

		// Change entity to ER Clinic
		WebElement entitySearch = driver.findElement(By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:dc_b1']//a[@role='button']"));
		entitySearch.click();
		
		WebElement entity = driver.findElement(By.xpath("//span[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:fi1:wrk_ent_srch_it']/input"));
		entity.sendKeys("er clinic");
//		entity.sendKeys("Emergency Department");
		entity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement entitySel = driver.findElement(By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:wrk_ent_lst_fi:wrk_ent_lst::db']/span/div"));
		entitySel.click();
		Thread.sleep(5000);

		
//		//------------------------------------------START TREATMENT-------------------------------------		
//		//Enter patient Id
		WebElement patientId = driver.findElement(By.xpath("//input[@placeholder='Search For Patient Name, Patient Id, Mrn, ErId...']"));
		patientId.sendKeys("60");
		patientId.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		//start the treatment by clicking on it
		WebElement startTreatment = driver.findElement(By.xpath("//span[@class='xfv'][text()='Treatment']"));
//		WebElement startTreatment = driver.findElement(By.xpath("//span[@class='xfv'][text()='Start Treatment']"));
		startTreatment.click();
		Thread.sleep(4000);
		
//		js.executeScript("window.scrollBy(0,0)");
		//give the treatment location
//		driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:3:treatpt:of6:fi10:loc_streat']")).click();
		
		//Set new location from the list
		WebElement newLocation = driver.findElement(By.xpath("//select[@class='x2h']"));
		newLocation.click();
		newLocation.sendKeys(Keys.ARROW_DOWN);
		newLocation.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Click on now button 
		WebElement now = driver.findElement(By.xpath("//span[contains(text(),'Now')]"));
		now.click();
		Thread.sleep(2000);
		
		//Save the new location by clicking on OK
		WebElement locOk = driver.findElement(By.xpath("(//span[@class='xfv'][normalize-space()='OK'])[1]"));
		locOk.click();
		Thread.sleep(8000);
		
		//-----------------click in In Treatment----------------------
		WebElement inTreat = driver.findElement(By.xpath("//span[normalize-space()='InTreatment']"));
		inTreat.click();
		Thread.sleep(5000);
		
		patientId = driver.findElement(By.xpath("//input[@placeholder='Search For Patient Name, Patient Id, Mrn, ErId...']"));
		patientId.sendKeys("60");
		patientId.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		//click on the arrow
		WebElement arrow = driver.findElement(By.xpath("//a[@title='Open Record']"));
		arrow.click();
		Thread.sleep(6000);
		
		//Click on location|staff
		WebElement locStaff = driver.findElement(By.xpath("//a[text()='Location | Staff']"));
//		WebElement locStaff = driver.findElement(By.xpath("//a[text()='Change Location/ Staff']"));
		locStaff.click();
		Thread.sleep(4000);
		
//		//-------------------------ASSIGN PHYSICIAN------------------------------------------------
//		//Choose a Physician
//		WebElement newPhysician = driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:treatpt:of5:fg1:fi6:olov2:oasis_list_of_values_search_btn']"));
//		newPhysician.click();
//		Thread.sleep(2000);
//		WebElement searchStaff = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:of5:fg1:fi6:olov2:dc_or2:dc_oc1:dc_ofi1:searchTxt::content']"));
//		searchStaff.sendKeys("Magdy Fathey Ahmed");
//		searchStaff.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Ok']")).click();
//		Thread.sleep(3000);
		
		//--------------------------CHANGE PATIENT LOCATION------------------------------------------		
		//Choose an New Location in Patient location
		WebElement newPatientLoc = driver.findElement(By.xpath("(//select[@class='x2h'])[2]"));
		newPatientLoc.click();
		Thread.sleep(2000);
		newPatientLoc.sendKeys(Keys.ARROW_DOWN);
		newPatientLoc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
//		//---------------------------------------ASSIGN TO NURSE-------------------------------------------------
//		//Choose a nurse in assign nurse
		WebElement newNurse = driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:treatpt:of5:fg4:fi_nr:er_nur_olov:oasis_list_of_values_search_btn']"));
		newNurse.click();
		Thread.sleep(2000);
		
		WebElement nurse = driver.findElement(By.xpath("//span[contains(text(),'Shefaa Mohamed Alamoudi')]"));
		nurse.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Ok']")).click();
		Thread.sleep(2000);
		
		//Save location and nurse
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(15000);
		

//		//-------------------------------------ENDORSE PHYSICIAN----------------------------------------
		//click on the arrow
		arrow = driver.findElement(By.xpath("//a[@title='Open Record']"));
		arrow.click();
		Thread.sleep(6000);
		
		//click on endorsement
		WebElement endorsement = driver.findElement(By.xpath("//a[text()='Endorsement']"));
		endorsement.click();
		Thread.sleep(2000);
		
		//click on endorse
		WebElement endorse = driver.findElement(By.xpath("//span[contains(text(),'Endorse')]"));
		endorse.click();
		Thread.sleep(2000);
		
		//enter currentUser
//		WebElement currentUser = driver.findElement(By.xpath("(//input[@id='pt1:contrRg:0:CntRgn:1:treatpt:ff2:fg6:fi8:curr_user::content'])[1]"));
		WebElement currentUser = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg6:fi8:curr_user::content']"));
		currentUser.sendKeys("samina");
		
		//enter currentPass
		WebElement currentPass = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg6:fi12:curr_pass::content']"));
		currentPass.sendKeys("samina");
		Thread.sleep(2000);
		
		//enter newUser
		WebElement newUser = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg7:fi13:new_user::content']"));
		newUser.sendKeys("adel123");
		
		//enter newPass
		WebElement newPass = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg7:fi14:new_pass::content']"));
		newPass.sendKeys("adel123");
		
		//click OK
		driver.findElement(By.xpath("//span[normalize-space()='Ok']")).click();
		Thread.sleep(5000);
		
		
		/////////////giving error [ the account is locked (Current Staff) ]
//		//-----------------------------------------ENDORSE NURSE------------------------------------------------
		//click on the arrow
		arrow = driver.findElement(By.xpath("//a[@title='Open Record']"));
		arrow.click();
		Thread.sleep(6000);
				
		//click on endorsement
		endorsement = driver.findElement(By.xpath("//a[text()='Endorsement']"));
		endorsement.click();
		Thread.sleep(2000);

		//click on nurse radio button
		WebElement nurseEndorse = driver.findElement(By.xpath("(//input[@class='xu3'])[2]"));
		nurseEndorse.click();
		Thread.sleep(2000);
		
		//click on endorse
		endorse = driver.findElement(By.xpath("//span[contains(text(),'Endorse')]"));
		endorse.click();
		Thread.sleep(3000);
		
		currentUser = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg6:fi8:curr_user::content']"));
		currentUser.sendKeys("nurse");
		Thread.sleep(2000);
		
		currentPass = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg6:fi12:curr_pass::content']"));
		currentPass.sendKeys("nurse");
		Thread.sleep(2000);
		
		newUser = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg7:fi13:new_user::content']"));
		newUser.sendKeys("nurse1");
		Thread.sleep(2000);
		
		newPass = driver.findElement(By.xpath("//input[@id='pt1:contrRg:0:CntRgn:2:treatpt:ff2:fg7:fi14:new_pass::content']"));
		newPass.sendKeys("nurse1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Ok']")).click();

		

	}

}
