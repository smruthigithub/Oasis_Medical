package TestCases.ER_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class erVisitRegistration extends BaseTest{
	
	@Test
	public void erVisit() throws InterruptedException {
		//Three dot on left side of the page
		WebElement menu = driver.findElement(By.id("pt1:OasisHedarToolBar:hamburgerBtn"));
		menu.click();
		Thread.sleep(5000);
		
		//click on Accident and Emergency
		WebElement search = driver.findElement(By.xpath("//span[normalize-space()='Accident And Emergency']"));
		search.click();
		Thread.sleep(3000);
		
		//click on ER Processing
		WebElement erProc = driver.findElement(By.xpath("//span[normalize-space()='ER Processing']"));
		erProc.click();
		Thread.sleep(3000);
		
		//Click on Emergency registration
		WebElement eReg = driver.findElement(By.xpath("//span[normalize-space()='Emergency Registration']"));
		eReg.click();
		Thread.sleep(5000);
		
		//Change entity to ER Clinic
		WebElement entitySearch = driver.findElement(By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:dc_b1']//a[@role='button']"));
		entitySearch.click();
		
		//Enter Er clinic in entity search field
		WebElement entity = driver.findElement(By.xpath("//span[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:fi1:wrk_ent_srch_it']/input"));
		entity.sendKeys("er clinic");
//		entity.sendKeys("Emergency Department");
		entity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//click on ER Clinic
		WebElement erSelect = driver.findElement(By.xpath("//div[@id='pt1:OasisHedarToolBar:wrk_ent_tb:wrk_ent_ff:wrk_ent_lst_fi:wrk_ent_lst::db']/span/div"));
		erSelect.click();
		Thread.sleep(5000);
		
		//Enter patient Id
		WebElement pId = driver.findElement(By.xpath("(//input[@id='pt1:contrRg:0:CntRgn:2:page_id:oc15:erpi2:oscrd:ptinfc:ptdata:frstr:ptidc:dc_ff2:dc_fi2:ptidit::content'])[1]"));
		pId.click();
		pId.sendKeys("70");
		pId.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
//		//Choose an Emergency Event
		WebElement emergencyE = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:2:page_id:oc15:or4:oc16:ff2:fg1:fi6:soc6::content']"));
		emergencyE.click();
//		Thread.sleep(2000);
		emergencyE.sendKeys(Keys.ARROW_DOWN);
		emergencyE.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Choose an Reffered Type
		WebElement refferedType = driver.findElement(By.xpath("(//select[@id='pt1:contrRg:0:CntRgn:2:page_id:oc15:or4:oc16:ff2:fg1:fi8:soc7::content'])[1]"));
		refferedType.click();
		refferedType.sendKeys(Keys.ARROW_DOWN);
		refferedType.sendKeys(Keys.ARROW_DOWN);
		refferedType.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Scroll the page down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		//Choose the location from the list
		WebElement location = driver.findElement(By.xpath("(//span[@id='pt1:contrRg:0:CntRgn:2:page_id:oc15:or4:oc16:ff4:fg3:fi21:smc1'])[1]"));
		location.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//option[@title='Waiting Area']")).click();
		
		//Choose the physician from the list
		WebElement physician = driver.findElement(By.xpath("//select[@id='pt1:contrRg:0:CntRgn:2:page_id:oc15:or4:oc16:ff4:fg3:fi22:smc2::content']"));
		physician.click();
		physician.sendKeys(Keys.ARROW_DOWN);
		physician.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Add eligibility
		WebElement eligibility = driver.findElement(By.xpath("//span[contains(text(),'Add Eligibility')]"));
		eligibility.click();
		Thread.sleep(5000);
	
		int size = driver.findElements(By.tagName("iframe")).size();       
	    System.out.println("Total Frames --" + size);
		
		driver.switchTo().frame(1);
		
		//Click on Next and Save to add eligibility
		WebElement frame = driver.findElement(By.xpath("//div[@id='r1:0:pt1:ot1:obt2:btn300']/a/span"));
		String name = frame.getText();
		System.out.println(name);
		Thread.sleep(2000);
		frame.click();
		Thread.sleep(2000);
		
		
//		//payment type- BETA ENVIRONMENT
//		WebElement payType = driver.findElement(By.xpath("//select[@id='r1:0:pt1:viewId:dc_oc2:dc_i1:0:dc_or3:dc_oc10:dc_soc1::content']"));
//		payType.click();
//		payType.sendKeys(Keys.ARROW_DOWN);
//		payType.sendKeys(Keys.ARROW_DOWN);
//		payType.sendKeys(Keys.ARROW_DOWN);
//		payType.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
		
		//save
		WebElement save = driver.findElement(By.xpath("//span[normalize-space()='Save and Close']"));
		save.click();
		
	}

}
