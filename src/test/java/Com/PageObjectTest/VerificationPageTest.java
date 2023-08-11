/**
 * 
 */
package Com.PageObjectTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.PageObject.LoginPage;
import Com.PageObject.VerificationPage;

/**
 * @author mintifi
 *
 */
public class VerificationPageTest extends BaseClass{
	
	LoginPage loginPage1;
	   VerificationPage verificationPage;

	   @BeforeTest
	   public void setup() throws Exception {
	      Thread.sleep(3000);
	      LaunchApp();
	   }

//	   @AfterTest
//	   public void closed() throws Exception {
//	      Thread.sleep(2000);
//	      driver.close();
//	   }

	   @Test(
	      priority = 1
	   )
	   public void VerifyLogoText() throws Exception {
	      loginPage1 = new LoginPage();
	      Thread.sleep(3000);
	     verificationPage= loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
	      boolean result = verificationPage.validatelogoo();
	      AssertJUnit.assertTrue(result);
	   }

	   @Test(
	      priority = 2
	   )
	   public void VerifyOtpText() throws Exception {
	     loginPage1 = new LoginPage();
	      verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
	      String actual = verificationPage.GetOtpText();
	      Thread.sleep(2000);
	      String expected = "OTP Verification";
	      AssertJUnit.assertEquals(actual, expected);
	   }

	   @Test(
	      priority = 2
	   )
	   public void VerifyOtpMessageText() throws Exception {
	    loginPage1 = new LoginPage();
	     verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
	      String actual = verificationPage.GetOtpText();
	      Thread.sleep(2000);
	      String expected = "Enter the OTP sent on your mobile number";
	      AssertJUnit.assertEquals(actual, expected);
	   }

	   @Test(
	      priority = 4
	   )
	   public void VerifyUserNumberText() throws Exception {
	     loginPage1 = new LoginPage();
	    verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
	      String actual = verificationPage.ValidateUserNumberText();
	      Thread.sleep(2000);
	      String expected = "+91 ******";
	      AssertJUnit.assertEquals(actual, expected);
	   }

	   @Test(
	      priority = 5
	   )
	   public void VerifyEditFunctionality() throws Exception {
	      loginPage1 = new LoginPage();
	     verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
	      Thread.sleep(2000);
	     verificationPage.ValidateEditFunctionality();
	   }

	   @Test(
	      priority = 3
	   )
	   public void VerifyOtpFunctionality() throws Exception {
	      loginPage1 = new LoginPage();
	     verificationPage = loginPage1.validteClickOnLoginpage(Prop.getProperty("Number"));
	      Thread.sleep(5000);
	     verificationPage.OtpFunctionality("1");
	   }

}
