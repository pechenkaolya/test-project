package test;

import com.buildinglink.mainapp.LoginScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class LoginScreenTest {

    private static AppiumDriver<MobileElement> driver;
    private LoginScreen loginScreen;

    @BeforeClass
    public static void setUp() {
        final DesiredCapabilities caps = new	DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "00f1edb5378094e3"); //Android-057
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.buildinglink.mainapp");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.buildinglink.mainapp.login.view.viewcontrollers.activities.SplashActivity");//To specify the	activity which we want to launch
        try {
            driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            System.out.println("Everything is good");
            //PageFactory.initElements(new AppiumFieldDecorator(driver),loginScreen);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void loginWithValidCreds(){

        loginScreen.usernameField.sendKeys("username");
        loginScreen.passwordField.sendKeys("password");
        loginScreen.enterButton.click();
        /*
        driver.findElementById("com.buildinglink.mainapp:id/userNameView").sendKeys("tuser2");
        driver.findElementById("com.buildinglink.mainapp:id/passwordView").sendKeys("tuser2");
        System.out.println("Tests are starting");
        */

    }

}
