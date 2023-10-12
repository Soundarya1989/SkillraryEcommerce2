package Syncronisation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Displayed {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				WebDriverManager.edgedriver().setup();
				
				//opens the empty browser
				WebDriver driver=new EdgeDriver();
				//for maximizing):
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//to open the browser
				driver.get("https://www.facebook.com/");
				WebElement email=driver.findElement(By.id("email"));
				if(email.isDisplayed())
				{
					email.sendKeys("sasi");
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
				
		
		
		
		
		
	}
}
