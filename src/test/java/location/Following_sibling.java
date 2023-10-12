package location;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Following_sibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		   
		   WebDriver driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.amazon.in/ref=nav_logo");
		    
		   
		   driver.findElement(By.xpath("//a[text()='sell']/following-sibling::a[2]")).click();
		   
		

	}

}
