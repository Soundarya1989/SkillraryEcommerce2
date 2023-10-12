package POm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {
	//Declaration
	//address of email text fields 
	@FindBy(id="email")
	private WebElement emailTf;
	//address of password text field
	@FindBy(name="pass")
	private WebElement passwordTf;
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//initialization
	public Facebooklogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	//getter for all private WebElement

	public WebElement getEmailTf() {
		return emailTf;
	}

	
	public WebElement getPasswordTf() {
		return passwordTf;
	}

	
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//Business libraries
	public void emailTextfield(String data)
	{
		emailTf.sendKeys(data);
		
	}
	public void passwordTextfield(String data)
	
	{
		passwordTf.sendKeys(data);
		
	}
	public void loginButton()
	{
		loginBtn.click();
	}
	

}
