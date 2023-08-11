/**
 * 
 */
package Com.PageObjectTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.PageObject.AddInvoicePage;
import Com.PageObject.FundYourInvoicePage;
import Com.PageObject.HomePage;
import Com.PageObject.LoginPage;
import Com.PageObject.VerificationPage;

/**
 * @author mintifi
 *
 */
public class AddInvoicePageTest extends BaseClass {

	LoginPage loginPage1;
	VerificationPage verificationPage;
	HomePage homePage;
	AddInvoicePage addInvoicePage;
	FundYourInvoicePage fundYourInvoicePage;

	@BeforeTest
	public void setup() {
		LaunchApp();
	}

	@Test(
			priority = 1,
			description = "Adding new invoice"
			)
	public void VerifyEnterInvoiceNumber() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		
		addInvoicePage = homePage.ValidateClickOnAddInvoiceBtn();
		Thread.sleep(7000);
		
		addInvoicePage.ValidateEnterInvoiceNum(Prop.getProperty("InvoiceNumber"));
		Thread.sleep(3000);
		
		addInvoicePage.ValidateEnterInvoiceAmt(Prop.getProperty("InvoiceAmt"));
		Thread.sleep(3000);
		
		addInvoicePage.ValidateInvoiceDate(Prop.getProperty("InvoiceDate"));
		addInvoicePage.ValidateInvoiceDueDate(Prop.getProperty("InvoiceDueDate"));
		Thread.sleep(7000);
		
		addInvoicePage.ValidateClickOnUploadFile();
		Thread.sleep(3000);
		
		addInvoicePage.ValidateClickOnSubmitBtn();
		Thread.sleep(3000);
		
//	addInvoicePage.ValidateBankAccount();
//	  Thread.sleep(2000);
//	  
		addInvoicePage.ValidateClickOnPreviewBtn();
		Thread.sleep(3000);
		
		addInvoicePage.ValidateClickOnCloseBtn();
		Thread.sleep(4000);
		
		addInvoicePage.ValidateFundNowFor();
		Thread.sleep(3000);
		
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
		
		
	}

}
