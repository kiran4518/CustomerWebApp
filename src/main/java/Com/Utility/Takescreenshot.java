/**
 * 
 */
package Com.Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class Takescreenshot extends BaseClass {
	
	 public static void Screenshot1(WebDriver driver, String filename) {
	      TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
	      File file = (File)takesScreenshot.getScreenshotAs(OutputType.FILE);

	      try {
	         FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/Screenshot/" + filename + ".png"));
	      } catch (Exception var5) {
	         var5.getMessage();
	      }

	   }

}
