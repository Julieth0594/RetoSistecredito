package com.tevolvers.certification.falabella.stepdefinitions;

import com.tevolvers.certification.falabella.exceptions.MessagePaymentException;
import com.tevolvers.certification.falabella.questions.PaymentMethod;
import com.tevolvers.certification.falabella.tasks.DispatchInformation;
import com.tevolvers.certification.falabella.tasks.BuyProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.tevolvers.certification.falabella.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class AddProductsToBagStepDefinitions {

    @Before
    public void preparation(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(BUYER);
        WebDriverManager.chromedriver().setup();


    }

    @Given("^the user is on the website falabella$")
    public void theUserIsOnTheWebsiteFalabella() {
      OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(PAGE_WEB));

    }

    @When("^the user adds (.*) products (.*) to the bag$")
    public void theUserAddsTechnologicalProductToTheBag(int quantity, String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProduct.ofProduct(quantity,product));


    }

    @Then("^the user will be able to visualize that he reaches the payment option$")
    public void theUserWillBeAbleToVisualizeThatHeReachesThePaymentOption() {
        OnStage.theActorInTheSpotlight().should(seeThat(PaymentMethod.ForShipping()).
                orComplainWith(MessagePaymentException.class,MSG_EXCEPTION));

    }
}
