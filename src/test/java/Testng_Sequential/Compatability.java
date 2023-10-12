package Testng_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatability {
	@Test
	public void facebook(String browser)
	{
		WebDriver driver;
		if(browser.equals("edge"))
			
		{
			WebDriverManager.edgedriver().setup();
			//opens the empty browser
			driver=new EdgeDriver();
			
			
		}
		else
		{
			System.setProperty("Webdriver.chrome.driver", browser);
			driver=new ChromeDriver();
		
		   
		  
		   
		   driver.manage().window().maximize();
		   //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   
		   //to open the browser
		   
		   driver.get("https://www.facebook.com/");
	}
	}
}
