package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class runner {


	@CucumberOptions(
			features = "src/test/resources/Features/",
			glue = "steps", 
			tags = {"@test1,@test2"}, 
			plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
			monochrome = true,
			snippets = SnippetType.CAMELCASE,
			dryRun = false, 
			strict = false
			)
	
	public class Runner extends AbstractTestNGCucumberTests {
		
		
		
		
	}
}
