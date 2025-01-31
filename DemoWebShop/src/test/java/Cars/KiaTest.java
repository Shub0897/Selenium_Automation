package Cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KiaTest  {
	
	@Test(groups="functionality")
	public void launch() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kia.com/in/our-vehicles/seltos/showroom.html");
		Reporter.log("Kia launched successfully" ,true);
	}

}
