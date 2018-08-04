package codeSample.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/codeSample/feature",
glue="codeSample")
public class BookTestRunner
{

}
