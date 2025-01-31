package ExtentReport;

import java.time.LocalDateTime;

import org.openqa.selenium.devtools.v119.media.model.Timestamp;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnextentReports {
	
	@Test
	
	public void CreateReport() {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		//step1:create an instance of ExtentSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/"+timestamp+".html");
		
		
		//step 2-create an instanace of eXtentReport
		ExtentReports extReport=new  ExtentReports();
		
		
		//step 3-attach ExtentSparlReporter to EXtentRports
		extReport.attachReporter(spark);
		
		
		//step4-create an instance of ExtentTest
		
		ExtentTest test=extReport.createTest("CreateReport");
		
		//step5-call log() to provide status and message
		
		test.log(Status.PASS, "message added into report");
		test.log(Status.INFO, "adding info status");
		
		//step 6:call flush()
		extReport.flush();
		
		
			
		
	}
	

}
