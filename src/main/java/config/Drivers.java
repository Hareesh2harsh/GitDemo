package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	
	
	public static String browser="FF";
	public static String url="https://demo.cyclos.org/ui/home";
	public static WebDriver d;
	public static void launchBrowser()
	{
		//launch browser
		if(browser.equalsIgnoreCase("FF"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("GC"))
		{
			d=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			d=new EdgeDriver();
		}
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		d.manage().window().maximize();
	}
	
	public static void closeBrowser()
	{
		d.quit();
	}

}
