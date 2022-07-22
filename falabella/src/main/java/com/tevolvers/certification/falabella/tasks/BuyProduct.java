package com.tevolvers.certification.falabella.tasks;


import com.tevolvers.certification.falabella.interactions.AddQuantity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tevolvers.certification.falabella.userinterfaces.AddToBag.ADD_TO_BAG;
import static com.tevolvers.certification.falabella.userinterfaces.CategoryPage.PRODUCT_REFERENCE;
import static com.tevolvers.certification.falabella.userinterfaces.GoShopping.GO_SHOPPING;
import static com.tevolvers.certification.falabella.userinterfaces.HomePage.SELECT_CATEGORY;
import static com.tevolvers.certification.falabella.userinterfaces.ViewBag.VIEW_BAG;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class BuyProduct implements Task {

    private int quantity;

    private String product;


    public BuyProduct(int quantity, String product) {
        this.quantity = quantity;
        this.product = product;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_CATEGORY),
                WaitUntil.the(PRODUCT_REFERENCE.of(product), isVisible())
                        .forNoMoreThan(5).seconds(),
                Click.on(PRODUCT_REFERENCE.of(product)),
                Click.on(ADD_TO_BAG),
                Click.on(VIEW_BAG),
                AddQuantity.products(quantity),
                Click.on(GO_SHOPPING),
                DispatchInformation.ForProduct()
        );


    }
    public static BuyProduct ofProduct(int quantity, String product){
        return Tasks.instrumented(BuyProduct.class,quantity,product);
    }

}
