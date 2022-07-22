package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target SELECT_CATEGORY = Target.the("select category").
            located(By.id("main-CardGrid-e35a3729-ee46-4a4b-ad19-d8df14987800-card-2"));

}
