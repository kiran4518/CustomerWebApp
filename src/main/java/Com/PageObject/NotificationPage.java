/**
 * 
 */
package Com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class NotificationPage extends BaseClass {
	
	   Action act = new Action();

	   public void ClickOnLogOutBtn() {
	      WebElement logout = driver.findElement(By.xpath("//div[@class='cursor-pointer ml-3 hidden lg:block sm:hidden md:hidden ']//*[name()='svg']"));
	      WebElement OkBtn = driver.findElement(By.cssSelector("button[class='bg-color1 text-white font-bold cursor-pointer px-4 min-w-[81px] py-2 rounded hover:bg-white hover:text-color1 hover:border hover:border-gray-300']"));
	      this.act.click(driver, logout);
	      this.act.click(driver, OkBtn);
	   }

}
