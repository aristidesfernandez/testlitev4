package co.com.ies.smolplus.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import co.com.ies.smolplus.ComponentTest;

@ComponentTest
@RunWith(Cucumber.class)
@CucumberOptions(
  glue = "co.com.ies.smolplus",
  plugin = {
    "pretty", "json:target/cucumber/cucumber.json", "html:target/cucumber/cucumber.htm", "junit:target/cucumber/TEST-cucumber.xml",
  },
  features = "src/test/features"
)
public class CucumberTest {}
