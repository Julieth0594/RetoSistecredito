package com.tevolvers.certification.falabella.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_products_to_bag.feature",
        glue = "com.tevolvers.certification.falabella.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class AddProductsToBag {
}
