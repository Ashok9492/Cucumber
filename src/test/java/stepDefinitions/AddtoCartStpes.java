package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddtoCartStpes {
	
	WebDriver driver = new ChromeDriver();
	
	
	
	@Given("uSer on homepage")
	public void u_ser_on_homepage() {
	    driver.get("http://automationpractice.com/");
	}

	@When("user clicks on Women link")
	public void user_clicks_on_women_link() {
		driver.findElement(By.xpath("//a[@title='Women']")).click();
	    
	}

	@Then("Women page should be displayed")
	public void women_page_should_be_displayed() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Women - My Store");
	    
	}

	@Then("user select blouse")
	public void user_select_blouse() {
		driver.findElement(By.xpath("//img[@title='Blouse']")).click();
	    
	}

	@Then("user clicks on View larger and clicks close")
	public void user_clicks_on_view_larger_and_clicks_close() {
	    driver.findElement(By.xpath("(//img[@title='Blouse'])[1]")).click();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Close']"))).click();
	}

	@Then("user enter quantity")
	public void user_enter_quantity() {
	    driver.findElement(By.name("qty")).sendKeys("2");
	}

	@Then("selects size and colour")
	public void selects_size_and_colour() {
	   Select select = new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
	   select.selectByVisibleText("L");
	   driver.findElement(By.name("White")).click();
	}

	@Then("user clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		driver.findElement(By.name("Submit")).click();
		  
	}
	@Then("user close the browser")
	public void user_close_the_browser() {
	    driver.quit();
	}


}
