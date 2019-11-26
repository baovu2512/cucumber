package stepDefinations;

import org.openqa.selenium.WebDriver;

import commons.PageFactoryManager;
import cucumber.api.java.en.Given;
import cucumberOptions.Hooks;
import pageObjects.HomePageObject;

public class HomePageSteps {
	WebDriver driver;
	private HomePageObject homePage;

	public HomePageSteps() {
		driver = Hooks.openAndQuitBrowser();
		homePage = PageFactoryManager.getHomePageObject(driver);

	}

	@Given("^I go to My Office$")
	public void iGoIntoMyOfficePage() {
		homePage.clickToMyOffice();
	}

}
