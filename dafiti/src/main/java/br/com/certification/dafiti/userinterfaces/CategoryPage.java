package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CategoryPage extends PageObject {

    public static Target MY_ACCOUNT = Target.the("my account").locatedBy("(//*[@resource-id='br.com.dafiti:id/text'])[4]");
    public static Target CATEGORY_PRODUCT = Target.the("my account").locatedBy("(//*[@resource-id='br.com.dafiti:id/text'])[2]");
    public static Target SHOES = Target.the("select shoes").locatedBy("(//*[@resource-id='br.com.dafiti:id/state_view'])[1]");
}
