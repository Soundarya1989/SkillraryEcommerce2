package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtilities {

	
		public void mouseHover(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
			
		}
		public void doubleClick(WebDriver driver,WebElement ele)
		{
			Actions a =new Actions(driver);
			a.doubleClick(ele).perform();
		}

	public void altercancel(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	
	public void rightclick(WebDriver driver,WebElement e)

	{
		Actions a =new Actions(driver);
		a.contextClick(e).perform();
	}
	
	public void alert(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
		
		
	}

}