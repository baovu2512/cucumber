package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.SignUpUI;

public class SignInPageObject extends AbstractPage {
	WebDriver driver;

	public SignInPageObject(WebDriver driver) {
		driver = this.driver;
	}

	public void typeToUsername(String s) {
		sendKeyToElement(driver, SignUpUI.SIGNIN_USER_TEXTBOX, s);
	}

	public void clickToDontHaveAccount() {
		clickToElement(driver, SignUpUI.DONT_HAVE_ACCOUNT);
	}
}
