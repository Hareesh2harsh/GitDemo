package stepDefinition;

import static org.testng.Assert.assertTrue;

import config.Drivers;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginDef extends Drivers{
	
	LoginPage loginPage;
	@Given("If user is on homepage")
	public void if_user_is_on_homepage() {
	    //Load webpage
		d.get(url);
		loginPage=new LoginPage(d);
	}
	
	@When("Click on login link")
	public void click_on_login_link() {
	    loginPage.lnkLogin.click();
	}
	
	@When("Enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String string, String string2) throws Exception {
	    //Enter username
		loginPage.tfUsername.sendKeys(string);
		//Enter password
		loginPage.tfPassword.sendKeys(string2);
		//click on login button
		loginPage.btnSubmit.click();
		Thread.sleep(5000);
	}
	@Then("Verify logout link")
	public void verify_logout_link() {
		
		assertTrue(loginPage.lnkLogout.isDisplayed());


	}

}
