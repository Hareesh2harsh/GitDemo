package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class ContactsDef {
	
	WebDriver d;
	
	@When("Enter login details")
	public void enter_login_details() throws InterruptedException {
		// Enter user name
				d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
				// Enter password
				d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
				// Click on Login button
				d.findElement(By.xpath("//span[contains(.,'Submit')]")).click();
				Thread.sleep(2000);
	}
	@When("Click on contacts link")
	public void click_on_contacts_link() throws InterruptedException {
		d.findElement(By.xpath("//div[4]/a/div[2]")).click();
		Thread.sleep(3000);
	}
	@When("Verify contacts list page")
	public void verify_contacts_list_page() throws InterruptedException {
	    assertTrue(d.findElement(By.xpath("//contact-list")).isDisplayed());
	    Thread.sleep(5000);
	    }
	@Then("click on logout")
	public void click_on_logout() throws InterruptedException {
	    d.findElement(By.id("logout-trigger")).click();
	    Thread.sleep(1500);
	    
	    d.quit();
	}

}
