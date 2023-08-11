/**
 * 
 */
package Com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author mintifi
 *
 */
public class BaseClass {

	 public static Properties Prop;
	    public static WebDriver driver;
	    @BeforeTest
	    public void loadconfig() throws IOException {
	        try {
	            Prop = new Properties();
	            System.out.println("Console invoked");
	             File file = new File("/home/mintifi/eclipse-workspace/kiran/CustomerWebApp2/Configure/Config.Properties");
	             FileInputStream io = new FileInputStream(file);
	            Prop.load(io);
	            System.out.println("driver" +driver);
	        }
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        catch (IOException e2) {
	            e2.printStackTrace();
	        }
	    }
	    @Parameters("browser")
	    
	    public static void LaunchApp() {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments(new String[] { "--disable-notifications" });
	        String browserName = Prop.getProperty("Browser");
	        System.out.println("browser : " + browserName);
	        if (browserName.contains("Chrome")) {
	            driver = (WebDriver)new ChromeDriver();
	        }
	        else if (browserName.contains("Firefox")) {
	            driver = (WebDriver)new FirefoxDriver();
	        }
	        else if (browserName.contains("IE")) {
	            driver = (WebDriver)new EdgeDriver();
	        }
	        System.out.println("url : " +Prop.getProperty("Url"));
	        System.out.println("driver : " +driver);
	        driver.get(Prop.getProperty("Url").replace("\"", ""));
	        
	        
	        
	    }
	}
	
	

