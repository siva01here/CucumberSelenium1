package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\EclipseProjects\\Cucumber_Selenium1\\Features\\Test2 - Verify Big Page Many Elements Sections Headers.feature","D://EclipseProjects//Cucumber_Selenium1//Features//Test1.feature"},
			glue="stepDefinitions",
			monochrome=true,
			plugin= {"pretty","html:test-output"},
			tags= {"@sanity"}
			)
public class TestRunnerWithJunit {
}
