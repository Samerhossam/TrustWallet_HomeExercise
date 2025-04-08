package pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreatePasscodePage extends BasePage{
	
	AppiumDriver driver;
	
	public CreatePasscodePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
	
	public void DeleteEnteredNumberMethod() {
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(0).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(11).click();
	}
	
	public void CreateValidPasscodeMethod() {
		//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='9']"));
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(0).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(8).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(8).click();
	}

}
