package basePackage;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
public static WebDriver driver = null;
	
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String baseUrl = "http://automationpractice.pl/index.php";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
