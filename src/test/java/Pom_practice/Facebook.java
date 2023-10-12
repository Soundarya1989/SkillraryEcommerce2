package Pom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POm.Facebooklogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriverManager.edgedriver().setup();
           //maximize the browser
           WebDriver driver=new EdgeDriver();
           //implicit statement
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get("https://www.facebook.com/");
           Facebooklogin flp=new Facebooklogin(driver);
           flp.emailTextfield("sasi");
           flp.passwordTextfield("kala");
           flp.loginButton();
           
	}

}
