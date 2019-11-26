package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations", monochrome = true, plugin = { "pretty",
		"html:target/site/cucumber-report-default",
		"json:target/jsonReports/cucumber.json" }, snippets = SnippetType.CAMELCASE, tags = "@tag1")
public class CucumberRunner {

}
