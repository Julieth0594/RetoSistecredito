package br.com.certification.dafiti.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_register.feature",
        glue = "br.com.certification.dafiti.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CreateRegister {
}
