package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject {

    public static Target TEXT_SHOES = Target.the("text shoes").locatedBy("//android.widget.TextView[@resource-id='br.com.dafiti:id/item_desc']");
}
