/**
 * 
 */
package Com.PageObjectTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.PageObject.LoginPage;
import Com.PageObject.TermsAndConditionPage;

/**
 * @author mintifi
 *
 */
public class TermAndConditionPageTest extends BaseClass {
	LoginPage loginPage1;
	   TermsAndConditionPage termsAndConditionPage;

	   @BeforeTest
	   public void setup() throws Exception {
	      Thread.sleep(3000L);
	      LaunchApp();
	   }

	   @AfterTest
	   public void closed() {
	      driver.close();
	   }

	   @Test(
	      priority = 1
	   )
	   public void VerifyClickOnApplyButton() throws Exception {
	      loginPage1 = new LoginPage();
	      Thread.sleep(3000L);
	     termsAndConditionPage = loginPage1.ValidateClickOnTermsAndCondition();
	      termsAndConditionPage.ValidateClickOnApplyBtn();
	   }

	   @Test(
	      priority = 2
	   )
	   public void VerifyClickOnMakePaymentBtn() throws Exception {
	     loginPage1 = new LoginPage();
	      Thread.sleep(3000L);
	      termsAndConditionPage = loginPage1.ValidateClickOnTermsAndCondition();
	      termsAndConditionPage.ValidateClickOnMakePayment();
	   }

	   @Test(
	      priority = 3
	   )
	   public void VerifuClickOnCustomerWebAppBtn() throws Exception {
	      loginPage1 = new LoginPage();
	      Thread.sleep(3000L);
	      termsAndConditionPage = loginPage1.ValidateClickOnTermsAndCondition();
	      termsAndConditionPage.ValidateClickOnCustomerWebAppBtn();
	   }

	   @Test(
	      priority = 4
	   )
	   public void VerifyClickOnAboutUsBtn() throws Exception {
	      loginPage1 = new LoginPage();
	      Thread.sleep(3000L);
	      termsAndConditionPage = loginPage1.ValidateClickOnTermsAndCondition();
	     termsAndConditionPage.ValidateClickOnAboutusBtn();
	   }

}
