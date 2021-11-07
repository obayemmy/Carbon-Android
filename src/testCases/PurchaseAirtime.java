package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBse;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class PurchaseAirtime extends TestBse{
Actions action;
	String airtel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[2]";
	String visa ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RadioButton";
	String securePayment = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView";
	String pinField1= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]";
	String pinField2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]";
	String pinField3 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]";
	String pinField4 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]";

	Login login ;
	@Test
	public void buyAirtime() throws Exception {
		login= new Login();
		login.login();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Buy airtime']")));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Buy airtime']")).click();
		Reporter.log("Buy Airtime button  is clicked",true );  


		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='e.g 08031234567']"))).sendKeys("09011142299");
		Reporter.log("Phone Number entered Successfully",true ); 

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='0.00']"))).sendKeys("200");
		Reporter.log("Amount  entered Successfully",true ); 

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(airtel)));
		driver.findElement(By.xpath(airtel)).click();
		Reporter.log("Mobile network is selected", true);

		driver.findElement(By.xpath("//*[@text='Next']")).click();
		Reporter.log("Next button is clicked", true);

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(visa)));
		driver.findElement(By.xpath(visa)).click();
		Reporter.log("Visa Card Option is selected", true);

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Confirm payment']"))).click();
		Reporter.log("Confirm Payment button is clicked",true ); 

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(securePayment))).click();
		Reporter.log("Secure Payment button is clicked",true ); 


		driver.findElement(By.xpath(pinField1)).click();
		action = new Actions(driver);
		action.sendKeys("1").perform();
		Reporter.log("Pin 1 is entered ",true ); 


		driver.findElement(By.xpath(pinField2)).click();
		action.sendKeys("2").perform();
		Reporter.log("Pin 2 is entered ",true ); 

		driver.findElement(By.xpath(pinField3)).click();
		action.sendKeys("3").perform();
		Reporter.log("Pin 3 is entered ",true ); 

		//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='android.widget.FrameLayout]//*[@index='3']"))).sendKeys("4");

		driver.findElement(By.xpath(pinField4)).click();
		action.sendKeys("4").perform();
		Reporter.log("Pin 4 is entered ",true ); 

		//			Reporter.log("One is entered",true ); 









	}

}
