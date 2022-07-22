package br.com.certification.dafiti.stepdefinitions;

import br.com.certification.dafiti.exceptions.CartException;
import br.com.certification.dafiti.questions.Verification;
import br.com.certification.dafiti.tasks.CreateRegister;
import br.com.certification.dafiti.tasks.SelectionProduct;
import br.com.certification.dafiti.utils.DriverMobile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static br.com.certification.dafiti.utils.Constants.MSG_EXCEPTION;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class CreateRegisterStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverMobile.dafitiApp())));
        OnStage.theActorCalled("Buyer");
    }
    @Given("^the user is on the app dafiti$")
    public void theUserIsOnTheAppDafiti() {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateRegister.ofUser());

    }


    @When("^the user registers and selects the product$")
    public void theUserRegistersAndSelectsTheProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectionProduct.forUser());

    }

    @Then("^the user can view the product in the shopping cart$")
    public void theUserCanViewTheProductInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(seeThat(Verification.productOfCart())
                .orComplainWith(CartException.class,MSG_EXCEPTION));

    }

}
