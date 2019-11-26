package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObject;
import pageObjects.SignUpPageObject;
import pageObjects.UserManagementPageObject;

public class PageFactoryManager {

	public static SignUpPageObject getSignUpPageObject(WebDriver driver) {
		return new SignUpPageObject(driver);
	}

	public static HomePageObject getHomePageObject(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static UserManagementPageObject getUserManagementPageObject(WebDriver driver) {
		return new UserManagementPageObject(driver);
	}

	public static SignUpPageObject getSignInPageObject(WebDriver driver) {
		return new SignUpPageObject(driver);
	}
}
