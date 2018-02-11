import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class screenshot {
	@Test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhisek Kumar\\Desktop\\Software Tetsting Material\\Selenium WebDriver\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.56.1:1080/webTours/");
		Utility.CapturedScreenshot(driver, "Browser Started");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//[@name=username]")).sendKeys("test");
		Utility.CapturedScreenshot(driver, "Entered User Name");
			
		driver.findElement(By.xpath(".//*[@name=password]")).sendKeys("test");
		Utility.CapturedScreenshot(driver, "Entered Password");	
		
		driver.findElement(By.xpath(".//*[@name=login]")).click();
		Utility.CapturedScreenshot(driver, "Webtour user dashboard open");
					
		String homepage = driver.getWindowHandle();
		System.out.println("Webtour User Home Page Id:"+homepage);			
		
		driver.quit();
		
		
	
		
		
		
		
			
		
		

	}

}
