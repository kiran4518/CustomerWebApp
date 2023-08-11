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
import Com.Utility.Takescreenshot;

/**
 * @author mintifi
 *
 */
public class LoginPageTest extends BaseClass{

	LoginPage loginpage;

	@BeforeTest
	public void setup() {
		LaunchApp();
	}

//	@AfterTest
//	public void closed() throws Exception {
//		Thread.sleep(2000);
//		driver.close();
//	}

	@Test(
			priority = 1,
			description = "Logo is displayed with valid name"
			)
	public void TC1() throws Exception {
		this.loginpage = new LoginPage();
		Thread.sleep(3000);
		boolean result = loginpage.validateLogo1();
		Takescreenshot.Screenshot1(driver, "Screnshot");
		AssertJUnit.assertTrue(result);
	}

	@Test(
			priority = 2
			)
	public void TC2() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		String Actual = loginpage.validategreethings();
		String Expected = "Greetings from Mintifi!";
		AssertJUnit.assertEquals(Actual, Expected);
	}

	@Test(
			priority = 3
			)
	public void TC3() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		String actual =loginpage.getSupplyText();
		String expected = "Your Supply Chain Financing Partner \ud83d\udc4b\ud83c\udffd";
		AssertJUnit.assertEquals(actual, expected);
	}

	@Test(
			priority = 4
			)
	public void TC4() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		String actual = loginpage.getMessageText();
		String expected = "Please enter your registered mobile number or If you are new user, activate your credit line now!";
		AssertJUnit.assertEquals(actual, expected);
	}

	@Test(
			priority = 5
			)
	public void TC5() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		String actual = loginpage.getMobileNumberText();
		String expected = "Mobile Number";
		AssertJUnit.assertEquals(actual, expected);
	}

	@Test(
			priority = 6
			)
	public void TC6() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		String actuaL = loginpage.Validateadditinalnumber();
		String expected = "+91";
		AssertJUnit.assertEquals(actuaL, expected);
	}

	@Test(
			priority = 7
			)
	public void TC7() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		loginpage.validteClickOnLoginpage(Prop.getProperty("Number"));
		Takescreenshot.Screenshot1(driver, "Screenshot1");
	}

	@Test(
			priority = 8
			)
	public void TC8() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		loginpage.ClickOnActiveLineLink();
		Takescreenshot.Screenshot1(driver, "Screenshot2");
	}

	@Test(
			priority = 9
			)
	public void TC9() throws Exception {
		loginpage = new LoginPage();
		Thread.sleep(3000);
		loginpage.ValidateClickOnTermsAndCondition();
	}

}
