package location;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorcss {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
   WebDriverManager.edgedriver().setup();
   
   WebDriver driver=new EdgeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://www.facebook.com/");
   
   driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcdef");
   driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abcd");
   Thread.sleep(5000);
   driver.findElement(By.cssSelector("button[type='submit']")).click();
   driver.close();
   
   
   
	}

}
