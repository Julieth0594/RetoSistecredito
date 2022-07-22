package com.tevolvers.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Dispatch extends PageObject {
    public static final Target EMAIL_REGISTER = Target.the("input email").located(By.id("emailAddress"));

    public static final Target DEPARTMENT = Target.the("select department").locatedBy("//select[@id='region']");

    public static final Target CITY = Target.the("select city").locatedBy("//select[@id='ciudad']");

    public static final Target NEIGHBORHOOD = Target.the("select neighborhood").locatedBy("//select[@id='comuna']");

    public static final Target CONTINUE = Target.the("select continue").
            locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']");

    public static final Target INPUT_ADDRESS = Target.the("input address").located(By.id("address"));

    public static final Target INPUT_DEPARTMENT_SET = Target.the("input departmentnumber").located(By.id("departmentNumber"));

    public static final Target SELECT_INPUT_ADDRESS = Target.the(" select input address").
            locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");

    public static final Target CONTINUE_TO_PAYMENT = Target.the("continue to payment").
            locatedBy("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");




}
