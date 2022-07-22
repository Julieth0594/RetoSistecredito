package br.com.certification.dafiti.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterDatesPage extends PageObject {
    public static Target EMAIL = Target.the("email").locatedBy("//*[@resource-id='br.com.dafiti:id/form_email']");
    public static Target PASSWORD = Target.the("password").locatedBy("//*[@resource-id='br.com.dafiti:id/form_password']");
    public static Target PASSWORD_CONFIRM = Target.the("password confirm").locatedBy("//*[@resource-id='br.com.dafiti:id/form_password_confirm']");
    public static Target DOCUMENT_TYPE = Target.the("document type").locatedBy("//*[@resource-id='br.com.dafiti:id/form_document_type']");
    public static Target SELECT_DOCUMENT_TYPE = Target.the("select document type").locatedBy("//*[@resource-id='br.com.dafiti:id/md_control']");
    public static Target DOCUMENT_NUMBER = Target.the("document number").locatedBy("//*[@resource-id='br.com.dafiti:id/form_identification']");
    public static Target NAME = Target.the("name").locatedBy("//*[@resource-id='br.com.dafiti:id/form_first_name']");
    public static Target LAST_NAME = Target.the("last name").locatedBy("//*[@resource-id='br.com.dafiti:id/form_last_name']");
    public static Target BIRTHDAY = Target.the("birthday").locatedBy("//*[@resource-id='br.com.dafiti:id/form_birthday']");
    public static Target GENDER = Target.the("gender").locatedBy("//*[@resource-id='br.com.dafiti:id/form_gender']");
    public static Target SELECT_GENDER = Target.the("select gender").locatedBy("(//*[@resource-id='br.com.dafiti:id/md_control'])[2]");
    public static Target REGISTER = Target.the("register").locatedBy("//*[@resource-id='br.com.dafiti:id/register_button']");
}
