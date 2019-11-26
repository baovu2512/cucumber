package stepDefinations;

import org.openqa.selenium.WebDriver;

import commons.PageFactoryManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.UserManagementPageObject;

public class UserManagementSteps {
	WebDriver driver;
	UserManagementPageObject userManagementPage;
	public UserManagementSteps() {
		driver = Hooks.openAndQuitBrowser();
		userManagementPage = PageFactoryManager.getUserManagementPageObject(driver);
	}
	
	@Given("^I should see Usermanagement tab$")
	public void iShouldSeeUsermanagementTab()  {
	}

	@When("^I goto Usermanagement TAB$")
	public void iGotoUsermanagementTAB()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click Create User button$")
	public void iClickCreateUserButton()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I fill information for MOD user$")
	public void iFillInformationForMODUser()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click to Create button$")
	public void iClickToCreateButton()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should see MOD user it is created$")
	public void iShouldSeeMODUserItIsCreated()  {

	    
	}

}
