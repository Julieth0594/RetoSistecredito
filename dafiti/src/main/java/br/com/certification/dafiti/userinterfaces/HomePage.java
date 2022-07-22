package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static Target CATEGORY = Target.the("select category").locatedBy("//*[@resource-id='br.com.dafiti:id/banner']");
    public static Target CLOSE_POPUP = Target.the("close popup").locatedBy("//*[@resource-id='br.com.dafiti:id/state_view']");






}
