package pDetails;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/payment"}, glue= {"pDetails"}, plugin= {"pretty"})
public class TestRunner {

}
