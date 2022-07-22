package com.tevolvers.certification.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.tevolvers.certification.falabella.userinterfaces.Payment.SELECT_PAYMENT;

public class PaymentMethod implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SELECT_PAYMENT).viewedBy(actor).asString().equals("Tipo de entrega");
    }

    public static PaymentMethod ForShipping(){
        return new PaymentMethod();
    }
}
