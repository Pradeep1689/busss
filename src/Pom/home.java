package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {


	@FindBy(xpath="//input[@type='password']")
		private WebElement ele3;
		
		@FindBy(xpath="(//span[.='Next'])[2]")
		private WebElement ele4;
		
		public home(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	public void password(String pwd)
	{
		ele3.sendKeys(pwd);
	}
	public void next1()
	{
		ele4.click();
	}
}
