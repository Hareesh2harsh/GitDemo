package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="login-link") public WebElement lnkLogin;
	@FindBy(xpath="//input[@type='text']") public WebElement tfUsername;
	@FindBy(xpath="//input[@type='password']") public WebElement tfPassword;
	@FindBy(xpath="//span[contains(.,'Submit')]") public WebElement btnSubmit;
	@FindBy(id="logout-trigger") public WebElement lnkLogout;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillLogin(String uname, String pwd)
	{
		tfUsername.sendKeys(uname);
		tfPassword.sendKeys(pwd);
		btnSubmit.click();
	}

}
