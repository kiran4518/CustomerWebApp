/**
 * 
 */
package Com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class PayInvoicePage extends BaseClass {
	
	 Action act = new Action();
	   @FindBy(
	      xpath = "//div[@class='cursor-pointer ml-3 hidden lg:block sm:hidden md:hidden ']//*[name()='svg']"
	   )
	   WebElement logout1;

	   public void ClickOnLogOutBtn1() {
	      WebElement OkBtn1 = driver.findElement(By.cssSelector("button[class='bg-color1 text-white font-bold cursor-pointer px-4 min-w-[81px] py-2 rounded hover:bg-white hover:text-color1 hover:border hover:border-gray-300']"));
	      act.click(driver, logout1);
	      act.click(driver, OkBtn1);
	   }

	   public void ClickOnBellIcon() {
	      WebElement bell = driver.findElement(By.xpath("//div[@id='bell-icon']//*[name()='svg']"));
	      act.click(driver, bell);
	   }

}
