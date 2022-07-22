package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage extends PageObject {

    public static Target ENTER = Target.the("enter account").locatedBy("//*[@resource-id='br.com.dafiti:id/label']");
}
