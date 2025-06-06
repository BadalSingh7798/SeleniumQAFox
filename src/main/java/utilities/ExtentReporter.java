package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	static ExtentReports extentReport;
	
	public static ExtentReports getExtentReports() {
	   
		String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";	
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("TutorialNinja Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extentReport=new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Operating System", "Window 10");
		extentReport.setSystemInfo("Tested By", "Badal Singh");
		return extentReport;
	}

}
