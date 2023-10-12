import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_method {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		//for maximizing):
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//to open the browser
		driver.get("https://www.facebook.com/");
		
		
		
		

	}

}
