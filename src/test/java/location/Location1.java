package location;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Location1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		//opens empty browser
		WebDriver driver =new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		
		//to open browser
		
		driver.get("https://www.facebook.com/");
		// text field by id 
		driver.findElement(By.id("email")).sendKeys("Lakshmi");
		//entering password
		driver.findElement(By.name("pass")).sendKeys("one");
		//for entering 
		//driver.findElement(By.name("login")).click();
		
		//for fortooten password
		driver.findElement(By.partialLinkText("password")).click();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
