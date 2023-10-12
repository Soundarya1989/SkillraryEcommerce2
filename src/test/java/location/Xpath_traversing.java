package location;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Xpath_traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		//for maximizing
		driver.manage().window().maximize();
		//to open the browser
		driver.get("https://www.amazon.in/s?k=samsung&crid=PJ06QGYOXH88&sprefix=samsung+%2Caps%2C207&ref=nb_sb_noss_2");
		WebElement value=driver.findElement(By.xpath(
				"//span[text()='Samsung Galaxy M34 5G (Prism Silver, 6GB, 128GB Storage) | 120Hz sAMOLED Display | 50MP Triple No Shake Cam | 6000 mAh Battery | 12GB RAM with RAM Plus | Android 13 | Without Charger']/../../../../../..//span[@class='a-price-whole']"));
		
		System.out.println(value.getText());

	}

}
