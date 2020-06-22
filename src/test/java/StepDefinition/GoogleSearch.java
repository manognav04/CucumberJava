package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class GoogleSearch {
	
	
	WebDriver driver = null;
	
	@Given("Open google chrome")
	public void open_google_chrome() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manognav/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		System.out.println("Browser should open");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("user should be on google search page")
	public void user_should_be_on_google_search_page() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);

	}

	@And("hit on enter")
	public void hit_on_enter() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@Then("user should navigate to specific search page")
	public void user_should_navigate_to_specific_search_page() {
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();

	}


}
