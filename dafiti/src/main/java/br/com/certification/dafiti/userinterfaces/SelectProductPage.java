package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectProductPage extends PageObject {
    public static Target SELECT_SHOES = Target.the("select shoes").locatedBy("//*[@class='android.widget.FrameLayout']//*[@class='android.widget.Button']");

    public static Target SELECT_SIZE = Target.the("select size").locatedBy("(//android.widget.TextView[@resource-id='br.com.dafiti:id/size_item_label'])[4]");

    public static Target SELECT_CLOSE = Target.the("select close ").locatedBy("//android.widget.ImageView[@content-desc='cerca']");
    public static Target SELECT_CART = Target.the("select cart").locatedBy("//android.widget.ImageView[@content-desc='Carrito']");
}
