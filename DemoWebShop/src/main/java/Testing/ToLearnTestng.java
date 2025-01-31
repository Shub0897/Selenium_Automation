package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestng {
	@Test
	public void demo() {
		Reporter.log("demo testcase executed",true);
	}
	@Test
	public void sample()
	{
		Reporter.log("sample testcase executed",true);
	}
	@Test
	public void add() {
		Reporter.log("add testcase executed",true);
		
	}
	
	

}
