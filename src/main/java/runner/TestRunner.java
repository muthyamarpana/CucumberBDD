package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\sel-learning\\sel@6.30PM(EST)\\workspace\\CucumberBDD\\src\\main\\java\\features"
		,glue={"stepDefinitions"}
		)

public class TestRunner {

}
