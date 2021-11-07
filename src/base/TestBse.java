package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBse {
	public static AndroidDriver<WebElement>  driver;

	@BeforeMethod
	public void  setUp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Gbenga\\Downloads\\carbon_ng-v6.7.1_signed.apk");
		cap.setCapability("appPackage", "com.lenddo.mobile.paylater.staging");
		cap.setCapability("appActivity", "com.lenddo.mobile.paylater.home.activity.SplashScreenActivity");
		//URl url = new URL("");
		driver = (AndroidDriver<WebElement>) new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void endSession() {
		driver.quit();
	}

	public static void sleep(int seconds) throws Exception {
		TimeUnit.SECONDS.sleep(seconds);


	}

}
