/**
 * 
 */
package Com.PageObjectTest;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.PageObject.AddInvoicePage;
import Com.PageObject.HomePage;
import Com.PageObject.LoginPage;
import Com.PageObject.NotificationPage;
import Com.PageObject.PayInvoicePage;
import Com.PageObject.ProfilePage;
import Com.PageObject.RepaymentPage;
import Com.PageObject.StatementOfAccountPage;
import Com.PageObject.VerificationPage;
import Com.Utility.Takescreenshot;

/**
 * @author mintifi
 *
 */
public class HomePageTest extends BaseClass {

	LoginPage loginPage1;
	VerificationPage verificationPage;
	HomePage homePage;
	ProfilePage profilePage;
	NotificationPage notificationPage;
	RepaymentPage repaymentPage;
	PayInvoicePage payInvoicePage;
	StatementOfAccountPage statementOfAccountPage;
	AddInvoicePage addInvoicePage;

	@BeforeTest
	public void setup() {
		LaunchApp();
	}

	@Test(
			priority = 1,
			description = "Successfully Login In and open profile View Page"
			)
	public void VerifyClickOnViewPageBtn() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
	verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		profilePage = homePage.ValidateClickOnViewPageBtn();
		Thread.sleep(3000);
		Takescreenshot.Screenshot1(driver, "Screnshot3");
		Thread.sleep(3000);
	profilePage.ValidateLogOutFunctionality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 3,
			description = "Text Should be displayed"
			)
	public void VerifyCreditText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
	homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		String actual = homePage.GetCreditText();
		String expeccted = "Credit Overview";
		Assert.assertEquals(actual, expeccted);
	homePage.ValidateLogoutFunctinality();
	}

	@Test(
			priority = 4,
			description = "Message text should be displayed after creadit available text"
			)
	public void VerifyGetvisiblText() throws Exception {
	loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		String actual = homePage.GetVisibleText();
		String expected = "A quick snapshot of your partner-wise credit limits.";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 5,
			description = "Only condition to verify the loan the not number"
			)
	public void VerifyLoanText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
	verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 1");
		Thread.sleep(3000);
		String actual = homePage.GetLoanText();
		String expexted = "Loan ID:";
		Assert.assertEquals(actual, expexted);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 6,
			description = "Anchor Logo is Displyed Successfull"
			)
	public void VerifyLogo() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 1 ");
		Thread.sleep(3000);
		homePage.ValidateLogo();
		Assert.assertTrue(true);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 7,
			description = "Credit Available text is displayed "
			)
	public void VerifyCreditavailableText() throws Exception {
	loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 ");
		Thread.sleep(3000);
		String actual = homePage.GetCreditavailableText();
		String expected = "Credit Available";
		Assert.assertEquals(actual, expected);
	homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 8,
			description = "Credit utilized text is displyed"
			)
	public void VerifyCreditutilizeText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		String actual = homePage.GetCreditUtilizedText();
		String expected = "Credit Utilized";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 9,
			description = "Utilized amount text is displayed"
			)
	public void VerifyUtilizedText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 ");
		Thread.sleep(3000);
		String actual = homePage.GetUtilizedText();
		String expected = "Utilized";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 10,
			description = "Quick link text is displayed"
			)
	public void VerifyQuickLinkText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 1");
		Thread.sleep(3000);
		String actual = homePage.GetQuickLinkText();
		String expected = "Quick Links";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 11,
			description = "Fund long text is displyed"
			)
	public void VerifyFundText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 1");
		Thread.sleep(3000);
		String actual = homePage.GetFundText();
		String expected = "Get Funds for your invoices, Pay dues, and EMIs.";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 12,
			description = "inoice due text is displayed"
			)
	public void VerifyInvoiceDueText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 1");
		Thread.sleep(3000);
		String actual = homePage.GetInvoiceDueText();
		String expectd = "Invoices due";
		Assert.assertEquals(actual, expectd);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 13,
			description = "Pay text is Available"
			)
	public void VerifyPayText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
	homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		String actual = homePage.GetPayText();
		String expected = "Pay";
		Assert.assertEquals(actual, expected);
	homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 14,
			description = "Invoice text is displayed in capital format"
			)
	public void VerifyInvoiceText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		String actual = homePage.GetInvoiceText();
		String expected = "INVOICES";
		Assert.assertEquals(actual, expected);
	}

	@Test(
			priority = 15,
			description = "Scf dues text is displayed"
			)
	public void VerifySCFDues() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage =verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		String actual = homePage.GetScfDuesText();
		String expected = "SCF dues";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 16,
			description = "Repay text is displayed=="
			)
	public void VerifyrepayText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1 1");
		Thread.sleep(3000);
		String actual = homePage.GetRepayText();
		String expected = "Repay";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 17,
			description = "Repay credit text is displyed"
			)
	public void VerifyRepayCreditText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		String actual = homePage.GetRepayCrediText();
		String expected = "CREDIT";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 18,
			description = "Repayment Credit page will open"
			)
	public void VerifyClickOnRepayCreditBtn() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage =verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		repaymentPage = homePage.ValidateClickOnRepayCreditBtn();
		Thread.sleep(3000);
		repaymentPage.ValidateLogoutFunctionality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 19,
			description = "Upload fund invoice page"
			)
	public void VerifyClickOnPayInvoiceBtn() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1 1");
		Thread.sleep(3000);
		payInvoicePage = homePage.ValidateClickOnPayInvoiceBtn();
		Thread.sleep(7000);
		Thread.sleep(10000);
		payInvoicePage.ClickOnLogOutBtn1();
	}

	@Test(
			priority = 20,
			description = "View SOA button "
			)
	public void VerifyclickOnViewSOABtn() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		statementOfAccountPage = homePage.ValidateClickOnViewSOABtn();
		Thread.sleep(3000);
		statementOfAccountPage.ClickOnLogOutBtn1();
		Thread.sleep(3000);
	}

	@Test(
			priority = 21,
			description = "Unfunded invoice text is displayed"
			)
	public void VerifyUnfundedInvoiceText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
	homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		String actual = homePage.GetUnfundedInvoiceText();
		String expected = "Unfunded Invoices";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 22,
			description = "Funded invoice text is displayed"
			)
	public void VerifyFundedInvoiceText() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
	verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		String actual = homePage.GetFundedinvoiceText();
		String expected = "Funded Invoices";
		Assert.assertEquals(actual, expected);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 23,
			description = "Funded Invoice section has beeen open"
			)
	public void VerifyClickOnFundedInvoiceSection() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		homePage.ValidateClickOnFundedInvoiceSection();
		Thread.sleep(3000);
		homePage.ValidateLogoutFunctinality();
		Thread.sleep(3000);
	}

	@Test(
			priority = 24,
			description = "Add Invoice page will be open"
			)
	public void VerifyClickOnAddInvoiceBtn() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		addInvoicePage =homePage.ValidateClickOnAddInvoiceBtn();
		Thread.sleep(6000);
		addInvoicePage.ClickOnLogOutBtn1();
		Thread.sleep(3000);
	}

	@Test(
			priority = 25,
			description = "Use fund page will be open"
			)
	public void VerifyClickOnUseFundBtn() throws Exception {
		loginPage1 = new LoginPage();
		Thread.sleep(3000);
		verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
		Thread.sleep(3000);
		homePage = verificationPage.OtpFunctionality("1");
		Thread.sleep(3000);
		homePage.ValidateClickOnUseFundBtn();
		Thread.sleep(3000);
	}

}
