package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	
	WebDriver driver = new ChromeDriver();
	@Given("user on homepage")
	public void user_on_homepage() {
		driver.get("http://automationpractice.com/");
	    
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	    
	}

	@Then("user enters {string}")
	public void user_enters(String email) {
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
	    
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='SubmitCreate']"))).click();
		
	    
	}
	@Then("clicks on check box")
	public void clicks_on_check_box() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	   
	}

	@And("user enters {string} {string} {string} {string}")
	public void user_enters(String firstname, String Lastname, String password, String company) {
	    driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(firstname);
	    driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(Lastname);
	    driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@id='company']")).sendKeys(company);
	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
