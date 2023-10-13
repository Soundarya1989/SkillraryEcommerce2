package Scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		   
		   WebDriver driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		 //implicit wait
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   //Explicit wait
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   driver.get("https://www.amazon.in/");
		   
		   WebElement career=driver.findElement(By.xpath("//a[text()='Careers']"));
		  //down casting
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView();",career);
		   career.click();
		   
		   
		   
		   
		   
		   
	}

}
