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
public class LoginPage extends BaseClass{

    Action act = new Action();
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[1]/img")
    WebElement ValidateLogo;
    
    @FindBy(css = "p[class*='text-2xl font-medium mb-[10px] color-color1']")
    WebElement ValidateGreethisngtext;
    
    @FindBy(css = "p[class='text-xl text-gray-600 font-medium mb-[10px] color-color1']")
    WebElement ValidateSupplyText;
    
    @FindBy(css = "p[class='text-sm text-gray-600 mb-[30px] color-color1']")
    WebElement ValidateMessageText;
    
    @FindBy(css = "label[class='color-color1']")
    WebElement ValidateMobileNumberText;
    
    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(5) > div:nth-child(2) > span:nth-child(1)")
    WebElement ValidateAdditional91;
    
    @FindBy(id = "phone")
    WebElement ValidatePhoneNumber;
    
//    @FindBy(xpath = "//button[text()='Login']")
//    WebElement ValidateClickOnLoginButton;
    
    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)")
    WebElement ValidateClickOnActiveLine;
    
    @FindBy(css = "a[class='text-xs text-color1 font-semibold hover:text-[#000070] hover:underline']")
    WebElement ValidateClickOnTermsAndCondition;
    
    @FindBy(css = "a[class='text-xs mt-1 block text-color1 font-semibold hover:text-[#000070] hover:underline']")
    WebElement ValidateClickOnPrivatePilocy;
    
    @FindBy(xpath = "//*[@id=\"ymDivCircle\"]/img")
    WebElement ValidateMintifiLogo;
    
    public LoginPage() {
    
        PageFactory.initElements(driver, this);
        
    }
    
    public boolean validateLogo1() {
        WebElement ele = driver.findElement(By.cssSelector("img[src='data:image/png;base64,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']"));
        return act.isDispayed(driver, ele);
    }
    
    public String validategreethings() {
        return ValidateGreethisngtext.getText();
    }
    
    public String getSupplyText() {
        return ValidateSupplyText.getText();
    }
    
    public String getMessageText() {
        return ValidateMessageText.getText();
    }
    
    public String getMobileNumberText() {
        return ValidateMobileNumberText.getText();
    }
    
    public String Validateadditinalnumber() {
        return ValidateAdditional91.getText();
    }
    
    public VerificationPage validteClickOnLoginpage(String number) throws Exception {
    	
    	WebElement ele1= driver.findElement(By.cssSelector("button[type='submit']"));
        act.type(ValidatePhoneNumber, number);
        act.click(driver,ele1);
        return new VerificationPage();
    }
    
    public OnbordingPage ClickOnActiveLineLink() {
        act.click(driver,ValidateClickOnActiveLine);
        return new OnbordingPage();
    }
    
    public TermsAndConditionPage ValidateClickOnTermsAndCondition() {
        act.click(driver, ValidateClickOnTermsAndCondition);
        return new TermsAndConditionPage();
    }
    
    public privacyPolicyPage ValidateClickOnPrivacyPolicy() {
        act.click(driver, ValidateClickOnPrivatePilocy);
        return new privacyPolicyPage();
    }
	
	

}
