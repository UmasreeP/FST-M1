package testRunner;

	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "C:\\Users\\UmasreeP\\eclipse-workspace\\FST_Cucumber\\src\\test\\java\\features",
	    glue = {"stepDefinitions"},
	    tags = "@SmokeTest",
	    plugin = {"pretty"},
	    monochrome = true
	)

	public class ActivitiesRunner {
	    //empty
	}