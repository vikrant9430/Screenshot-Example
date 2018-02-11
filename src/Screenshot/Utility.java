package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void CapturedScreenshot(WebDriver driver, String ScreenshotName) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./Screenshot"+ScreenshotName+".png"));
			System.out.println("Screenshot Captured");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}
}
