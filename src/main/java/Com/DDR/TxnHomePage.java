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
public class TxnHomePage extends BaseClass{
	 
	Action act = new Action();
	
	public TxnDisbusalRequestPage ValidateClickOnPendingAuthorize()
	{
		WebElement btn= driver.findElement(By.cssSelector(".c-sidebar-nav-link[data-child='drawdown:authorize_drawdown']"));
		act.click(driver, btn);
		 return new TxnDisbusalRequestPage();
	}

}
