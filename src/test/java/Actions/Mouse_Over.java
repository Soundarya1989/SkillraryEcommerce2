package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		   
		   WebDriver driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		 //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   driver.get("https://www.snapdeal.com/");
		   WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		   //creating an object
		   Actions a=new Actions(driver);
		   a.moveToElement(signIn).perform();
		   //Thread.sleep(3000);
		   //address of register 
		   
		   
		   
		   driver.findElement(By.xpath("//span[text()='Register'][1]")).click();
		   
		   
	}

}
