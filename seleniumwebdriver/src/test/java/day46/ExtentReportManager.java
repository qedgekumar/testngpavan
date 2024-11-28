package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;//UI of the Report
	public ExtentReports extent;//populate common information of the report
	public ExtentTest test;//creating test case entries in the report and update status of test methods
	
	 public void onStart(ITestContext context) {
		 sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");//specied location of the report
		 sparkReporter.config().setDocumentTitle("Automation Report");//Title of the Report
		 sparkReporter.config().setReportName("Functional Testing");//Name of the Report
		 sparkReporter.config().setTheme(Theme.STANDARD);
		 
		 extent=new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 extent.setSystemInfo("Computer Name", "localhost");
		 extent.setSystemInfo("Environment", "QA");
		 extent.setSystemInfo("Tester Name", "pavan");
		 extent.setSystemInfo("os", "windows10");
		 extent.setSystemInfo("Browser Name", "chrome");
		 
		    
		  }
	
	
	
	public void onTestSuccess(ITestResult result) {
	    test=extent.createTest(result.getName());//create a new entry in the report
	    test.log(Status.PASS, "Test case PASSED is:"+result.getName());//update status pass/fail is
	  }
	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:"+result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is:"+result.getThrowable());
	    
	  }
	
	 public void onTestSkipped(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.SKIP, "Test case SKIPPED is:"+result.getName());
		    
		  }
	 
	
	 
	 public void onFinish(ITestContext context) {
		    extent.flush();
		  }
}
