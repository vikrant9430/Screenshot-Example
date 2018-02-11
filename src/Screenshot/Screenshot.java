package Screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	static WebDriver driver;
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhisek Kumar\\Desktop\\Software Tetsting\\"
    			+ "Selenium WebDriver\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");
		Utility.CapturedScreenshot(driver, "Google");
		
	}

	
		
		
		
		

	}


