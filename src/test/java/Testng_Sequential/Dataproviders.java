package Testng_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviders {
	@DataProvider
	public Object[][] getDtata()
	{
		Object[][] a=new  Object[3][2];
		a[0][0]="sasi";
		a[0][1]="mani";
		
		a[1][0]="ram";
		a[1][1]="laxman";
		
		a[2][0]="java";
		a[2][2]="qspider";
		
				return a;
		
	}
	@Test(dataProvider="getData")
	public void demo(String data,String data1)
	{
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.facebook/");
		 driver.findElement(By.id("email")).sendKeys(data);
		 driver.findElement(By.xpath("pass")).sendKeys(data);
		 	
	}
	

}
