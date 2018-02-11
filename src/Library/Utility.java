package Library;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
public class Utility {
	public static void CapturedScreenshot(WebDriver driver, String ScreenshotName) {		
		
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshot/"+ScreenshotName+".png"));
			System.out.println("Screenshot Captured");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception while taking Screenshot"+e.getMessage());
		}
		
	}
}


