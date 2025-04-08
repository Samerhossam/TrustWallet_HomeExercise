package pages;

import java.time.Duration;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class HomePage extends BasePage{
	AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
	
	public void ClickCreateWalletButtonMethod() {
		driver.findElements(AppiumBy.className("android.widget.Button")).get(0).click();
	}
	
}
