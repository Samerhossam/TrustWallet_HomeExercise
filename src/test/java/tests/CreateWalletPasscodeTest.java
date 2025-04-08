package tests;

import java.net.URISyntaxException;

import org.testng.annotations.Test;

import pages.ConfirmPasscodePage;
import pages.CreatePasscodePage;
import pages.HomePage;
import utils.DriverUtils;

public class CreateWalletPasscodeTest extends BaseTest{

	HomePage homePage;
	CreatePasscodePage createPasscodePage;
	ConfirmPasscodePage confirmPasscodePage;
	
	
	@Test
	
	public void TestCreateWalletButton() throws URISyntaxException {
		
			
		homePage = new HomePage(DriverUtils.getDriver());
		homePage.ClickCreateWalletButtonMethod();	
		}
	
	public void TestCreatePasscode() throws URISyntaxException
	 {	
			createPasscodePage = new CreatePasscodePage(DriverUtils.getDriver());
			createPasscodePage.DeleteEnteredNumberMethod();
			createPasscodePage.CreateValidPasscodeMethod();
	 }
	
	public void TestConfirmPasscode() {
		confirmPasscodePage = new ConfirmPasscodePage(DriverUtils.getDriver());
		confirmPasscodePage.ConfirmInvalidPasscode();
		confirmPasscodePage.AssertErrorMessage();
		confirmPasscodePage.ConfirmValidPasscodeMethod();
	}
	
	
}
