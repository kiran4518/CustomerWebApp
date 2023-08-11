/**
 * 
 */
package Com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.ActionClass.Action;
import Com.Base.BaseClass;
import Com.DDR.TxnLogingPage;

/**
 * @author mintifi
 *
 */
public class FundYourInvoicePage extends BaseClass{
	
	  Action act= new Action();
	    
	    public String GetFundText() {
	        WebElement fundtext = driver.findElement(By.xpath("//p[text()='Select the invoices you want to fund']"));
	        return fundtext.getText();
	    }

	    public void ValidateClickOnMoreDetails()
	    {
	    	WebElement MoreDetails= driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2)"));
	    	WebElement CancelButton= driver.findElement(By.xpath("(//*[name()='path'][@stroke-linecap='round'])[13]"));
	    	act.click(driver, MoreDetails);
	    	act.click(driver, CancelButton);
	    }
	  
	    public void ValidateClickOnCheckBox()
	    {
	    	WebElement CheckBox= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]/following-sibling::div"));
	    	 act.click(driver, CheckBox);
	    }
	    
	    public void ValidateSelectBankAcc()
	    {
	    	WebElement bankrd= driver.findElement(By.xpath("//input[@value='28702']"));
	    	act.click(driver, bankrd);
	    	
	    }
//	    public void ValidateClickOnUseOwnFundsRadioBtn()
//	    {
//	    	WebElement UseOwnFunds= driver.findElement(By.xpath("//input[@value='banking']"));
//	    	WebElement UPI= driver.findElement(By.xpath("//input[@value='upi']"));
//	    	WebElement NetBanking= driver.findElement(By.xpath("//input[@value='net_banking']"));
//	    	
//	    	act.click(driver, UseOwnFunds);
//	    	act.click(driver, UPI);
//	    	act.click(driver, NetBanking);
//	    }
	    
	    
	   public TxnLogingPage ValidateConfirmFundOf() throws Exception
	   {
		   WebElement ConfirmFundOf= driver.findElement(By.xpath("(//button[@class='bg-color9 text-white rounded text-center font-bold py-3 my-2 mt-0 cursor-pointer w-full hover:bg-[#000060] false'])[1]"));
		   act.click(driver, ConfirmFundOf);
		   driver.navigate().to(Prop.getProperty("URL1"));
		   Thread.sleep(3000);
		   return new TxnLogingPage();
		   
	   }
	   
	   
}
