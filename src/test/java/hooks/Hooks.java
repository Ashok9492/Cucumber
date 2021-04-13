package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;
	Properties prop;
	FileInputStream fi;

	@Before
	public void setup() {

		prop = new Properties();
		try {
			fi = new FileInputStream(
					"C:\\Users\\sky\\eclipse-workspace\\cucumber\\src\\test\\java\\hooks\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sky\\Downloads\\" + "chromedriver_win32\\chromedriver.exe");
			//driver = new ChromeDriver();
		} else if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sky\\Downloads" + "\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\sky\\" + "Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {

			System.out.println("Browser does not exist");

		}

	}
}
