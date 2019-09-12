package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmail {

	@FindBy(id="identifierId")
		private WebElement ele;
		
		@FindBy(xpath="(//span[.='Next'])[1]")
		private WebElement ele1;
		
		public gmail(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	public void email(String un)
	{
		ele.sendKeys(un);
	}
	public void next()
	{
		ele1.click();
	}
	

}
