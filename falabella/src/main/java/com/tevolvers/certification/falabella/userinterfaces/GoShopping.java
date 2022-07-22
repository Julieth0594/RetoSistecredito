package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoShopping extends PageObject {
    public static final Target GO_SHOPPING = Target.the("go shopping").
            locatedBy("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");

    public static final Target QUANTITY = Target.the("select quantity").locatedBy("//button[@class='increase']");
}
