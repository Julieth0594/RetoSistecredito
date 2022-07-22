package com.tevolvers.certification.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.tevolvers.certification.falabella.userinterfaces.GoShopping.QUANTITY;

public class AddQuantity implements Interaction {

    private int quantity;

    public AddQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i=0;i<quantity-1;i++){
            actor.attemptsTo(
                    Click.on(QUANTITY)
            );
        }

    }

    public static AddQuantity products(int quantity){
        return Tasks.instrumented(AddQuantity.class,quantity);
    }
}
