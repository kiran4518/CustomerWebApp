/**
 * 
 */
package Com.DDR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class TxnLogingPage extends BaseClass {
	
	Action act= new Action();
	
	public void  Validateusername(String text)
	{
		WebElement username= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		
		act.type(username, text);
	}
	
	public void ValidatePassword(String text)
	{
		WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		act.type(password, text);

	}
	
	public TxnHomePage ValidateClickOnLoginBtn()
	{
		WebElement login= driver.findElement(By.cssSelector("button[type='button']"));
		 act.click(driver, login);
		 return new TxnHomePage();

	}

}
