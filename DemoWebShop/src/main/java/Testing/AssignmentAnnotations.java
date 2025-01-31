package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentAnnotations {
	@Test(priority=1)
	public void createAccount() {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/emailsignup/");
	
	Reporter.log("create account successfully", true);
	}
	@Test(priority=3,invocationCount = 2,threadPoolSize = 2)
	public void deleteAccount() {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
	
	Reporter.log("delete account successfully", true);
	}
	@Test(priority=2,invocationCount =2)
	public void editAccount() {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
	
	Reporter.log("edit  account successfully", true);
	}
}
	
