package runnertest;
/*
 * Here we are trying to execute two feature files out of 10 
 */
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/test/java/FeaturesFile/Login.feature","src/test/java/FeaturesFile/Register.feature","src/test/java/FeaturesFile/SForgotPass.feature"}
, 
glue="scripts",
plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/CucumberTestReport.json"
    }
)
public class smoketest1 extends AbstractTestNGCucumberTests
 {
  
 }
