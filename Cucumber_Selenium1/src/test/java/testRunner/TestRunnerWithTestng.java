package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {".//Features/"},
				glue="stepDefinitions",
				monochrome=true,
				plugin= {"html:target/test-report","pretty:target/json-report.json"},
				tags= {"@functional"}
	)

public class TestRunnerWithTestng extends AbstractTestNGCucumberTests{

}
