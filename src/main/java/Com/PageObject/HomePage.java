/**
 * 
 */
package Com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ActionClass.Action;
import Com.Base.BaseClass;

/**
 * @author mintifi
 *
 */
public class HomePage extends BaseClass {

	Action act= new Action();
	@FindBy(css = "a[class='bg-[#3B61FF] hover:bg-[#3b82f6] shadow-lg text-[10px] px-2 rounded font-semibold']")
	WebElement ClickViewPageBtn;
	
	@FindBy(xpath = "//div[@id='bell-icon']//*[name()='svg']")
	WebElement ClickNotificatonBtn;
	
	@FindBy(xpath = "//span[@class='cursor-pointer']//*[name()='svg']")
	
		WebElement ClickOnClose;
	
	@FindBy(xpath = "//p[text()='Credit Overview']")
	WebElement CreditText;
	
	@FindBy(xpath = "//p[text()='A quick snapshot of your partner-wise credit limits.']")
	WebElement VisibleText;
	
	@FindBy(xpath = "//p[text()='Loan ID:']")
	WebElement LoanText;
	
	@FindBy(xpath = "//img[@alt='anchor_logo']")
	WebElement Logo;
	
	@FindBy(xpath = "//p[text()='Credit Available']")
	WebElement CreditAvailableText;
	
	@FindBy(xpath = "//p[text()='Credit Utilized']")
	WebElement CreditUtilizedText;
	
	@FindBy(xpath = "//*[name()='text' and contains(@class,'text-[11px')]")
	WebElement UtilizedText;
	
	@FindBy(xpath = "//p[text()='Quick Links']")
	WebElement QuickLinksText;
	
	@FindBy(xpath = "//p[text()='Get Funds for your invoices, Pay dues, and EMIs.']")
	WebElement FundText;
	
	@FindBy(xpath = "//p[text()='Invoices due']")
	WebElement InvoiceDueText;
	
	@FindBy(xpath = "//p[text()='Pay']")
	WebElement PayText;
	
	@FindBy(xpath = "//p[text()='INVOICES']")
	WebElement InvoicesText;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > p:nth-child(1)")
	WebElement SCFDuesText;
	
	@FindBy(css = "a[class='bg-[#00109f] hover:bg-[#000060] py-2 text-white cursor-pointer block rounded-br-lg false'] p[class='text-xs']")
	WebElement RepayText;
	
	@FindBy(css = "a[class='bg-[#00109f] hover:bg-[#000060] py-2 text-white cursor-pointer block rounded-br-lg false'] p[class='font-semibold']")
	WebElement RepayCreditText;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > a:nth-child(2)")
	WebElement ClickOnRepayCreditBtn;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > a:nth-child(2)")
	WebElement ClickOnPayInvoiceBtn;
	
	@FindBy(css = "button[class='flex text-[14px] font-bold text-color2 mr-1 hover:text-[#000070]']")
	WebElement ViewSOABtn;
	
	@FindBy(xpath = "//a[text()='Unfunded Invoices']")
	WebElement UnfundedInvoiceText;
	
	
	@FindBy(xpath = "//a[text()='Funded Invoices']")
	WebElement FundedInvoiceText;
	
	@FindBy(css = "a[class=' px-3 py-3 shadow-lg rounded-t-lg block leading-normal hover:bg-[#e2e8f0]']")
	WebElement ClickOnFundedInvoicSection;
	
	@FindBy(css = "a[class=' px-3 py-3 shadow-lg rounded-t-lg block leading-normal hover:bg-[#e2e8f0] hover:text-blue-900']")
	WebElement ClickOnUnfundedInvoicesSection;
	
	
	@FindBy(xpath = "//button[text()='ADD INVOICE']")
	WebElement ClickOnAddInvoiceBtn;
	
	
	@FindBy(css = "button[class='text-[14px] rounded-lg font-bold px-3 py-2 text-white bg-color9 hover:bg-[#000070] w-[105px] undefined']")
	WebElement ClickOnUseFundBtn;
	
	@FindBy(xpath = "//div[@class='cursor-pointer ml-3 hidden lg:block sm:hidden md:hidden ']//*[name()='svg']")
	WebElement ClickOnLogoutBtnn;
	
	@FindBy(css = "button[class='bg-color1 text-white font-bold cursor-pointer px-4 min-w-[81px] py-2 rounded hover:bg-white hover:text-color1 hover:border hover:border-gray-300']")
	WebElement ClickOnOkBtnn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public ProfilePage ValidateClickOnViewPageBtn() {
		act.click(HomePage.driver, ClickViewPageBtn);
		return new ProfilePage();
	}

	public NotificationPage ValidateClickOnNotificationBtn() {
		act.click(HomePage.driver, ClickNotificatonBtn);
		return new NotificationPage();
	}

	public String GetCreditText() {
		return CreditText.getText();
	}

	public String GetVisibleText() {
		return VisibleText.getText();
	}

	public String GetLoanText() {
		return LoanText.getText();
	}

	public boolean ValidateLogo() {
		return Logo.isDisplayed();
	}

	public String GetCreditavailableText() {
		return CreditAvailableText.getText();
	}

	public String GetCreditUtilizedText() {
		return CreditUtilizedText.getText();
	}

	public String GetUtilizedText() {
		return UtilizedText.getText();
	}

	public String GetQuickLinkText() {
		return QuickLinksText.getText();
	}

	public String GetFundText() {
		return FundText.getText();
	}
	
	public String GetInvoiceDueText() {
		return InvoiceDueText.getText();
	}

	public String GetPayText() {
		return PayText.getText();
	}

	public String GetInvoiceText() {
		return InvoicesText.getText();
	}

	public String GetScfDuesText() {
		return SCFDuesText.getText();
	}

	public String GetRepayText() {
		return RepayText.getText();
	}

	public String GetRepayCrediText() {
		return RepayCreditText.getText();
	}

	public RepaymentPage ValidateClickOnRepayCreditBtn() {
		act.click(driver, ClickOnRepayCreditBtn);
		return new RepaymentPage();
	}

	public PayInvoicePage ValidateClickOnPayInvoiceBtn() {
		act.click(driver, ClickOnPayInvoiceBtn);
		return new PayInvoicePage();
	}

	public StatementOfAccountPage ValidateClickOnViewSOABtn() {
		act.click(driver, ViewSOABtn);
		return new StatementOfAccountPage();
	}

	public String GetUnfundedInvoiceText() {
		return UnfundedInvoiceText.getText();
	}

	public String GetFundedinvoiceText() {
		return FundedInvoiceText.getText();
	}

	public void ValidateClickOnFundedInvoiceSection() {
		act.click(driver, ClickOnFundedInvoicSection);
	}

	public void ValidateClickOnUnfundedInvoiceSection() {
		act.click(driver, ClickOnUnfundedInvoicesSection);
	}

	public AddInvoicePage ValidateClickOnAddInvoiceBtn() {
		act.click(driver, ClickOnAddInvoiceBtn);
		Action.scrollByIndex(driver, ClickOnAddInvoiceBtn);
		return new AddInvoicePage();
	}

	public FundYourInvoicePage ValidateClickOnUseFundBtn() {
		
		WebElement usedFund= driver.findElement(By.cssSelector("button[class='text-[14px] rounded-lg font-bold px-3 py-2 text-white bg-color9 hover:bg-[#000070] w-[105px] false']"));
		act.click(driver, usedFund);
		return new FundYourInvoicePage();
	}

	public void ValidateLogoutFunctinality() {
		act.click(driver,ClickOnLogoutBtnn);
		act.click(driver, ClickOnOkBtnn);
	}

}
