package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage extends PageObject {
    public static Target CREATE_ACCOUNT = Target.the("create account").locatedBy("//*[@resource-id='br.com.dafiti:id/create_account']");
}
