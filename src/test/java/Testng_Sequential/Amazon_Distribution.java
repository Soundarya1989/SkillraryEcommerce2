package Testng_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Distribution {
	@Test
public void fb()
{
	

	WebDriverManager.edgedriver().setup();
	   
	   WebDriver driver=new EdgeDriver();
	   
	   driver.manage().window().maximize();
	   //implicit wait
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   //Explicit wait
	   WebDriverWait wait=new WebDriverWait(driver,10);
	   
	   //to open the browser
	   
	   driver.get("https://www.facebook.com/");
}

}