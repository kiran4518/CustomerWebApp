/**
 * 
 */
package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class RepaymentPage extends BaseClass{
	
	 Action act = new Action();
	   @FindBy(
	      xpath = "//div[@class='cursor-pointer ml-3 hidden lg:block sm:hidden md:hidden ']//*[name()='svg']"
	   )
	   WebElement ClickOnLogoutButton;
	   @FindBy(
	      css = "button[class='bg-color1 text-white font-bold cursor-pointer px-4 min-w-[81px] py-2 rounded hover:bg-white hover:text-color1 hover:border hover:border-gray-300']"
	   )
	   WebElement ClickOnOkButton;

	   public RepaymentPage() {
	      PageFactory.initElements(driver, this);
	   }

	   public void ValidateLogoutFunctionality() {
	      act.click(driver, ClickOnLogoutButton);
	      act.click(driver, ClickOnOkButton);
	   }

}
