package ui.tests;

import org.testng.annotations.Test;

public class LoginTest_NotUI {
	@Test(groups= {"window"})
	public void loginTest1() throws InterruptedException {
		Thread.sleep(2000L);
		System.out.println("loginTest1");
	}
	
	@Test(groups= {"window"})
	public void loginTest2() throws InterruptedException {
		Thread.sleep(2000L);
		System.out.println("loginTest2");
	}
	
	@Test(groups= {"unix"})
	public void loginTest3() throws InterruptedException {
		Thread.sleep(2000L);
		System.out.println("loginTest3");
	}
}
