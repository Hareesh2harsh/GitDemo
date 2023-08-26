package stepDefinition;


import config.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before()
	public void beforeScenario()
	{
		System.out.println("********** Before scenario ************");
		Drivers.launchBrowser();
	}
	@After()
	public void afterScenario()
	{
		System.out.println("********** After scenario ************");
		Drivers.closeBrowser();
	}
	@Before("@DB")
	public void beforeScenario1()
	{
		System.out.println("********** Establish data base connection ************");
	}
	@After("@DB")
	public void afterScenario1()
	{
		System.out.println("********** Close data base connection ************");
	}


}
