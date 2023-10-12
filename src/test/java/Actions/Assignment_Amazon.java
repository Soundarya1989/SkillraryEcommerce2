package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment_Amazon {

	public static void main(String[] args)

	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   driver.get("https://www.amazon.in/");
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  
          driver.findElement(By.xpath("//span[text()='iQOO Neo 7 Pro 5G (Dark Storm, 12GB RAM, 256GB Storage) | Snapdragon® 8+ Gen 1 | Independent Gaming Chip | Flagship 50MP OIS Camera | AG Glass Design']/../../../../../..//span[text()='₹42,999'][1]")).click();
        
        
        
 
		   
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
