package ui.tests;

import org.testng.annotations.Test;

public class HomeTest_NotUI {
	@Test(groups= {"mac"})
	public void HomeTest1() throws InterruptedException {
		Thread.sleep(2000L);
		System.out.println("HomeTest1");
	}
	
	@Test(groups= {"unix"})
	public void HomeTest2() throws InterruptedException {
		Thread.sleep(2000L);
		System.out.println("HomeTest2");
	}
	
	@Test(groups= {"window"})
	public void HomeTest3() throws InterruptedException {
		Thread.sleep(2000L);
		System.out.println("HomeTest3");
	}
}
