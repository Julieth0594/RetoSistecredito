package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ViewBag extends PageObject {
    public static Target VIEW_BAG = Target.the("view bag").locatedBy("//div[@class='jsx-1941891310 addToCart-btn ']");
}
