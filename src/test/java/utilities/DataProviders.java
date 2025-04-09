package utilities;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import base.BaseTest;

public class DataProviders extends BaseTest {

	 ExcelUtility xlutil;

//	@DataProvider(name = "PatientData")
//	public Object[] getData() throws IOException {
//
//		String path = ".\\testData\\Automation_Data.xlsx"; // taking xl file from testData
//		String sheetName = "Patient_IDs";
//		xlutil = new ExcelUtility(path, sheetName); // creating an object for XLUtility
//
//		String patientid = (String) xlutil.getCellData(3, 0);
//
//		return new Object[] { patientid };
//
//	}
	@DataProvider(name = "PatientData")
    public Object[][] getData() throws IOException { // Return Object[][]

        String path = ".\\testData\\Automation_Data.xlsx";
        String sheetName = "Patient_IDs";
        xlutil = new ExcelUtility(path, sheetName);

        int rowCount = xlutil.getRowCount(sheetName);
        Object[][] data = new Object[1][1]; // Array to hold the HashMap

        HashMap<String, String> testData = xlutil.getTestDataInMap(10); // Read row (i) in excel (adjust as needed)
        data[0][0] = testData; // Store the HashMap in the array

       // xlutil.close();
        return data; // Return the 2D array
    }

	@DataProvider(name = "FemalePatients")
	public Object[] getFemalePatients() throws IOException {

		String path = ".\\testData\\Automation_Data.xlsx";
		String sheetName = "Female_IDs";
		xlutil = new ExcelUtility(path, sheetName);

		String patientid = (String) xlutil.getCellData(3, 0);

		return new Object[] { patientid };

	}

	@DataProvider(name = "MultiDisciplinary")
	public Object[] getIdMultiDisciplinary() throws IOException {

		String sheetName = "Patient_IDs";
		String path = ".\\testData\\Automation_Data.xlsx";
	
		xlutil = new ExcelUtility(path, sheetName);

		int rowCount = xlutil.getRowCount(sheetName);
		 Object[][] patientData = new Object[1][1]; // Array size 1x1

		 HashMap<String, String> testData = xlutil.getTestDataInMap(1); // Get data from the FIRST row (index 1 if header row is present)
	        patientData[0][0] = testData;  // Store the HashMap in the array

	      //  xlutil.close();
	        return patientData;
	}

	@DataProvider(name = "RegistrationData")
	public Object[][] getRegistrationData() throws IOException {	
		
		String sheetName = "Registration";
		xlutil = new ExcelUtility(".\\testData\\Automation_Data.xlsx", "Registration");

		int rowCount = xlutil.getRowCount(sheetName);
        Object[][] obj = new Object[rowCount - 1][1];

        for (int i = 1; i < rowCount; i++) {
            HashMap<String, String> testData = xlutil.getTestDataInMap(i);
            obj[i - 1][0] = testData;
        }

        return obj;
	}
	
	
	@DataProvider(name = "BabyRegistrationData")
	public Object[][] getBabyRegistrationData() throws IOException {

		String sheetName = "Registration";
		xlutil = new ExcelUtility(".\\testData\\Automation_Data.xlsx", sheetName);

		int rowCount = xlutil.getRowCount(sheetName); // Get actual row count
		Object[][] obj = new Object[rowCount-1][1];
		
		for (int i = 2; i <= rowCount; i++) {
			
			HashMap<String, String> testData = xlutil.getTestDataInMap(i);
		    if (testData != null) { // Check if data retrieved
			obj[i - 2][0] = testData;
		    } else {
		      // Handle case where row is missing (e.g., log a message)
		      System.out.println("Row " + i + " not found in sheet " + sheetName);
		    }
		}
		//((WebDriver) xlutil).close(); // Close after use
		return obj;
	}

//	@DataProvider(name = "MultiDisciplinary")
//	public Object[] getIdMultiDisciplinary() throws IOException {
//		buildingobj = new BuildingPlans_Page(driver);
//	    String path = ".\\testData\\Automation_Data.xlsx";
//	    String sheetName = "Patient_IDs";
//	    ExcelUtility xlutil = new ExcelUtility(path, sheetName);
//
//	    int totalrows = xlutil.getRowCount(sheetName);
//	    List<Object> patientIds = new ArrayList<>();
//
//	    for (int i = 1; i <= totalrows; i++) {
//	        String patientId = (String) xlutil.getCellData(i, 0);
//	        patientIds.add(patientId);
//
//	        // Check for the condition
//	        if (isConditionMet(patientId)) {
//	            break; // Stop the loop if the condition is met
//	        }
//	    }
//
//	    return patientIds.toArray();
//	}

}
