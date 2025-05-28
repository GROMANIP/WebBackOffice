package backofficefc.runner;

import org.junit.runner.RunWith;
import org.junit.AfterClass;
import backofficefc.pages.BasePageFc;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "backofficefc.steps" }, plugin = { "pretty",
        "html:target/cucumber-reports" }, tags = "@Navegar")

public class Runnerbackoffice{

@AfterClass
    public static void cerrarGhrome() {
    BasePageFc.cerrarNavegador();
    }

}



    

