package pages;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConfirmPasscodePage extends BasePage{
	AppiumDriver driver;
	
	
	public ConfirmPasscodePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
	
	
	public void ConfirmInvalidPasscode() {
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(0).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(4).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(6).click();
	}
	
	public void AssertErrorMessage() {
		String ErrorMessage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Those passwords didn’t match!']")).getText();
		Assert.assertEquals(ErrorMessage, "Those passwords didn’t match!");
	}
	
	
	public void ConfirmValidPasscodeMethod() {
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(0).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(8).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(8).click();
	}

}
