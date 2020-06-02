package runners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/fazerInvestimento.feature", 
		glue = "steps", 
		plugin = {"pretty","html:target/report-html","json:target/report-json","junit:target/cucumber-xml/Investimento.xml" }, 
		monochrome = true, 
		dryRun = false, 
		snippets = SnippetType.CAMELCASE)

public class RunnerFunctionalTest {

	
}
