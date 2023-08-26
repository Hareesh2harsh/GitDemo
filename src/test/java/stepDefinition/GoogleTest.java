package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class GoogleTest {
	
	
		WebDriver d;
		@Test
		public void testGoogle() throws Exception
		{
			// Load web page
			d.get("https://www.google.com/");
			Thread.sleep(2000);
		}
		@BeforeMethod
		public void setUp()
		{
			// Launch the browser
			d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			d.manage().window().maximize();
		}
		@AfterMethod
		public void tearDown()
		{
			// Close the browser
			d.quit();
		}

	}



