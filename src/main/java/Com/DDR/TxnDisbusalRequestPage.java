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
public class TxnDisbusalRequestPage extends BaseClass{
	
	Action act= new Action();

	@FindBy(css = ".c-sidebar-nav-link.c-active")
	WebElement AddUtrBtn;
	
	
	public void ClickOnNumberLink()
	{
		WebElement id= driver.findElement(By.cssSelector("a[href='#/disbursal_request/5668']"));
		act.click(driver, id);
	}

  public void ValidateAuthorizeStage()
  {
	  WebElement dropdown= driver.findElement(By.xpath("//select[@id='dd_status']"));
	  act.selectByIndex(dropdown, 1);
  }
	  public void ValidateSelectType()
	  {
		  WebElement type= driver.findElement(By.xpath("//select[@id='ds_type']"));
		   act.selectByIndex(type, 2);

	  }
	  
	  public void ValidateClickOnSubmitBtn()
	  
	  {
			WebElement proceed = driver.findElement(By.cssSelector("button[class='disableButton1 btn btn-primary btn-sm']"));
		    act.click(driver, proceed);

	  }
	    
	    
  

  public void ValidateInvoiceNumber(String text)
  {
	  WebElement InvoiceNumber= driver.findElement(By.xpath("//input[@id='dd_ques']"));
	   act.type(InvoiceNumber, text);

	  
	    
  }
  
  public void ValidatePIN(String text)
  {
	   WebElement PIN= driver.findElement(By.xpath("//input[@id='dd_pin']"));
	    act.type(PIN, text);

  }
  
  public void ValidateSUBMITBtn()
  {
	  WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
      act.click(driver, submit);

  }
  
  public TxnAddUTRPage ValidateAddUtr()
  {
	  
	  WebElement addutr= driver.findElement(By.cssSelector(".c-sidebar-nav-link.c-active"));
		act.click(driver, addutr);
		
		return  new TxnAddUTRPage();
		}
  }
	


;