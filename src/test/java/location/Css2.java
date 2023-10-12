package location;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Css2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
		
		//opens empty browser
		WebDriver driver =new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		
		//to open browser
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abced");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("pass");
		
		driver.findElement(By.xpath("//a[contains(text(),'forgotten')]")).click();
		

	}

}
