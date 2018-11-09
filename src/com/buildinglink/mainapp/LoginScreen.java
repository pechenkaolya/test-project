package com.buildinglink.mainapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class LoginScreen {
    private static AppiumDriver<MobileElement> driver;

    public LoginScreen (AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="com.buildinglink.mainapp:id/userNameView")
    public AndroidElement usernameField;

    @AndroidFindBy (xpath="//android.widget.EditText[@text='PASSWORD']")
    public AndroidElement passwordField;

    @AndroidFindBy (xpath="//android.widget.Button[@text='Enter']")
    public AndroidElement enterButton;


}
