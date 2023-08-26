package stepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"C:\\Hareesh\\Mavenproj\\src\\test\\java\\featureFiles"},
		glue={"stepDefinition"},
        plugin = {"pretty",
                  "html:target/report/cucumber.html",
                  "json:target/report/cucumber.json"
                 },
		//dryRun = true,
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" },
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" },
		
	    tags= "@Smoke"

		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}

