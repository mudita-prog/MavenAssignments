package Maven_Assignments.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class _Launch_Quit{

	WebDriver driver;
	
	@BeforeMethod
	
	public void LaunchQuit()
	{
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://amazon.in");      
  }

/*	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();		
}*/
}