package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FormSubmission {
	static WebDriver d;
	public static void fillForm(WebDriver driver, String pageUrl) {
		driver.get(pageUrl);
		driver.findElement(By.id("fname")).sendKeys("Fizz");
		driver.findElement(By.id("lname")).sendKeys("Buzz");
		driver.findElement(By.id("email")).sendKeys("fizz_buzz@hackerrank.com");
		driver.findElement(By.id("password")).sendKeys("fizz_buzz@Hrw");
		driver.findElement(By.id("c_password")).sendKeys("c_fizz_buzz@Hrw");
		
	}
	
	public static void submitForm(WebDriver driver) {
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
	}
	
//	public static void execute() {
//		d = new HtmlUnitDriver();
//		fillForm(d,"home");
//		submitForm(d);
//	}
	
}

// Select T1.CITY_NAME, AVG(REVENUE) from Cities T1, Revenue T2
//where T1.CITY_CODE = T2.CITY_CODE
