package testRunner;

	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "C:\\Users\\UmasreeP\\eclipse-workspace\\FST_Cucumber\\src\\test\\java\\features",
	    glue = {"stepDefinitions"},
	    tags = "@SimpleAlert",
	    plugin = {"json: test-reports/json-report.json"},
	    monochrome = true
	)

	public class ActivitiesRunner {
	    //empty
	}

