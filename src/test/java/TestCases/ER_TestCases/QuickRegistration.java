package TestCases.ER_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class QuickRegistration extends BaseTest{
	
	@Test
	public void quickReg() throws InterruptedException {
		
		//Three dots
		WebElement menu = driver.findElement(By.id("pt1:OasisHedarToolBar:hamburgerBtn"));
		menu.click();
		Thread.sleep(5000);
		
		//Click on Accident And Emergency
		WebElement mod = driver.findElement(By.xpath("//span[normalize-space()='Accident And Emergency']"));
		mod.click();
		Thread.sleep(3000);
		
		//click on ER Processing
		WebElement erProc = driver.findElement(By.xpath("//span[normalize-space()='ER Processing']"));
		erProc.click();
		Thread.sleep(3000);
		
		//click on Quick Patient Registration
		WebElement quickReg = driver.findElement(By.xpath("//span[normalize-space()='Quick Patient Registration']"));
		quickReg.click();
		Thread.sleep(3000);
		
		//select title
		WebElement title = driver.findElement(By.xpath("(//select[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:ff2:ofi2:soc12::content'])[1]"));
		title.click();
		title.sendKeys("M");
		Thread.sleep(2000);
		title.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		title.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		//enter first name
		WebElement firstN = driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:langs_or:oc1:of15:langs_iter:0:or3:oc16:fi2212:nm1en']/input"));
//		firstN.click();
		firstN.sendKeys("Mona");
		Thread.sleep(3000);
		firstN.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//enter family name
		WebElement famN = driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:langs_or:oc1:of15:langs_iter:0:or3:oc14:fi214:fmen']/input"));
//		famN.click();
		famN.sendKeys("Ahmed");
		Thread.sleep(3000);
		famN.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		//gender
		WebElement gender = driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:fi16:soc18:codesSelect::content']/div[2]/span/input"));
		gender.click();
		Thread.sleep(3000);
		
		//dob
		WebElement dob = driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:greg_fi:greg_dob']/input"));
		dob.click();
		Thread.sleep(2000);
		dob.sendKeys("17-03-1998");
		Thread.sleep(3000);
		dob.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//mobile number
		WebElement mob = driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:fi82:it6']/input"));
		mob.sendKeys("0536714594");
		Thread.sleep(3000);
		mob.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//nationality three dot
		WebElement nationality = driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:nat_olov_fi:nat_olov:dc_pgl11']/div"));
		nationality.click();
		//click on search bar
		WebElement natSearch = driver.findElement(By.xpath("//span[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt']/input"));
		natSearch.sendKeys("German");
		//search button
		WebElement searchBtn = driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ot6:dc_b1']/a/span"));
		searchBtn.click();
		//user code
		WebElement usercode = driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:nat_olov_fi:nat_olov:dc_or3:dc_oc2:tbl_nat::db']/table/tbody/tr/td[2]"));
		usercode.click();
		//ok btn
		WebElement natOk = driver.findElement(By.xpath("//td[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:cntr_or:oc1:oc3:dem_reg:0:demo_pg:or7:oc23:ff1:nat_olov_fi:nat_olov:lov_search_diag::_fcc']/div"));
		natOk.click();
		Thread.sleep(2000);
		
		//save
		WebElement save = driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:1:pt1regi:osc1:admbtns:b32']/a/span"));
		save.click();
		
	}

}
