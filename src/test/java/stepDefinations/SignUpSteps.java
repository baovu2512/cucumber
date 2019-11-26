package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import commons.PageFactoryManager;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.SignUpPageObject;

public class SignUpSteps extends AbstractTest {
	WebDriver driver;
	SignUpPageObject signUpPage;
	static String username, pass, email, company, address, phonenumb, role;

	public SignUpSteps() {
		driver = Hooks.openAndQuitBrowser();
		signUpPage = PageFactoryManager.getSignUpPageObject(driver);
	}

	@Given("^I log-in with SUP account$")
	public void iLogInWithSUPAccount() {

	}

	@When("^I click to Don't have an Account\\? button$")
	public void iClickToDonTHaveAnAccountButton() {
		signUpPage.clickToDontHaveAccount();
	}

	@When("^I see sign up screen display$")
	public void iSeeSignUpScreenDisplay() {
		verifyTrue(signUpPage.isAccManFormDisplayed());
	}

	@When("^I fill out account information$")
	public void iFillOutAccountInformation(DataTable table) {
		List<Map<String, String>> information = table.asMaps(String.class, String.class);
		username = information.get(0).get("username");
		pass = information.get(0).get("password");
		email = information.get(0).get("email");
		signUpPage.inputSignUpInformationRandom(username + randomNumber(), pass + randomNumber(),
				email + randomNumber() + "@gmail.com");
	}

	@When("^I fill out company information$")
	public void iFillOutCompanyInformation(DataTable table) throws InterruptedException {
		List<Map<String, String>> information = table.asMaps(String.class, String.class);
		company = information.get(0).get("company");
		address = information.get(0).get("address");
		phonenumb = information.get(0).get("phonenumb");
		role = information.get(0).get("role");
		signUpPage.inputCompanyInformation(company, address, phonenumb, role);
		Thread.sleep(30000);
	}

	@When("^I click Next step button$")
	public void iClickNextStepButton() {
		signUpPage.clickToNextButton();
	}

	@When("^I click Complete button$")
	public void iClickCompleteButton() {
		signUpPage.clickToCompleteButton();
	}

	@Then("^I see Company Information screen display$")
	public void iSeeCompanyInformationScreenDisplay() {
		verifyTrue(signUpPage.isCompanyInforFormDisplayed());
	}

	@Then("^I see Successfully form display$")
	public void iSeeSuccessfullyScreenDisplay() {
		verifyTrue(signUpPage.isSuccessfullyFormDisplayed());
	}
}
