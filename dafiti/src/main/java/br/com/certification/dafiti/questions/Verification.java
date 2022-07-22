package br.com.certification.dafiti.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static br.com.certification.dafiti.userinterfaces.CartPage.TEXT_SHOES;

public class Verification implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TEXT_SHOES).viewedBy(actor).asString().equals("Tenis Lifestyle Blanco-Gris Royal County of Berkshire Polo Club");
    }
    public static Verification productOfCart(){
        return new Verification();
    }
}
