package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		   
		   WebDriver driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		 //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		   Thread.sleep(3000);
		   WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		   WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		   Actions a=new Actions(driver);
		   a.dragAndDrop(block1, block4).perform();
		   
		   
		   }

}
