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
public class privacyPolicyPage extends BaseClass{
	
    Action act= new Action();
    
    @FindBy(xpath = "//div[@class='menuBtn']//a[@class='make-payment'][normalize-space()='Make Payment']")
    WebElement ClickOnMakePayment;
    
    @FindBy(xpath = "//div[@class='container']//a[@target='_blank'][normalize-space()='Customer App']")
    WebElement ClickOnCustomerAppBtn;
    
    @FindBy(xpath = "//div[@class='container']//ul[@class='header-rig']//li//a[@href='about'][normalize-space()='About Us']")
    WebElement ClickOnAboutUs;
    
    public privacyPolicyPage() {
        PageFactory.initElements(driver, this);
    }
    
    public OnbordingPage ValidateClickOnApplyBtn() throws Exception {
        Thread.sleep(10000L);
         WebElement element1 = privacyPolicyPage.driver.findElement(By.xpath("//a[text()='Apply Now']"));
        act.click(privacyPolicyPage.driver, element1);
        return new OnbordingPage();
    }
    
    public RepaymentOfDuePage ValidateClickOnMakePayment() {
        act.click(privacyPolicyPage.driver,ClickOnMakePayment);
        return new RepaymentOfDuePage();
    }
    
    public LoginPage ValidateClickOnCustomerWebAppBtn() {
        act.click(privacyPolicyPage.driver, ClickOnCustomerAppBtn);
        return new LoginPage();
    }
    
    public void ValidateClickOnAboutusBtn() {
        act.click(privacyPolicyPage.driver, ClickOnAboutUs);
    }

}
