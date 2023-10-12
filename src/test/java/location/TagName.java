package location;
//to find all tags 
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
     
        WebDriver driver=new EdgeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https:facebook.com/");
        List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        for (WebElement b:alllinks)
        {
        System.out.println(b.getText());
        }
        
        
        
        
        
        
        
	}

}
