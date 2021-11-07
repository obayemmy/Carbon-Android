package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBse;

public class FundWallet extends TestBse{
	String pinField1= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]";
	String pinField2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]";
	String pinField3 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]";
	String pinField4 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]";

	Actions action;
	String visa = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RadioButton";
	Login log ;
	@Test
	public void fundWallet() throws Exception {
		log = new Login();
		log.login();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Fund Wallet']")).click();
		Reporter.log("Fund Wallet button is clicked", true);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add money with a debit card']")).click();
		Reporter.log("Add Money With Card button is clicked", true);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
		Reporter.log("Continue button is clicked", true);
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='0.00']")).sendKeys("5000");
		Reporter.log("5000 is entered", true);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Proceed']")).click();
		Reporter.log("Proceed Button is clicked", true);
		
		driver.findElement(By.xpath(visa)).click();
		Reporter.log("Visa  Button is clicked", true);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm payment']")).click();
		Reporter.log("Confirm Payment  button is clicked", true);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Securely pay ₦5,050']")).click();
		Reporter.log("Secure Pay button is clicked", true);
		
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
		
		
		
		
		
		
	}
	

}

