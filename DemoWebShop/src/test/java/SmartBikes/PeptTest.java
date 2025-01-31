package SmartBikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PeptTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tvsmotor.com/tvs-scootypep");
		Reporter.log("SchootyPept successfully launched",true);
	}
	}




