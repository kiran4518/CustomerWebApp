/**
 * 
 */
package Com.DDR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class TxnAddUTRPage extends BaseClass {
	
	Action act = new Action();
	
	public void ClickOnDrawdown()
	{
		WebElement drawdownid= driver.findElement(By.cssSelector("a[href='#/disbursal_payment/5637']"));
		act.click(driver, drawdownid);
	}
	
	public void ValidateUTRNumber(String number)
	
	{
	WebElement UtrNumber= driver.findElement(By.xpath("//input[@id='utr_number']"));
	act.type(UtrNumber,number );
		
	}

   public void ValidatePayDate(String number)
   {
	   WebElement payDate= driver.findElement(By.xpath("//input[@id='payment_date']"));
	   act.selectBySendkeys(number, payDate);
   }
   
   public void ValidateSubmitBtn()
   {
	   WebElement submit= driver.findElement(By.cssSelector("button[class='disableButton2 btn btn-primary btn-sm']"));
	   act.click(driver, submit);
   }


	
}


