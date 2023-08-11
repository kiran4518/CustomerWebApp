/**
 * 
 */
package Com.DDRTest;

import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.DDR.TxnHomePage;
import Com.DDR.TxnLogingPage;
import Com.PageObject.AddInvoicePage;
import Com.PageObject.FundYourInvoicePage;
import Com.PageObject.HomePage;
import Com.PageObject.LoginPage;
import Com.PageObject.VerificationPage;

/**
 * @author mintifi
 *
 */
public class TxnLoginPageTest extends BaseClass {

	LoginPage loginPage;
	VerificationPage verificationPage;
	HomePage homePage;
	AddInvoicePage addInvoicePage;
	FundYourInvoicePage fundYourInvoicePage;
	TxnLogingPage txnLogingPage;
	TxnHomePage txnHomePage;

	@BeforeTest
	public void setup()
	{
		LaunchApp();
	}
	//
	//	@AfterTest
	//	public void tearDown()
	//	{
	//		driver.close();
	//	}


@Test
	public void VerifyLoginPageTest() throws Exception
	{
		loginPage=
				new LoginPage();
		Thread.sleep(3000);
		verificationPage=loginPage.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage=verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		addInvoicePage=  homePage.ValidateClickOnAddInvoiceBtn();
		Thread.sleep(4000);
	addInvoicePage.ValidateEnterInvoiceNum(Prop.getProperty("InvoiceNumber"));
		Thread.sleep(3000);
		addInvoicePage.ValidateEnterInvoiceAmt(Prop.getProperty("InvoiceAmt"));
		Thread.sleep(3000);
		 addInvoicePage.ValidateInvoiceDate(Prop.getProperty("InvoiceDate"));
		addInvoicePage.ValidateInvoiceDueDate(Prop.getProperty("InvoiceDueDate"));
		Thread.sleep(3000);
		addInvoicePage.ValidateClickOnUploadFile();
		Thread.sleep(3000);
		addInvoicePage.ValidateClickOnSubmitBtn();
		Thread.sleep(3000);
		
//addInvoicePage.ValidateBankAccount();
// Thread.sleep(2000);
		addInvoicePage.ValidateFundNowFor();

		Thread.sleep(7000);

	 fundYourInvoicePage=homePage.ValidateClickOnUseFundBtn();
		Thread.sleep(7000);

		 fundYourInvoicePage.ValidateClickOnCheckBox();
		Thread.sleep(3000);

	  txnLogingPage=fundYourInvoicePage.ValidateConfirmFundOf();
		Thread.sleep(3000);

		 txnLogingPage.Validateusername(Prop.getProperty("Username"));
		Thread.sleep(2000);
	 txnLogingPage.ValidatePassword(Prop.getProperty("Password"));
		Thread.sleep(3000);
		txnLogingPage.ValidateClickOnLoginBtn();

	}
}
