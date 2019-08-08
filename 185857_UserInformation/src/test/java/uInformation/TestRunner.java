package uInformation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/user"}, glue= {"uInformation"}, plugin= {"pretty"})
public class TestRunner {

}
