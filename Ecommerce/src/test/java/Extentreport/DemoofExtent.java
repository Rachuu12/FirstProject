package Extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoofExtent {
public void report()
{
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/demo.html");
	ExtentReports report=new ExtentReports();
	report.attachReporter(reporter);
	ExtentTest logger=report.createTest("report");
	logger.log(Status.PASS, "my test is passed");
	logger.log(Status.FAIL, "my test is failed");
	report.flush();
	
}
}
