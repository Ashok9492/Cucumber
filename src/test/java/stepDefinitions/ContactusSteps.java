package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactusSteps {

	WebDriver driver = new ChromeDriver();

	@Given("User on homepage")
	public void user_on_homepage() {
		driver.get("http://automationpractice.com/");
	    
	}

	@When("user clicks contact us button")
	public void user_clicks_contact_us_button() {
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
	}

	@Then("user select subject heading")
	public void user_select_subject_heading() {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='id_contact']")));
		select.selectByVisibleText("Webmaster");
	}

	@Then("user enters email")
	public void user_enters_email() {
		driver.findElement(By.name("from")).sendKeys("Ashok12222@gmail.com");
	}

	@Then("user enters orderReference")
	public void user_enters_order_reference() {
		driver.findElement(By.name("id_order")).sendKeys("India");
	}

	@Then("user clicks send button")
	public void user_clicks_send_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}
	@Then("Close the browser")
	public void Close_the_browser() {
		driver.quit();
	}
	

}
