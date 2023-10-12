package ChildBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alterpopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		   
		   WebDriver driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		 //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   driver.get("https://demoapp.skillrary.com/product.php?product=java");
		 WebElement plus= driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		 Actions a=new Actions(driver);
		 a.doubleClick(plus).perform();
		 driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		 //switching the control
		 Alert al=driver.switchTo().alert();
		
		 System.out.println(al.getText());
		 al.accept();
		 //al.dismiss();
		 
		 
		 
	}

}
