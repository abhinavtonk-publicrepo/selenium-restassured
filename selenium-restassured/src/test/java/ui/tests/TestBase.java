package ui.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBase {
	private static String frameworkConfigPath = System.getProperty("user.dir") + "/src/test/resources/ui/uiframework.properties";	
	private static String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/ui/chromedriver.exe";
	private static String firefoxDriverPath = System.getProperty("user.dir") + "/src/test/resources/ui/geckodriver.exe";
	static Properties frameWorkProperties;
	static WebDriver driver;
	
	enum FRAMEWORK_PROPERTIES{
		URL(frameWorkProperties.getProperty("url")),
		BROWSER(frameWorkProperties.getProperty("browser"));
		private String value;

		FRAMEWORK_PROPERTIES(String value){
			this.value = value;
		}

		public String getValue(){
			return value;
		}	
		
	}
	
	static {
		try {
			initializeFramework();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Properties initializeProperty(String filePath) throws IOException {
		Properties properties = new Properties();
		File file = new File(filePath);
		FileInputStream fio = new FileInputStream(file);
		properties.load(fio);
		return properties;		
	}
	
	public static void initializeFramework() throws IOException {
		frameWorkProperties=initializeProperty(frameworkConfigPath);
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void launchBrowser() {
		
		if(FRAMEWORK_PROPERTIES.BROWSER.getValue().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		}
		else if(FRAMEWORK_PROPERTIES.BROWSER.getValue().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
		}
		
		driver.get(FRAMEWORK_PROPERTIES.URL.getValue());
		
	}
}
