import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhisek Kumar\\Desktop\\Software Tetsting\\"
    			+ "Selenium WebDriver\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("./Screenshot/screenshot.png"));
		
 
	}

}
