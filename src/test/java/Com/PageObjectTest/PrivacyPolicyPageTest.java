/**
 * 
 */
package Com.PageObjectTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.PageObject.LoginPage;
import Com.PageObject.privacyPolicyPage;

/**
 * @author mintifi
 *
 */
public class PrivacyPolicyPageTest extends BaseClass{
	
	 LoginPage loginPage1;
	   privacyPolicyPage PrivacyPolicy;

	   @BeforeTest
	   public void setup() throws Exception {
	      Thread.sleep(2000L);
	      LaunchApp();
	   }

	   @AfterTest
	   public void closed() {
	      driver.close();
	   }

	   @Test(
	      priority = 1
	   )
	   public void VerifyClickOnApplyBtn() throws Exception {
	      loginPage1 = new LoginPage();
	      Thread.sleep(10000L);
	      PrivacyPolicy = loginPage1.ValidateClickOnPrivacyPolicy();
	      PrivacyPolicy.ValidateClickOnApplyBtn();
	   }

	   @Test(
	      priority = 2
	   )
	   public void VerifyClickOnMakePaymentBtn() {
	     loginPage1 = new LoginPage();
	      PrivacyPolicy = loginPage1.ValidateClickOnPrivacyPolicy();

	      try {
	         Thread.sleep(2000L);
	      } catch (Exception var2) {
	         var2.getMessage();
	      }

	     PrivacyPolicy.ValidateClickOnMakePayment();
	   }

	   @Test(
	      priority = 3
	   )
	   public void VerifyCustomerWebAppBtn() throws Exception {
	     loginPage1 = new LoginPage();
	      Thread.sleep(2000L);
	      PrivacyPolicy = loginPage1.ValidateClickOnPrivacyPolicy();
	      PrivacyPolicy.ValidateClickOnCustomerWebAppBtn();
	   }

	   @Test(
	      priority = 4
	   )
	   public void VerifyAboutUsBtn() throws Exception {
	      this.loginPage1 = new LoginPage();
	      Thread.sleep(2000L);
	     PrivacyPolicy = loginPage1.ValidateClickOnPrivacyPolicy();
	      PrivacyPolicy.ValidateClickOnAboutusBtn();
	   }

}
