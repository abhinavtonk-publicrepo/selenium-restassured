package ui.selenium_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test1 {
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser"})
	public void beforeTest(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/ui/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/ui/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.selenium.dev/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testDownloadLinksPresence() {
	WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
	Assert.assertTrue(we.isDisplayed());
	}
	
	@Test
	public void testProjectsLinksPresence() {
	WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Projects')]"));
	Assert.assertTrue(we.isDisplayed());
	}
	
	@Test
	public void testDocumentationLinksPresence() {
	WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Documentation')]"));
	Assert.assertTrue(we.isDisplayed());
	}
	
	//--------------------------------------
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
