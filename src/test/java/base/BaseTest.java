package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.ADT_Pages.AdmissionRequests_Page;
import Pages.ADT_Pages.BedTransfer_Page;
import Pages.ADT_Pages.Discharge_Page;
import Pages.ADT_Pages.PatientAdmission_Page;
import Pages.EMR_Pages.AllergiesPage;
import Pages.EMR_Pages.ClinicalNote_Page;
import Pages.EMR_Pages.CloseVisit_Page;
import Pages.EMR_Pages.DiagnosisPage;
import Pages.EMR_Pages.NurseTask_Page;
import Pages.EMR_Pages.OR_RequestPage;
import Pages.EMR_Pages.RecordDataSet;
import Pages.EMR_Pages.RiskPage;
import Pages.EMR_Pages.TeamCollaboration_Page;
import Pages.Mortuary_Pages.AdultDeathRegistration_Page;
import Pages.Mortuary_Pages.DeceasedRelatives_Page;
import Pages.Mortuary_Pages.MortuarySetup_Page;
import Pages.Mortuary_Pages.MortuaryWorklist_Page;
import Pages.Mortuary_Pages.PerinatalDeathReg_Page;
import Pages.Mortuary_Pages.SendToMortuary_Page;
import Pages.MultiDisciplinary_Pages.BuildingPlans_Page;
import Pages.NurseDrugReceive_Pages.NurseDrugReceive_Page;
import Pages.NursingCarePlan_Pages.ActivateCareOfPlan_Page;
import Pages.NursingCarePlan_Pages.BuildingCareOfPlan_Page;
import Pages.OR_Pages.ORBooking_Page;
import Pages.PMI_Pages.BabyRegPage;
import Pages.PMI_Pages.IDsPage;
import Pages.PMI_Pages.InsurancePage;
import Pages.PMI_Pages.LoginPage;
import Pages.PMI_Pages.PatientDeathRegPage;
import Pages.PMI_Pages.RegistrationPage;
import Pages.Psychiatry_Pages.PsychiatrySessionsSetup_Page;
import Pages.Psychiatry_Pages.PsychiatryStagesSetup_Page;
import Pages.Psychiatry_Pages.ReligiousActivities_Page;
import Pages.Psychiatry_Pages.ReligiousMeeting_Page;
import Pages.Psychiatry_Pages.ReligiousSession_Page;
import Pages.Psychiatry_Pages.SocialResearch_Page;
import Pages.VTE_Assessments_Pages.AdultAssessment_Page;
import Pages.VTE_Assessments_Pages.AntenatalAssessment_Page;
import Pages.VTE_Assessments_Pages.PostnatalAssessment_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DataProviders;
import utilities.ExcelUtility;

public class BaseTest {

	public WebDriver driver;
	public Properties p;
	public RegistrationPage regobj;
	public LoginPage loginobj;
	public InsurancePage insureobj;
	public IDsPage idobj;
	public RecordDataSet recordobj;
	public DiagnosisPage diagnsisobj;
	public AllergiesPage allergyobj;
	public RiskPage riskobj;
	public OR_RequestPage orrequestobj;
	public BabyRegPage babyobj;
	// public PatientDeathRegPage patdeathobj;
	public CloseVisit_Page closevisitobj;
	public ORBooking_Page orbookingobj;
	public BuildingPlans_Page buildingobj;
	public ActivateCareOfPlan_Page activenurseobj;
	public BuildingCareOfPlan_Page buildnurseobj;
	public AdultAssessment_Page adultobj;
	public AntenatalAssessment_Page antenatalobj;
	public PostnatalAssessment_Page postnatalobj;
	public AdmissionRequests_Page adrequestobj;
	public MortuarySetup_Page mrsetupobj;
	public AdultDeathRegistration_Page adultdeathobj;
	public SendToMortuary_Page sendmortuaryobj;
	public PerinatalDeathReg_Page perinatalobj;
	public MortuaryWorklist_Page mrworklistobj;
	public NurseDrugReceive_Page nursedrugobj;
	public PsychiatryStagesSetup_Page psystagesobj;
	public PsychiatrySessionsSetup_Page psysessionsobj;
	public ReligiousActivities_Page relactivobj;
	public ReligiousMeeting_Page relmeetobj;
	public ReligiousSession_Page relsessionobj;
	public SocialResearch_Page socialobj;
	public DeceasedRelatives_Page relativeobj;
	public DataProviders dataobj;
	public BedTransfer_Page bedobj;
	public AdmissionRequests_Page adtadminobj;
	public PatientAdmission_Page patadminobj;
	public Discharge_Page dischargeobj;
	public NurseTask_Page nursetaskobj;
	public TeamCollaboration_Page teamobj;
	public ExcelUtility xlutil;
	public ClinicalNote_Page clinicobj;

	// Extent Reporting
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public ExtentTest extentlogger; // Declare extentlogger

	@BeforeSuite // Use @BeforeSuite for ExtentReports setup
	public void beforeSuite() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("Extent Report.html"); // Customize report path if needed
		extent.attachReporter(spark);

		// Optional: Add system info to the report
		extent.setSystemInfo("Environment", "Test");
		extent.setSystemInfo("Browser", "Chrome"); // Or other browser
	}

	@BeforeClass
	public void openBrowser() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginobj = new LoginPage(driver);

		// Loading config.properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		driver.get(p.getProperty("url")); // Reading url,username, password from Properties file
		loginobj.enterUsername(p.getProperty("username"));
		loginobj.enterPassword(p.getProperty("password"));
		loginobj.clickonLogin();
		Thread.sleep(3000);

		loginobj.clickonAlert();

	}
	
	@BeforeMethod
    public void beforeMethod() {
        String testClassName = this.getClass().getSimpleName();
        String testMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        extentlogger = extent.createTest(testClassName + " - " + testMethodName); // Initialize here
    }

	@AfterMethod
    public void afterMethod(ITestResult result) {
        if (extentlogger != null) { // CRITICAL: Check if extentlogger is initialized
            if (result.getStatus() == ITestResult.FAILURE) {
                extentlogger.log(com.aventstack.extentreports.Status.FAIL, "Test Case Failed is " + result.getName());
                extentlogger.log(com.aventstack.extentreports.Status.FAIL, result.getThrowable());
                try {
                    captureScreen(driver, result.getName());
                } catch (IOException e) {
                    extentlogger.log(com.aventstack.extentreports.Status.FAIL, "Screenshot capture failed: " + e.getMessage());
                }
            } else if (result.getStatus() == ITestResult.SKIP) {
                extentlogger.log(com.aventstack.extentreports.Status.SKIP, "Test Case Skipped is " + result.getName());
            } else if (result.getStatus() == ITestResult.SUCCESS) {
                extentlogger.log(com.aventstack.extentreports.Status.PASS, "Test Case Passed is " + result.getName());
            }
        } // End of null check

        extent.flush();
    }


//	@AfterClass 
//	public void closeBrowser() {
//       driver.close();
//       
//	}

	@AfterSuite // Flush one last time after the entire suite is done
	public void afterSuite() {
		extent.flush();
	}

	public String generaterandomID() {

		@SuppressWarnings("deprecation")
		String generateid = RandomStringUtils.randomAlphanumeric(5);
		return generateid;
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");

	}

}