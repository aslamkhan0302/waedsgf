package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	static AppiumDriver<MobileElement> driver;
	
public static void main(String[] args) throws Exception {
	calculator();
}
public static void calculator() throws Exception {
	DesiredCapabilities dss = new DesiredCapabilities();
	dss.setCapability("deviceName", "Redmi Note 4");
	dss.setCapability("udid", "9581cceb0903");
	dss.setCapability("platformName", "Android");
	dss.setCapability("platformVersion", "7.0 NRD90M");
	dss.setCapability("appPackage", "com.miui.calculator ");
	dss.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
	URL url = new URL("https://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url,dss);
} 
}
