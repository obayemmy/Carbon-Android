package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBse;

public class Login extends TestBse{

	@Test
	public void login() throws Exception {
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Skip']"))).click();
		Reporter.log("Skip button is clicked", true);

		//	driver.findElement(By.xpath("//*[@text='Skip']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
		Reporter.log("Allow button is clicked", true);

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Sign In']")));
		driver.findElement(By.xpath("//*[@text='Sign In']")).click();
		Reporter.log("Sign in  button is clicked", true);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement phoneField = driver.findElement(By.xpath("//android.widget.EditText[@text='Phone number']"));
		phoneField.sendKeys("08990001100");
		Reporter.log("Phone number entered",true );

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pinField = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter PIN']"));
		pinField.sendKeys("1234");
		Reporter.log("Pin   entered",true );  
		sleep(10);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement signInBtn = driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']"));
		signInBtn.click();
		Reporter.log("Sign in clicked",true );  

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='Not right now']")));
		driver.findElement(By.xpath("//android.widget.Button[@text='Not right now']")).click();
		Reporter.log("Not right now is clicked",true );  

		//		


	}
}
