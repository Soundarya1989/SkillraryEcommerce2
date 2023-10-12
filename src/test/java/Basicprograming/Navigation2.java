package Basicprograming;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; 
public class Navigation2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();

//opens the empty browser
WebDriver driver=new EdgeDriver();

//for maximizing
driver.manage().window().maximize();
 // to open the browser

driver.get("https:www.flipkart.com/");
Thread.sleep(3000);
driver.navigate().to("https:www.amazon.in/");
Thread.sleep(3000);
driver.quit();


	}

}
