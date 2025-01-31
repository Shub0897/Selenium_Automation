package BigCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class R15 {
	
		@Test(groups="Regression")
		public void launch()
		{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.bikedekho.com/yamaha/");
			Reporter.log("R15 Successfully launched",true);
			
			
		}



}
