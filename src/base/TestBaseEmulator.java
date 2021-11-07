package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TestBaseEmulator {
	public static AndroidDriver<WebElement> driver;
	static DesiredCapabilities capabilities ;

	@BeforeTest
	public static void  setUp() throws Exception {
		capabilities	= new DesiredCapabilities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554   device");

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Infinix HOT 9");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lenddo.mobile.paylater.staging");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lenddo.mobile.paylater.home.activity.SplashScreenActivity");
		//capabilities.setCapability(MobileCapabilityType.APP, "APP_FILE_PATH");

		URL url = new URL("http://127.0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}

	public static void sleep(int seconds) throws Exception {
		TimeUnit.SECONDS.sleep(seconds);


	}

}
