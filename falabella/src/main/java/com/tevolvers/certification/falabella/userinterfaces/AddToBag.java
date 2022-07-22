package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddToBag extends PageObject {

    public static final Target ADD_TO_BAG = Target.the("agregate to bag").locatedBy("//button[@class='jsx-2166277967 button button-primary button-primary-xtra-large']");
}
