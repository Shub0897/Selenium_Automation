package SmartBikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlightTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bikewale.com/mahindra-bikes/flyte/");
		Reporter.log("flyte successfully launched",true);
	}
	}




