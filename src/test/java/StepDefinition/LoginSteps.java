package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user is on the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Clicks on login button");
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		System.out.println("user should navigate to home page");
	}
}
