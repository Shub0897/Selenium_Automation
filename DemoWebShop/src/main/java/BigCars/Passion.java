package BigCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Passion 
{
	@Test(groups="system")
	public void launch()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bikewale.com/hero-bikes/passion-plus/");
		Reporter.log("Passion Successfully launched",true);
		
		
	}

}
