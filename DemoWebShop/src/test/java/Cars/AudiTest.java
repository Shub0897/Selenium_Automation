package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiTest
{
	@Test(groups="smoke")
	public void launch() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.audi.in/in/web/en.html");
		Reporter.log("Audi launched successfully" ,true);
	

}


}
