package test.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class login {
    public static void main(String[] args) {
        try {
            AppiumDriver<MobileElement> appiumDriver;
            // AppiumDriver driver;

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
            desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
            desiredCapabilities.setCapability("avd","S20 API 31");

            // driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
            URL appiumServer = new URL("http://localhost:4723/wd/hub");

            appiumDriver = new AppiumDriver<>(appiumServer, desiredCapabilities);

           appiumDriver.findElementsByAccessibilityId("00000000-0000-001f-ffff-ffff0000007b");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
