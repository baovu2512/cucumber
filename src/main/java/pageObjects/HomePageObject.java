package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.HomePageUI;

public class HomePageObject extends AbstractPage {
	WebDriver driver;
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToMyOffice() {
		clickToElement(driver, HomePageUI.MY_OFFICE_BUTTON);
	}
}
