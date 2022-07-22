package com.tevolvers.certification.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tevolvers.certification.falabella.userinterfaces.Dispatch.*;
import static com.tevolvers.certification.falabella.userinterfaces.Payment.SELECT_PAYMENT;
import static com.tevolvers.certification.falabella.utils.Constants.*;

public class DispatchInformation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue((EMAIL)).into(EMAIL_REGISTER),
                SelectFromOptions.byVisibleText(SELECT_DEPARTMENT).from(DEPARTMENT),
                SelectFromOptions.byVisibleText(SELECT_CITY).from(CITY),
                SelectFromOptions.byVisibleText(SELECT_NEIGBORHOOD).from(NEIGHBORHOOD),
                Click.on(CONTINUE),
                Enter.theValue((ADDRESS)).into(INPUT_ADDRESS),
                Enter.theValue((APARTMENT_OR_SET)).into(INPUT_DEPARTMENT_SET),
                Click.on(SELECT_INPUT_ADDRESS),
                Click.on(CONTINUE_TO_PAYMENT),
                WaitUntil.the(SELECT_PAYMENT, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds()
        );

    }

    public static DispatchInformation ForProduct(){
        return Tasks.instrumented(DispatchInformation.class);
    }
}
