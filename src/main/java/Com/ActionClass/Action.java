package Com.ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Com.Base.BaseClass;

public class Action extends BaseClass
{

	public static void scrollByIndex(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void click(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	public boolean findElement(WebDriver driver, WebElement element)
	{
		boolean flag=false;
		try {
			element.isDisplayed();
			flag=true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Location is not found :" +element);
			flag=false;
		}
		finally {
			if(flag)
			{
				System.out.println("The element found at");
			}
			else {
				System.out.println("The element is not displayed");
			}
		}
		return flag;

	}
	public boolean isDispayed(WebDriver driver, WebElement element)
	{
		boolean flag=false;
		flag = findElement(driver,element);
		if(flag)
		{
			flag=element.isDisplayed();
			if(flag)
			{
				System.out.println("The element is displayed");
			}
			else
			{
				System.out.println("The element is not displayed");
			}
		}
		else
		{
			System.out.println("Not Displayed");
		}
		return flag;
	}
	public boolean isEnabled(WebDriver driver, WebElement element)
	{
		boolean flag=false;
		flag=findElement(driver, element);
		if(flag)
		{
			flag=element.isEnabled();
			if(flag)
			{
				System.out.println("The element is enabled");
			}
			else
			{
				System.out.println("The element is not enabled");
			}
		}
		else
		{
			System.out.println("Not Enabled");
		}
		return flag;
	}

	public boolean isSelected(WebDriver driver,WebElement element)
	{
		boolean flag=false;
		flag=findElement(driver, element);

		if(flag)
		{
			flag=element.isSelected();
			if(flag)
			{
				System.out.println("The element is selectable");
			}
			else
			{
				System.out.println("The element is not selectable");
			}
		}
		else
		{
			System.out.println("Not Selectable");
		}
		return flag;
	}
	public boolean type(WebElement element, String text)
	{
		boolean flag=false;
		try {
			flag=element.isDisplayed();
			Thread.sleep(5000);
			if(flag) {
				element.sendKeys(text);
			}

			flag=true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Location not found :" +e);
			flag=false;
		}
		finally {
			if(flag)
			{
				System.out.println("Sucessfully entared value");
			}
			else {
				System.out.println("Unable to locate the element");
			}
		}
		return flag;

	}
	public boolean selectBySendkeys(String text, WebElement element)
	{
		boolean flag=false;
		try {
			element.sendKeys(text);
			flag=true;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if (flag) {
				System.out.println("select the value from dropdown");
			}
			else
			{
				System.out.println("Not selected value from dropdown");
			}
		}
	}
	public boolean selectByIndex(WebElement element, int index)
	{
		boolean flag =false;
		try {
			Select sc= new Select(element);
			sc.selectByIndex(index);
			flag=true;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if(flag)
			{
				System.out.println("Option selected by index");
			}
			else
			{
				System.out.println("Option Not selected by index");
			}
		}
	}
	public boolean SelectByValue(WebElement element, String value)
	{

		boolean flag=false;
		try {
			Select sc=new Select(element);
			sc.selectByValue(value);
			flag=true;
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if (flag) {

				System.out.println("Option selected by value");

			}
			else
			{
				System.out.println("Option Not selected by value");
			}
		}
	}
	public boolean SelectByVisibleText(WebElement element ,String VisibleText)
	{
		boolean flag=false;
		try {
			Select sc=new Select(element);
			sc.selectByVisibleText(VisibleText);
			flag= true;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			if (flag) {
				System.out.println("Option selected by visibleText");
			}
			else
			{
				System.out.println("Option not selected by visibleText");
			}
		}
	}
}


