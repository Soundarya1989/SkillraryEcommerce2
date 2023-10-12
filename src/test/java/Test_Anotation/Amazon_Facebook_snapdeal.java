package Test_Anotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Facebook_snapdeal {
	WebDriver driver;
	@BeforeMethod
  public void openening()
  {
	  WebDriverManager.edgedriver().setup();
	  
	  driver=new EdgeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
	@AfterMethod
	public void closing()
	{
		driver.close();
	}
	@Test
	public void fb()
	{
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void amazon()
	{
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		
	}
	@Test
	public void snapdeal()
	
	{
	driver.get("https://www.snapdeal.com");	
	}
}
