/**
 * 
 */
package Com.DDRTest;

import java.time.Duration;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.DDR.TxnDisbusalRequestPage;
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
public class TxnDisbursalRequestPageTest extends BaseClass{
	
	
	LoginPage loginPage;
	VerificationPage verificationPage;
	HomePage homePage;
	AddInvoicePage addInvoicePage;
	FundYourInvoicePage fundYourInvoicePage;
	TxnLogingPage txnLogingPage;
	TxnHomePage txnHomePage;
	TxnDisbusalRequestPage disbursalRequestPageTest;


	
	@BeforeTest
	public void setup()
	{
		LaunchApp();
	}

	
//	public void closed()
//	{
//		driver.close();
//	}\
 @Test
	public void VerifyDisbursalRequestPage() throws Exception
	{
		
	loginPage=
			new LoginPage();
	Thread.sleep(3000);
	verificationPage=loginPage.validteClickOnLoginpage(Prop.getProperty("Number"));
	Thread.sleep(3000);
	homePage=verificationPage.OtpFunctionality("1");
	Thread.sleep(4000);
	addInvoicePage= homePage.ValidateClickOnAddInvoiceBtn();
	Thread.sleep(9000);
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
//Thread.sleep(2000);
	addInvoicePage.ValidateFundNowFor();

	Thread.sleep(10000);

 fundYourInvoicePage=homePage.ValidateClickOnUseFundBtn();
	Thread.sleep(9000);

	 fundYourInvoicePage.ValidateClickOnCheckBox();
	Thread.sleep(3000);

  txnLogingPage=fundYourInvoicePage.ValidateConfirmFundOf();
	Thread.sleep(3000);

	 txnLogingPage.Validateusername(Prop.getProperty("Username"));
	Thread.sleep(2000);
 txnLogingPage.ValidatePassword(Prop.getProperty("Password"));
	Thread.sleep(3000);
	txnHomePage=txnLogingPage.ValidateClickOnLoginBtn();
	 Thread.sleep(Duration.ofMinutes(2));
	disbursalRequestPageTest= txnHomePage.ValidateClickOnPendingAuthorize();
	 
	 Thread.sleep(2000);
	  
	 disbursalRequestPageTest.ClickOnNumberLink();
	  Thread.sleep(5000);
	  disbursalRequestPageTest.ValidateAuthorizeStage();
	    Thread.sleep(3000);
	    
	    disbursalRequestPageTest.ValidateSelectType();
	      Thread.sleep(3000);
	      disbursalRequestPageTest.ValidateClickOnSubmitBtn();
	      Thread.sleep(3000);
	  
	  disbursalRequestPageTest.ValidateAddUtr();
	  
	 
}

}
