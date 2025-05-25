package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGenerator {

	public static ExtentReports extent;
	public  static ExtentReports getExtentReport() 
	{
		
 //String path = "C://Users//sandi//git//HybridFrameworkNew//HybridFrameworkNew//TestReport//index.html";
 String path = System.getProperty("user.dir")+"//TestReport//index.html";
	
 ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	
		reporter.config().setDocumentTitle("TestExecution Report");
		reporter.config().setReportName("Automation Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System","HP");
		extent.setSystemInfo("QA","Sandip");
		extent.setSystemInfo("Environment","Stage");
		extent.setSystemInfo("Browser","Chrome");
		extent.setSystemInfo("OS","Windows11");
		return extent;
	}

}
