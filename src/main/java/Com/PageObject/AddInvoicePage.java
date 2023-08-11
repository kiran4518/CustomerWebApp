/**
 * 
 */
package Com.PageObject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class AddInvoicePage extends BaseClass{

	Action act= new Action();
	@FindBy(xpath = "//div[@class='cursor-pointer ml-3 hidden lg:block sm:hidden md:hidden ']//*[name()='svg']")
	WebElement logout1;

	@FindBy(xpath = "//div[@class='font-semibold ml-2']")
	WebElement ValidateUploadNewInvoiceText;

	@FindBy(xpath = "//p[contains(text(),'Enter details of your invoice(s), use Mintifi Cred')]")
	WebElement ValidateVisibleText;

	@FindBy(xpath = "//input[@id='invoiceNo']")
	WebElement EnterInvoiceNumber;

	@FindBy(xpath = "//input[@id='invoiceAmt']")
	WebElement EnterInvoiceAmt;

	@FindBy(xpath = "//input[@id='dateOfIssue']")
	WebElement EnterInvoiceDate;

	@FindBy(xpath = "//input[@id='dueDate']")
	WebElement EnterInvoiceDueDate;

	@FindBy(xpath = "//label[@for='file']")
	WebElement ClickOnUploadFile;

//	@FindBy(xpath = "button[type='submit']")
//	WebElement ClickOnSubmitBtn;

	public AddInvoicePage() {

	}

	public void ClickOnLogOutBtn1() {
		WebElement LogBtn = driver.findElement(By.xpath("//div[@class='cursor-pointer ml-3 hidden lg:block sm:hidden md:hidden ']//*[name()='svg']"));
		WebElement OkBtn1 =driver.findElement(By.cssSelector("button[class='bg-color1 text-white font-bold cursor-pointer px-4 min-w-[81px] py-2 rounded hover:bg-white hover:text-color1 hover:border hover:border-gray-300']"));
		act.click(driver, LogBtn);
		act.click(driver, OkBtn1);
	}

//	public String GetUploadNewInvoiceText() {
//		return ValidateUploadNewInvoiceText.getText();
//	}
//
//	public String GetVisibleText() {
//		WebElement ele0 =driver.findElement(By.xpath("//p[contains(text(),'Enter details of your invoice(s), use Mintifi Cred')]"));
//		return ele0.getText();
//	}

	public void ValidateEnterInvoiceNum(String text) {
	 // Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//input[@class='border border-gray-300 text-sm rounded-lg block w-full pl-7 p-2.5 ']"));
		act.type(element1, text);
	}

	public void ValidateEnterInvoiceAmt(String number) {
		WebElement amt = driver.findElement(By.xpath("//input[@id='invoiceAmt']"));
		act.type(amt, number);
	}

	public void ValidateInvoiceDate(String number) {
		WebElement InvoiceDate =driver.findElement(By.xpath("//input[@id='dateOfIssue']"));
		act.selectBySendkeys(number, InvoiceDate);
	}

	public void ValidateInvoiceDueDate(String number) {
		WebElement DueDate = driver.findElement(By.xpath("//input[@id='dueDate']"));
		act.selectBySendkeys(number, DueDate);
	}

	public void ValidateClickOnUploadFile() throws Exception {
		WebElement uploadfile1 = driver.findElement(By.xpath("//label[@for='file']"));
		act.click(driver, uploadfile1);
		Robot rb = new Robot();
		rb.delay(1000);
		StringSelection ss = new StringSelection("/home/mintifi/Pictures/Statement-of-account (6).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(17);
		rb.keyPress(86);
		rb.keyRelease(17);
		rb.keyRelease(86);
		rb.keyPress(10);
		rb.keyPress(10);
		Thread.sleep(2000L);
	}

	public void ValidateClickOnSubmitBtn() {
		WebElement add = driver.findElement(By.xpath("//button[text()='ADD']"));
		act.click(driver, add);
	}
	
//	public void ValidateBankAccount()
//	{
//		WebElement SelectBank= driver.findElement(By.xpath("//input[@value='28702']"));
//		act.click(driver, SelectBank);
//	}

	public void ValidateClickOnPreviewBtn() {
		WebElement PrevBtn = driver.findElement(By.xpath("//span[text()='Preview']"));
		act.click(driver, PrevBtn);
	}

	public void ValidateClickOnCloseBtn() {
		WebElement closed = driver.findElement(By.xpath("(//*[name()='svg'][@class='w-5 h-5 bg-[#f8f391] rounded-full p-1'])[1]"));
		act.click(driver, closed);
	}

	public FundYourInvoicePage ValidateClickOnSaveForLaterBtn() {
		WebElement SaveForLater = driver.findElement(By.xpath("//button[text()='SAVE FOR LATER']"));
		act.click(driver, SaveForLater);
		return new FundYourInvoicePage();
	}
 public HomePage ValidateFundNowFor()
 {
	 WebElement FundNowFor= driver.findElement(By.xpath("//button[@value='upload-n-fund']"));
	 act.click(driver, FundNowFor);
	return new HomePage();
	
	
   }

}