package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Payment extends PageObject {

    public static final Target SELECT_PAYMENT = Target.the("select payment").
            locatedBy("//h2[@class='fbra_heading fbra_deliverySummary_main_head fbra_deliverySummary__heading fbra_test_deliverySummary__heading']");
}
