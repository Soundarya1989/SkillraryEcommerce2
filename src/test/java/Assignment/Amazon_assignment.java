package Assignment;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
public class Amazon_assignment {

	public static void main(String[] args) throws Throwable

	{
		
		   WebDriverManager.edgedriver().setup();
		   WebDriver driver=new EdgeDriver();
		   driver.manage().window().maximize();
		   //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   driver.get("https://www.amazon.in/");
		   //String parent=driver.getWindowHandle();
		   
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		   Object s = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		   ((WebElement) s).click();
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   
		    Thread.sleep(3000);
		   ((WebElement) s).click();
		   Set<String> child=driver.getWindowHandles();
		   for(String b:child)
		   {
			  driver.switchTo().window(b);
		   }
		   WebElement value = driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']/../../../..//span[@class='a-price a-text-price']"));
		   System.out.println(value.getText());
		   Object executeScript = js.executeScript("arguments[0].scrollIntoView();", value);
		   WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		   addtocart.click();
        
 
		   
}
}
