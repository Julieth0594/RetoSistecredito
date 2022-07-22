package br.com.certification.dafiti.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static br.com.certification.dafiti.userinterfaces.CategoryPage.*;
import static br.com.certification.dafiti.userinterfaces.CreateAccountPage.CREATE_ACCOUNT;
import static br.com.certification.dafiti.userinterfaces.HomePage.CATEGORY;
import static br.com.certification.dafiti.userinterfaces.RegisterDatesPage.*;
import static br.com.certification.dafiti.userinterfaces.WelcomePage.ENTER;
import static br.com.certification.dafiti.utils.Constants.*;

public class CreateRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(//Click.on(CLOSE_POPUP),
                Click.on(CATEGORY),
                Click.on(MY_ACCOUNT),
                Click.on(ENTER),
                Click.on(CREATE_ACCOUNT),
                Enter.theValue(INPUT_EMAIL).into(EMAIL),
                Enter.theValue(INPUT_PASSWORD).into(PASSWORD),
                Enter.theValue(INPUT_PASSWORD_CONFIRM).into(PASSWORD_CONFIRM),
                Click.on(DOCUMENT_TYPE),
                Click.on(SELECT_DOCUMENT_TYPE),
                Enter.theValue(INPUT_DOCUMENT_NUMBER).into(DOCUMENT_NUMBER),
                Enter.theValue(INPUT_NAME).into(NAME),
                Enter.theValue(INPUT_LAST_NAME).into(LAST_NAME),
                Enter.theValue(INPUT_BIRTHAY).into(BIRTHDAY),
                Click.on(GENDER),
                Click.on(SELECT_GENDER),
                Click.on(REGISTER)





        );

    }

    public static CreateRegister ofUser(){
        return Tasks.instrumented(CreateRegister.class);
    }
}
