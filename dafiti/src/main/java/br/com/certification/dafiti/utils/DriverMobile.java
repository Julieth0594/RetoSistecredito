package br.com.certification.dafiti.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverMobile {

    public static WebDriver dafitiApp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Julieth");
        capabilities.setCapability("platformName","ANDROID");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","br.com.dafiti");
        capabilities.setCapability("appActivity","br.com.dafiti.activity.SplashSelectCountry_");
        capabilities.setCapability("noReset",false);
        try {
            return new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),capabilities);
        }catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
