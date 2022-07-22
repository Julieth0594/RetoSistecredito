package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoryPage extends PageObject {

    public static final Target PRODUCT_REFERENCE = Target.the("product reference").locatedBy("//b[text()='{0}']");
}
