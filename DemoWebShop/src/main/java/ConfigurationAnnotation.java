import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@BeforeSuite",true);
		
	}
	@BeforeTest 
	public void BeforeTest() {
		Reporter.log("@BeforeTest",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@BeforeClass",true);
	}
	@BeforeMethod
	
	public void beforeMethod() {
		Reporter.log("@BeforeMethod",true);
	}
	
	
	@Test
	public void demo() {
		Reporter.log("@Test(demo)executed",true);
	
	
	
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("@AfterMethod",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("@AfterClass",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite",true);
		

		
	}

}
