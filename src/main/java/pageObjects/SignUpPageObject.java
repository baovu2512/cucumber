package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.SignUpUI;

public class SignUpPageObject extends AbstractPage {
	WebDriver driver;

	public SignUpPageObject(WebDriver driver) {
		this.driver = driver;

	}

	public void typeToUsername(String s) {
		waitForElementVisible(driver, SignUpUI.SIGNIN_USER_TEXTBOX);
		sendKeyToElement(driver, SignUpUI.SIGNIN_USER_TEXTBOX, s);
	}

	public void clickToDontHaveAccount() {
		waitForElementVisible(driver, SignUpUI.DONT_HAVE_ACCOUNT);
		clickToElement(driver, SignUpUI.DONT_HAVE_ACCOUNT);
	}

	public boolean isAccManFormDisplayed() {
		waitForElementVisible(driver, SignUpUI.ACCOUNT_MANAGER_TITLE);
		return isControlDisplayed(driver, SignUpUI.ACCOUNT_MANAGER_TITLE);
	}

	public boolean isCompanyInforFormDisplayed() {
		waitForElementVisible(driver, SignUpUI.COMPANY_INFOR_TITLE);
		return isControlDisplayed(driver, SignUpUI.COMPANY_INFOR_TITLE);
	}

	public void inputSignUpInformationRandom(String user, String pass, String email) {
		waitForElementVisible(driver, SignUpUI.SIGNUP_USER_TEXTBOX);
		sendKeyToElement(driver, SignUpUI.SIGNUP_USER_TEXTBOX, user);
		sendKeyToElement(driver, SignUpUI.SIGNUP_PASS_TEXTBOX, pass);
		sendKeyToElement(driver, SignUpUI.SIGNUP_EMAIL_TEXTBOX, email);
	}

	public void inputCompanyInformation(String company, String address, String phonenumb, String value) {
		waitForElementVisible(driver, SignUpUI.COMPANY_INFOR_TITLE);
		sendKeyToElement(driver, SignUpUI.SIGNUP_COMPANY_TEXTBOX, company);
		sendKeyToElement(driver, SignUpUI.SIGNUP_ADDRESS_TEXTBOX, address);
		sendKeyToElement(driver, SignUpUI.SIGNUP_PHONENUMB_TEXTBOX, phonenumb);
		clickToElementLabel(driver, value);

	}

	public void clickToNextButton() {
		waitForElementVisible(driver, SignUpUI.SIGNUP_NEXT_BUTTON);
		clickToElement(driver, SignUpUI.SIGNUP_NEXT_BUTTON);
	}

	public void clickToCompleteButton() {
		waitForElementVisible(driver, SignUpUI.COMPLETE_BUTTON);
		clickToElement(driver, SignUpUI.COMPLETE_BUTTON);
	}

	public boolean isSuccessfullyFormDisplayed() {
		waitForElementVisible(driver, SignUpUI.SUCCESS_MESSAGE);
		return isControlDisplayed(driver, SignUpUI.SUCCESS_MESSAGE);
	}

}
