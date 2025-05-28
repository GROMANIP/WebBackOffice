package backofficefc.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "backofficefc.steps" }, plugin = { "pretty",
        "html:target/cucumber-reports" }, tags = "@Navegar")

public class Runnerbackoffice{


}



    

