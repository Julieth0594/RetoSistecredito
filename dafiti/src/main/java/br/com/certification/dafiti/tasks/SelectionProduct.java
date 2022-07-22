package br.com.certification.dafiti.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static br.com.certification.dafiti.userinterfaces.CategoryPage.CATEGORY_PRODUCT;
import static br.com.certification.dafiti.userinterfaces.CategoryPage.SHOES;
import static br.com.certification.dafiti.userinterfaces.SelectProductPage.*;
import static br.com.certification.dafiti.userinterfaces.SelectProductPage.SELECT_CART;

public class SelectionProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORY_PRODUCT),
                Click.on(SHOES),
                Click.on(SELECT_SHOES),
                Click.on(SELECT_SIZE),
                Click.on(SELECT_CLOSE),
                Click.on(SELECT_CART)
        );

    }

    public static SelectionProduct forUser(){
        return Tasks.instrumented(SelectionProduct.class);
    }
}
