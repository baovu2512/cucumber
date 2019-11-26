package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class UserManagementPageObject extends AbstractPage {
	WebDriver driver;
	public UserManagementPageObject(WebDriver driver) {
		driver = this.driver;
	}
	
}
