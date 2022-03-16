package ui.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase{

	@Test
	public void testDocumentationLinkOnHomePage() {
		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Documentation')]"));
		Assert.assertTrue(we.isDisplayed());
	}
	
	@Test
	public void testProjectsLinkOnHomePage() {
		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Projects')]"));
		Assert.assertTrue(we.isDisplayed());
	}
	
//	public static void main(String[] args) {
//		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Documentation')]"));
//		Assert.assertTrue(we.isDisplayed());
//	}
}
