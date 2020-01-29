package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features/cadastro.feature",
  plugin = {"pretty", "html:target/cucumber-html-report"},
  glue = "stepDefinitions",
  tags = {}
  )
public class RunCukesTest{
 
}
