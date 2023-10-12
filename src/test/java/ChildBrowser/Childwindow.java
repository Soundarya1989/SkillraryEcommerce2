package ChildBrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childwindow {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		   
		   WebDriver driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		 //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   driver.get("https://www.skillrary.com/");
		   String parent =driver.getWindowHandle();
		   driver.findElement(By.xpath("//a[text()=' GEARS ']"));
		   driver.findElement(By.xpath("//a[text()=' skillRary Essay'])[2]")).click();
		   Set<String> child = driver.getWindowHandles();
		   for(String b:child)
		   {
			   driver.switchTo().window(b);
			   
		   }
		   driver.findElement(By.id("mytext")).sendKeys("sasikala");
		   Thread.sleep(3000);
		   driver.switchTo().window(parent);
		   driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		   
	}

}
