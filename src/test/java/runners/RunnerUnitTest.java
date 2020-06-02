package runners;


import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/fazerInvestimento.feature", 
		glue = "steps", 
		plugin = {"pretty"}, 
		monochrome = true, 
		dryRun = true, 
		snippets = SnippetType.CAMELCASE)

public class RunnerUnitTest {
	
	}
